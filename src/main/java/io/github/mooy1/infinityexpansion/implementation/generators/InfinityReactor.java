package io.github.mooy1.infinityexpansion.implementation.generators;

import io.github.mooy1.infinityexpansion.categories.Categories;
import io.github.mooy1.infinityexpansion.implementation.SlimefunExtension;
import io.github.mooy1.infinityexpansion.implementation.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.implementation.materials.Items;
import io.github.mooy1.infinitylib.items.LoreUtils;
import io.github.mooy1.infinitylib.items.StackUtils;
import io.github.mooy1.infinitylib.slimefun.abstracts.AbstractContainer;
import io.github.mooy1.infinitylib.slimefun.presets.LorePreset;
import io.github.mooy1.infinitylib.slimefun.presets.MenuPreset;
import io.github.mooy1.infinitylib.slimefun.utils.TickerUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * A reactor that generates huge power but costs infinity ingots and void ingots
 *
 * @author Mooy1
 */
public final class InfinityReactor extends AbstractContainer implements EnergyNetProvider, RecipeDisplayItem {
    
    public static final SlimefunItemStack ITEM = new SlimefunItemStack(
            "INFINITY_REACTOR",
            Material.BEACON,
            "&b無限反應爐",
            "&7通過壓縮發電",
            "&7於&8虛無&7和&b無限&7錠",
            "",
            LorePreset.energyBuffer(InfinityReactor.STORAGE),
            LorePreset.energyPerSecond(InfinityReactor.ENERGY)
    );
    
    public static final int ENERGY = 90_000;
    public static final int STORAGE = 90_000_000;
    public static final int INFINITY_INTERVAL = (int) (86400 * TickerUtils.TPS); 
    public static final int VOID_INTERVAL = (int) (14400 * TickerUtils.TPS);
    public static final int[] INPUT_SLOTS = {
            MenuPreset.slot1, MenuPreset.slot3
    };
    public static final int STATUS_SLOT = MenuPreset.slot2;

    public InfinityReactor() {
        super(Categories.INFINITY_CHEAT, ITEM, InfinityWorkbench.TYPE, new ItemStack[]  {
                null, Items.INFINITY, Items.INFINITY, Items.INFINITY, Items.INFINITY, null,
                Items.INFINITY, Items.INFINITY, Items.VOID_INGOT, Items.VOID_INGOT, Items.INFINITY, Items.INFINITY,
                Items.INFINITY, Items.MACHINE_PLATE, Items.MACHINE_PLATE, Items.MACHINE_PLATE, Items.MACHINE_PLATE, Items.INFINITY,
                Items.INFINITY, Items.MACHINE_PLATE, SlimefunExtension.ADVANCED_NETHER_STAR_REACTOR, SlimefunExtension.ADVANCED_NETHER_STAR_REACTOR, Items.MACHINE_PLATE, Items.INFINITY,
                Items.INFINITY, Items.MACHINE_PLATE, Items.MACHINE_PLATE, Items.MACHINE_PLATE, Items.MACHINE_PLATE, Items.INFINITY,
                Items.INFINITY, Items.INFINITE_CIRCUIT, Items.INFINITE_CORE, Items.INFINITE_CORE, Items.INFINITE_CIRCUIT, Items.INFINITY
        });
    }
    
    @Override
    public void onNewInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
        if (BlockStorage.getLocationInfo(b.getLocation(), "progress") == null) {
            BlockStorage.addBlockInfo(b, "progress", "0");
        }
    }

    @Override
    protected void onBreak(@Nonnull BlockBreakEvent e, @Nonnull BlockMenu inv, @Nonnull Location l) {
        inv.dropItems(l, INPUT_SLOTS);
    }

    @Override
    public void setupMenu(@Nonnull BlockMenuPreset blockMenuPreset) {
        for (int i : MenuPreset.slotChunk2) {
            blockMenuPreset.addItem(i, MenuPreset.borderItemStatus, ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : MenuPreset.slotChunk3) {
            blockMenuPreset.addItem(i, new CustomItem(
                    Material.BLACK_STAINED_GLASS_PANE, "&8放入虛空錠"), ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : MenuPreset.slotChunk1) {
            blockMenuPreset.addItem(i, new CustomItem(
                    Material.WHITE_STAINED_GLASS_PANE, "&f放入無限錠"), ChestMenuUtils.getEmptyClickHandler());
        }
        blockMenuPreset.addItem(STATUS_SLOT, MenuPreset.loadingItemRed, ChestMenuUtils.getEmptyClickHandler());
    }
    
    @Override
    public int[] getTransportSlots(@Nonnull DirtyChestMenu menu, @Nonnull ItemTransportFlow flow, @Nonnull ItemStack item) {
        if (flow == ItemTransportFlow.INSERT) {
            String input = StackUtils.getID(item);
            if (Items.VOID_INGOT.getItemId().equals(input)) {
                return new int[] {INPUT_SLOTS[1]};
            } else if (Items.INFINITY.getItemId().equals(input)) {
                return new int[] {INPUT_SLOTS[0]};
            }
        }

        return new int[0];
    }
    
    @Override
    public int getGeneratedOutput(@Nonnull Location l, @Nonnull Config config) {
        BlockMenu inv = BlockStorage.getInventory(l);

        int progress = Integer.parseInt(BlockStorage.getLocationInfo(l, "progress"));
        ItemStack infinityInput = inv.getItemInSlot(INPUT_SLOTS[0]);
        ItemStack voidInput = inv.getItemInSlot(INPUT_SLOTS[1]);

        if (progress == 0) { //need infinity + void

            if (infinityInput == null || !Items.INFINITY.getItemId().equals(StackUtils.getID(infinityInput))) { //wrong input

                if (inv.hasViewer()) {
                    inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c放入更多的&f無限錠"));
                }
                return 0;

            }
            
            if (voidInput == null || !Items.VOID_INGOT.getItemId().equals(StackUtils.getID(voidInput))) { //wrong input

                if (inv.hasViewer()) {
                    inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c放入更多的&8虛空錠"));
                }
                return 0;

            } 
            
            //correct input
            if (inv.hasViewer()) {
                inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.LIME_STAINED_GLASS_PANE,
                                "&a開始發電",
                                "&a直到需要無限錠的時間: " + INFINITY_INTERVAL,
                                "&a直到需要虛空錠的時間: " + VOID_INTERVAL
                        ));
            }
            inv.consumeItem(INPUT_SLOTS[0]);
            inv.consumeItem(INPUT_SLOTS[1]);
            BlockStorage.addBlockInfo(l, "progress", "1");
            return ENERGY;
            
        }
        
        if (progress >= INFINITY_INTERVAL) { //done

            if (inv.hasViewer()) {
                inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.LIME_STAINED_GLASS_PANE, "&a完成發電"));
            }
            BlockStorage.addBlockInfo(l, "progress", "0");
            return ENERGY;

        } 
        
        if (Math.floorMod(progress, VOID_INTERVAL) == 0) { //need void

            if (voidInput == null || !Items.VOID_INGOT.getItemId().equals(StackUtils.getID(voidInput))) { //wrong input

                if (inv.hasViewer()) {
                    inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c放入更多的&8虛空錠"));
                }
                return 0;

            }
            
            //right input
            if (inv.hasViewer()) {
                inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.LIME_STAINED_GLASS_PANE,
                                "&a發電中...",
                                "&a直到需要無限錠的時間: " + (INFINITY_INTERVAL - progress),
                                "&a直到需要虛空錠的時間: " + (VOID_INTERVAL - Math.floorMod(progress, VOID_INTERVAL))
                        ));
            }
            BlockStorage.addBlockInfo(l, "progress", String.valueOf(progress + 1));
            inv.consumeItem(INPUT_SLOTS[1]);
            return ENERGY;

        } 
        
        //generate

        if (inv.hasViewer()) {
            inv.replaceExistingItem(STATUS_SLOT, new CustomItem(Material.LIME_STAINED_GLASS_PANE,
                            "&a發電中...",
                            "&a直到需要無限錠的時間: " + (INFINITY_INTERVAL - progress),
                            "&a直到需要虛空錠的時間: " + (VOID_INTERVAL - Math.floorMod(progress, VOID_INTERVAL))
                    )
            );
        }
        BlockStorage.addBlockInfo(l, "progress", String.valueOf(progress + 1));
        return ENERGY;
    }

    @Override
    public int getCapacity() {
        return STORAGE;
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();

        ItemStack item = Items.INFINITY.clone();
        LoreUtils.addLore(item, "", ChatColor.GOLD + "持續1天");
        items.add(item);
        items.add(null);

        item = Items.VOID_INGOT.clone();
        LoreUtils.addLore(item, "", ChatColor.GOLD + "持續4小時");
        items.add(item);
        items.add(null);

        return items;
    }

}
