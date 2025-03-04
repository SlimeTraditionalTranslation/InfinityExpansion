package io.github.mooy1.infinityexpansion.categories;

import org.bukkit.Material;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

/**
 * Categories for this addon
 *
 * @author Mooy1
 */
public final class Groups {

    public static final ItemGroup INFINITY = new InfinityGroup(InfinityExpansion.createKey("infinity_recipes"),
            new CustomItemStack(Material.RESPAWN_ANCHOR, "&b無限&7配方"), 3);
    public static final ItemGroup MAIN_MATERIALS = new SubGroup("main_materials",
            new CustomItemStack(Material.NETHER_STAR, "&b無限&7材料"));
    public static final ItemGroup BASIC_MACHINES = new SubGroup("basic_machines",
            new CustomItemStack(Material.LOOM, "&9基礎&7機器"));
    public static final ItemGroup ADVANCED_MACHINES = new SubGroup("advanced_machines",
            new CustomItemStack(Material.BLAST_FURNACE, "&c進階&7機器"));
    public static final ItemGroup STORAGE = new SubGroup("storage",
            new CustomItemStack(Material.BEEHIVE, "&6儲存"));
    public static final ItemGroup MOB_SIMULATION = new SubGroup("mob_simulation",
            new CustomItemStack(Material.BEACON, "&b怪物模擬"));
    public static final ItemGroup INFINITY_MATERIALS = new SubGroup("infinity_materials",
            new CustomItemStack(Material.NETHERITE_BLOCK, "&b無限&a材料"));
    public static final ItemGroup MAIN_CATEGORY = new MultiGroup("main",
            new CustomItemStack(Material.NETHER_STAR, "&b無限&7附加"), 3,
            MAIN_MATERIALS, BASIC_MACHINES, ADVANCED_MACHINES, STORAGE, MOB_SIMULATION, INFINITY_MATERIALS, INFINITY);
    public static final ItemGroup INFINITY_CHEAT = new SubGroup("infinity_cheat",
            new CustomItemStack(Material.RESPAWN_ANCHOR, "&b無限&7配方 &c- 不正確的配方"));

    public static void setup(InfinityExpansion inst) {
        INFINITY.register(inst);
        MAIN_CATEGORY.register(inst);
        MOB_SIMULATION.setCrossAddonItemGroup(true);
        INFINITY_CHEAT.register(inst);
    }

}