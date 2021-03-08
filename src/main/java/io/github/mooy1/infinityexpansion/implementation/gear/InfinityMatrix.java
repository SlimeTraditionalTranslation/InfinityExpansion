package io.github.mooy1.infinityexpansion.implementation.gear;

import io.github.mooy1.infinityexpansion.implementation.materials.Items;
import io.github.mooy1.infinityexpansion.implementation.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.categories.Categories;
import io.github.mooy1.infinitylib.PluginUtils;
import io.github.mooy1.infinitylib.player.MessageUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.util.Iterator;
import java.util.List;

/**
 * Flight
 * 
 */
public final class InfinityMatrix extends SimpleSlimefunItem<ItemUseHandler> implements Listener, Soulbound, NotPlaceable {
    
    public static final SlimefunItemStack ITEM = new SlimefunItemStack(
            "INFINITY_MATRIX",
            Material.NETHER_STAR,
            "&f無限矩陣",
            "&6給予你無限飛行",
            "&7右鍵點擊以 啟用/關閉與聲明",
            "&7蹲下並右鍵 來移除所有權",
            "&b靈魂綁定"
    );
    
    public InfinityMatrix() {
        super(Categories.INFINITY_CHEAT, ITEM, InfinityWorkbench.TYPE, new ItemStack[] {
                Items.INFINITY, null, Items.INFINITY, Items.INFINITY, null, Items.INFINITY,
                Items.INFINITY, Items.VOID_INGOT, Items.VOID_INGOT, Items.VOID_INGOT, Items.VOID_INGOT, Items.INFINITY,
                Items.VOID_INGOT, Items.VOID_INGOT, new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA), Items.VOID_INGOT, Items.VOID_INGOT,
                Items.VOID_INGOT, Items.VOID_INGOT, Items.INFINITY, Items.INFINITY, Items.VOID_INGOT, Items.VOID_INGOT,
                Items.INFINITY, Items.VOID_INGOT, Items.VOID_INGOT, Items.VOID_INGOT, Items.VOID_INGOT, Items.INFINITY,
                Items.INFINITY, null, Items.INFINITY, Items.INFINITY, null, Items.INFINITY
        });
        PluginUtils.registerListener(this);
    }

    private static void disableFlight(Player p) {
        MessageUtils.message(p, ChatColor.RED + "無限飛行已關閉!");
        p.setAllowFlight(false);
    }

    private static void enableFlight(Player p) {
        MessageUtils.message(p, ChatColor.GREEN + "無限飛行已啟用!");
        p.setAllowFlight(true);
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            ItemStack item = e.getItem();
            ItemMeta meta = item.getItemMeta();
            List<String> lore = meta.getLore();
            if (lore == null) {
                return;
            }

            Player p = e.getPlayer();

            Iterator<String> iterator = lore.listIterator();

            while (iterator.hasNext()) {
                String line = iterator.next();

                if (ChatColor.stripColor(line).contains("UUID: ")) {
                    String uuid = ChatColor.stripColor(line).substring(6);

                    if (!p.getUniqueId().toString().equals(uuid)) {
                        MessageUtils.message(p, ChatColor.YELLOW + "你並不擁有此矩陣!");
                        return;
                    }

                    if (p.isSneaking()) { //remove owner
                        iterator.remove();
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        MessageUtils.message(p, ChatColor.GOLD + "所有權已移除!");
                        disableFlight(p);

                    } else if (p.getAllowFlight()) {
                        disableFlight(p);
                    } else {
                        enableFlight(p);
                    }

                    return;
                }
            }

            lore.add(ChatColor.GREEN + "UUID: " + p.getUniqueId().toString());
            meta.setLore(lore);
            item.setItemMeta(meta);
            MessageUtils.message(p, ChatColor.GOLD + "所有權已聲明!");
            enableFlight(p);
        };
    }

}