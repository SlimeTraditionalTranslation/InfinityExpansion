package io.github.mooy1.infinityexpansion.implementation.materials;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Categories;
import io.github.mooy1.infinityexpansion.implementation.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.implementation.machines.VoidHarvester;
import io.github.mooy1.infinitylib.slimefun.presets.RecipePreset;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

@UtilityClass
public final class Items {

    public static void setup() {
        registerEnhanced(COBBLE_1, RecipePreset.Compress(new ItemStack(Material.COBBLESTONE)));
        registerEnhanced(COBBLE_2, RecipePreset.Compress(COBBLE_1));
        registerEnhanced(COBBLE_3, RecipePreset.Compress(COBBLE_2));
        registerEnhanced(COBBLE_4, RecipePreset.Compress(COBBLE_3));
        registerEnhanced(COBBLE_5, RecipePreset.Compress(COBBLE_4));
        registerEnhanced(VOID_DUST, RecipePreset.Compress(VOID_BIT));
        registerEnhanced(VOID_INGOT, RecipePreset.Compress(VOID_DUST));
        registerSmeltery(INFINITY, EARTH, MYTHRIL, FORTUNE, MAGIC, VOID_INGOT, METAL);
        registerSmeltery(FORTUNE, Singularity.GOLD, Singularity.DIAMOND, Singularity.EMERALD, Singularity.NETHERITE, ADAMANTITE);
        registerSmeltery(MAGIC, Singularity.REDSTONE, Singularity.LAPIS, Singularity.QUARTZ, Singularity.MAGNESIUM, MAGNONIUM);
        registerSmeltery(EARTH, COBBLE_4, Singularity.COAL, Singularity.IRON, Singularity.COPPER, Singularity.LEAD);
        registerSmeltery(METAL, Singularity.SILVER, Singularity.ALUMINUM, Singularity.TIN, Singularity.ZINC, TITANIUM);
        registerSmeltery(MAGSTEEL, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.MAGNESIUM_DUST);
        registerSmeltery(TITANIUM, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.HARDENED_METAL_INGOT);
        registerSmeltery(MYTHRIL, SlimefunItems.REINFORCED_ALLOY_INGOT,Singularity.IRON, SlimefunItems.HARDENED_METAL_INGOT);
        registerSmeltery(ADAMANTITE, SlimefunItems.REDSTONE_ALLOY, Singularity.DIAMOND,MAGSTEEL);
        registerSmeltery(MAGNONIUM, MAGSTEEL,Singularity.MAGNESIUM, EnderEssence.ITEM);
        register(VOID_BIT, VoidHarvester.TYPE, new ItemStack[0]);
        registerEnhanced(MAGSTEEL_PLATE, new ItemStack[] {
                MAGSTEEL, MAGSTEEL, MAGSTEEL,
                MAGSTEEL, SlimefunItems.HARDENED_METAL_INGOT, MAGSTEEL,
                MAGSTEEL, MAGSTEEL, MAGSTEEL
        });
        registerEnhanced(MACHINE_CIRCUIT, new ItemStack[] {
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.SILICON, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.COPPER_INGOT
        });
        registerEnhanced(MACHINE_CORE, new ItemStack[] {
                TITANIUM, MACHINE_CIRCUIT, TITANIUM,
                MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CIRCUIT,
                TITANIUM, MACHINE_CIRCUIT, TITANIUM
        });
        registerEnhanced(MACHINE_PLATE, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT,
                MAGSTEEL_PLATE, TITANIUM, MAGSTEEL_PLATE,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT
        });
        register(Categories.INFINITY_CHEAT, INFINITE_CIRCUIT, InfinityWorkbench.TYPE, new ItemStack[] {
                MACHINE_CIRCUIT, INFINITY, MACHINE_CIRCUIT, MACHINE_CIRCUIT, INFINITY, MACHINE_CIRCUIT,
                VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT, VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT,
                INFINITY, VOID_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, VOID_INGOT, INFINITY,
                INFINITY, VOID_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, VOID_INGOT, INFINITY,
                VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT, VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT,
                MACHINE_CIRCUIT, INFINITY, MACHINE_CIRCUIT, MACHINE_CIRCUIT, INFINITY, MACHINE_CIRCUIT
        });
        register(Categories.INFINITY_CHEAT, INFINITE_CORE, InfinityWorkbench.TYPE, new ItemStack[] {
                MACHINE_PLATE, MACHINE_CORE, INFINITY, INFINITY, MACHINE_CORE, MACHINE_PLATE,
                MACHINE_CORE, MACHINE_PLATE, MACHINE_CIRCUIT, MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CORE,
                INFINITY, MACHINE_CIRCUIT, INFINITY, INFINITY, MACHINE_CIRCUIT, INFINITY,
                INFINITY, MACHINE_CIRCUIT, INFINITY, INFINITY, MACHINE_CIRCUIT, INFINITY,
                MACHINE_CORE, MACHINE_PLATE, MACHINE_CIRCUIT, MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CORE,
                MACHINE_PLATE, MACHINE_CORE, INFINITY, INFINITY, MACHINE_CORE, MACHINE_PLATE
        });
    }
    
    private static void registerEnhanced(SlimefunItemStack item, ItemStack[] recipe) {
        register(item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    }
    
    private static void registerSmeltery(SlimefunItemStack itemStack, ItemStack... recipe) {
        register(itemStack, RecipeType.SMELTERY, Arrays.copyOf(recipe, 9));
    }
    
    private static void register(SlimefunItemStack itemStack, RecipeType type, ItemStack[] recipe) {
        register(Categories.MAIN_MATERIALS, itemStack, type, recipe);
    }
    
    private static void register(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        new SlimefunItem(category, item, recipeType, recipe).register(InfinityExpansion.inst());
    }
    
    public static final SlimefunItemStack INFINITE_CIRCUIT = new SlimefunItemStack(
            "INFINITE_MACHINE_CIRCUIT",
            Material.DIAMOND,
            "&b無限&6機器電路板",
            "&7機器組件"
    );
    public static final SlimefunItemStack INFINITE_CORE = new SlimefunItemStack(
            "INFINITE_MACHINE_CORE",
            Material.DIAMOND_BLOCK,
            "&b無限機器核心",
            "&7機器組件"
    );
    public static final SlimefunItemStack MAGSTEEL_PLATE = new SlimefunItemStack(
            "MAGSTEEL_PLATE",
            Material.NETHERITE_SCRAP,
            "&4鎂鋼板",
            "&7機器組件"
    );
    public static final SlimefunItemStack MACHINE_PLATE = new SlimefunItemStack(
            "MACHINE_PLATE",
            Material.PAPER,
            "&f機器板",
            "&7機器組件"
    );
    public static final SlimefunItemStack MACHINE_CIRCUIT = new SlimefunItemStack(
            "MACHINE_CIRCUIT",
            Material.GOLD_INGOT,
            "&6機器電路板",
            "&7機器組件"
    );

    public static final SlimefunItemStack MACHINE_CORE = new SlimefunItemStack(
            "MACHINE_CORE",
            Material.IRON_BLOCK,
            "&f機器核心",
            "&7機器組件"
    );
    public static final SlimefunItemStack VOID_BIT = new SlimefunItemStack(
            "VOID_BIT",
            Material.IRON_NUGGET,
            "&8虛空之點",
            "&7&o感覺就像是... 虛無"
    );
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
    public static final SlimefunItemStack MAGSTEEL = new SlimefunItemStack(
            "MAGSTEEL",
            Material.BRICK,
            "&4鎂鋼"
    );
    public static final SlimefunItemStack MAGNONIUM = new SlimefunItemStack(
            "MAGNONIUM",
            Material.NETHER_BRICK,
            "&5磁振子元素"
    );
    public static final SlimefunItemStack TITANIUM = new SlimefunItemStack(
            "TITANIUM",
            Material.IRON_INGOT,
            "&7鈦"
    );
    public static final SlimefunItemStack MYTHRIL = new SlimefunItemStack(
            "MYTHRIL",
            Material.IRON_INGOT,
            "&b秘銀"
    );
    public static final SlimefunItemStack ADAMANTITE = new SlimefunItemStack(
            "ADAMANTITE",
            Material.BRICK,
            "&d精金"
    );
    public static final SlimefunItemStack INFINITY = new SlimefunItemStack(
            "INFINITE_INGOT",
            Material.IRON_INGOT,
            "&b無限錠", // &dI&cn&6f&ei&an&bi&3t&9y &fIngot
            "&7&o宇宙之怒",
            "&7&o在手裡掌握著"
    );
    public static final SlimefunItemStack FORTUNE = new SlimefunItemStack(
            "FORTUNE_SINGULARITY",
            Material.NETHER_STAR,
            "&6幸運奇點"
    );
    public static final SlimefunItemStack EARTH = new SlimefunItemStack(
            "EARTH_SINGULARITY",
            Material.NETHER_STAR,
            "&a地球奇點"
    );
    public static final SlimefunItemStack METAL = new SlimefunItemStack(
            "METAL_SINGULARITY",
            Material.NETHER_STAR,
            "&8金屬奇點"
    );
    public static final SlimefunItemStack MAGIC = new SlimefunItemStack(
            "MAGIC_SINGULARITY",
            Material.NETHER_STAR,
            "&d魔法奇點"
    );
    
}
