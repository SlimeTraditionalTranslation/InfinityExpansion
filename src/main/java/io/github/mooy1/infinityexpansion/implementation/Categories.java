package io.github.mooy1.infinityexpansion.implementation;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinitylib.slimefun.utils.MultiCategory;
import io.github.mooy1.infinitylib.slimefun.utils.SubCategory;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;

/**
 * Categories for this addon
 *
 * @author Mooy1
 */
public final class Categories {
    
    public static final Category INFINITY_CATEGORY = new InfinityCategory(InfinityExpansion.inst().getKey("infinity_recipes"),
            new CustomItem(Material.RESPAWN_ANCHOR, "&b無限&7配方"), 3
    );
    public static final Category MAIN_MATERIALS = new SubCategory(InfinityExpansion.inst().getKey("main_materials"), 
            new CustomItem(Material.NETHER_STAR, "&b無限&7材料")
    );
    public static final Category BASIC_MACHINES = new SubCategory(InfinityExpansion.inst().getKey("basic_machines"),
            new CustomItem(Material.LOOM, "&9基礎&7機器")
    );
    public static final Category ADVANCED_MACHINES = new SubCategory(InfinityExpansion.inst().getKey("advanced_machines"),
            new CustomItem(Material.BLAST_FURNACE, "&c進階&7機器")
    );
    public static final Category STORAGE = new SubCategory(InfinityExpansion.inst().getKey("storage"),
            new CustomItem(Material.BEEHIVE, "&6儲存")
    );
    public static final Category MOB_SIMULATION = new SubCategory(InfinityExpansion.inst().getKey("mob_simulation"),
            new CustomItem(Material.BEACON, "&b怪物模擬")
    );
    public static final Category INFINITY_MATERIALS = new SubCategory(InfinityExpansion.inst().getKey("infinity_materials"),
            new CustomItem(Material.NETHERITE_BLOCK, "&b無限&a材料")
    );
    public static final Category MAIN_CATEGORY = new MultiCategory(InfinityExpansion.inst().getKey("main"),
            new CustomItem(Material.NETHER_STAR, "&b無限&7附加"), 3,
            MAIN_MATERIALS, BASIC_MACHINES, ADVANCED_MACHINES, STORAGE, MOB_SIMULATION, INFINITY_MATERIALS, INFINITY_CATEGORY
    );
    public static final Category INFINITY_CHEAT = new SubCategory(InfinityExpansion.inst().getKey("infinity_cheat"),
            new CustomItem(Material.RESPAWN_ANCHOR, "&b無限&7配方 &c- 不正確的配方")
    );
    
}