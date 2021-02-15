package io.github.mooy1.infinityexpansion.implementation.materials;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinitylib.presets.RecipePreset;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class CompressedItem extends MachineItem {
    
    public static final SlimefunItemStack VOID_DUST = new SlimefunItemStack(
            "VOID_DUST",
            Material.GUNPOWDER,
            "&8虛空粉",
            "&7&o它開始形成..."
    );
    public static final SlimefunItemStack VOID_INGOT = new SlimefunItemStack(
            "VOID_INGOT",
            Material.NETHERITE_INGOT,
            "&8虛空錠",
            "&7&o宇宙中的虛無",
            "&7&o就在你手掌中"
    );
    public static final SlimefunItemStack COBBLE_1 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_1",
            Material.ANDESITE,
            "&7單壓縮鵝卵石",
            "&89個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_2 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_2",
            Material.ANDESITE,
            "&7雙重壓縮鵝卵石",
            "&881個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_3 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_3",
            Material.STONE,
            "&7三重壓縮鵝卵石",
            "&8729個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_4 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_4",
            Material.STONE,
            "&7四重壓縮鵝卵石",
            "&86,561個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_5 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_5",
            Material.POLISHED_ANDESITE,
            "&7五重壓縮鵝卵石",
            "&859,049個鵝卵石結合而成"
    );
    
    public static void setup(InfinityExpansion plugin) {
        new CompressedItem(COBBLE_1, new ItemStack(Material.COBBLESTONE)).register(plugin);
        new CompressedItem(COBBLE_2, COBBLE_1).register(plugin);
        new CompressedItem(COBBLE_3, COBBLE_2).register(plugin);
        new CompressedItem(COBBLE_4, COBBLE_3).register(plugin);
        new CompressedItem(COBBLE_5, COBBLE_4).register(plugin);
        new CompressedItem(VOID_DUST, MiscItem.VOID_BIT).register(plugin);
        new CompressedItem(VOID_INGOT, VOID_DUST).register(plugin);
    }
    
    CompressedItem(SlimefunItemStack item, ItemStack recipe) {
        super(item, RecipePreset.Compress(recipe));
    }

}
