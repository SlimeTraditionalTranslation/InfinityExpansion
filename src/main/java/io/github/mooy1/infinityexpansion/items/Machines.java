package io.github.mooy1.infinityexpansion.items;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.machines.ConversionMachine;
import io.github.mooy1.infinityexpansion.items.machines.GearTransformer;
import io.github.mooy1.infinityexpansion.items.machines.GeoQuarry;
import io.github.mooy1.infinityexpansion.items.machines.GrowingMachine;
import io.github.mooy1.infinityexpansion.items.machines.MaterialGenerator;
import io.github.mooy1.infinityexpansion.items.machines.PoweredBedrock;
import io.github.mooy1.infinityexpansion.items.machines.ResourceSynthesizer;
import io.github.mooy1.infinityexpansion.items.machines.SingularityConstructor;
import io.github.mooy1.infinityexpansion.items.machines.StoneworksFactory;
import io.github.mooy1.infinityexpansion.items.machines.VoidHarvester;
import io.github.mooy1.infinitylib.presets.LorePreset;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

@UtilityClass
public final class Machines {

    public static final SlimefunItemStack COBBLE_PRESS = new SlimefunItemStack(
            "COBBLE_PRESS",
            Material.SMOOTH_STONE,
            "&8鵝卵石壓縮機",
            "&7更有效率的壓縮鵝卵石",
            "",
            LorePreset.energyPerSecond(120)
    );
    public static final SlimefunItemStack RESOURCE_SYNTHESIZER = new SlimefunItemStack(
            "RESOURCE_SYNTHESIZER",
            Material.LODESTONE,
            "&6資源合成器",
            "&7結合2個奇點創造資源",
            "",
            LorePreset.energy(1_000_000) + "次使用"
    );
    public static final SlimefunItemStack BASIC_GROWER = new SlimefunItemStack(
            "BASIC_VIRTUAL_FARM",
            Material.GRASS_BLOCK,
            "&9基本&a虛擬農場",
            "&7自動種植, 收割與重新種植農作物",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(18)
    );
    public static final SlimefunItemStack ADVANCED_GROWER = new SlimefunItemStack(
            "ADVANCED_VIRTUAL_FARM",
            Material.CRIMSON_NYLIUM,
            "&c高級&a虛擬農場",
            "&7自動種植, 收割與重新種植農作物",
            "",
            LorePreset.speed(5),
            LorePreset.energyPerSecond(90)
    );
    public static final SlimefunItemStack INFINITY_GROWER = new SlimefunItemStack(
            "INFINITY_VIRTUAL_FARM",
            Material.WARPED_NYLIUM,
            "&b無限&a虛擬農場",
            "&7自動種植, 收割與重新種植農作物",
            "",
            LorePreset.speed(25),
            LorePreset.energyPerSecond(900)
    );
    public static final SlimefunItemStack BASIC_TREE = new SlimefunItemStack(
            "BASIC_TREE_GROWER",
            Material.STRIPPED_OAK_WOOD,
            "&9基本&2虛擬植樹場",
            "&7自動成長, 收成和重新種植樹木",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(36)
    );
    public static final SlimefunItemStack ADVANCED_TREE = new SlimefunItemStack(
            "ADVANCED_TREE_GROWER",
            Material.STRIPPED_ACACIA_WOOD,
            "&c高級&2虛擬植樹場",
            "&7自動成長, 收成和重新種植樹木",
            "",
            LorePreset.speed(5),
            LorePreset.energyPerSecond(180)
    );
    public static final SlimefunItemStack INFINITY_TREE = new SlimefunItemStack(
            "INFINITY_TREE_GROWER",
            Material.STRIPPED_WARPED_HYPHAE,
            "&b無限&2虛擬植樹場",
            "&7自動成長, 收成和重新種植樹木",
            "",
            LorePreset.speed(25),
            LorePreset.energyPerSecond(1800)
    );
    private static final int BEDROCK_ENERGY = 10_000;
    public static final SlimefunItemStack POWERED_BEDROCK = new SlimefunItemStack(
            "POWERED_BEDROCK",
            Material.NETHERITE_BLOCK,
            "&4電動基岩",
            "&7當通電時, 將會轉化成基岩",
            "&7斷電或破壞後還原",
            "",
            LorePreset.energyPerSecond(BEDROCK_ENERGY)
    );
    private static final int GEO_QUARRY_INTERVAL = 400;
    private static final int GEO_QUARRY_ENERGY = 450;
    public static final SlimefunItemStack GEO_QUARRY = new SlimefunItemStack(
            "GEO_QUARRY",
            Material.QUARTZ_BRICKS,
            "&fGeo採石場",
            "&7緩慢的使用能量採集虛空中的Geo資源",
            "",
            LorePreset.energyPerSecond(GEO_QUARRY_ENERGY)
    );
    public static final SlimefunItemStack EXTREME_FREEZER = new SlimefunItemStack(
            "EXTREME_FREEZER",
            Material.LIGHT_BLUE_CONCRETE,
            "&b極致冷凍機",
            "&7將冰轉化成冷卻單元",
            "",
            LorePreset.energyPerSecond(90)
    );
    public static final SlimefunItemStack DUST_EXTRACTOR = new SlimefunItemStack(
            "DUST_EXTRACTOR",
            Material.FURNACE,
            "&8粉抽取機",
            "&7將鵝卵石轉化成粉",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITY_DUST_EXTRACTOR = new SlimefunItemStack(
            "INFINITY_DUST_EXTRACTOR",
            Material.FURNACE,
            "&b無限&8粉抽取機",
            "&7將鵝卵石轉化成粉",
            "",
            LorePreset.speed(16),
            LorePreset.energyPerSecond(7200)
    );
    public static final SlimefunItemStack INGOT_FORMER = new SlimefunItemStack(
            "INGOT_FORMER",
            Material.FURNACE,
            "&8金屬製錠機",
            "&7將粉加工成錠",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITY_INGOT_FORMER = new SlimefunItemStack(
            "INFINITY_INGOT_FORMER",
            Material.FURNACE,
            "&b無限&8金屬製錠機",
            "&7將粉加工成錠",
            "",
            LorePreset.speed(16),
            LorePreset.energyPerSecond(7200)
    );
    public static final SlimefunItemStack URANIUM_EXTRACTOR = new SlimefunItemStack(
            "URANIUM_EXTRACTOR",
            Material.LIME_CONCRETE,
            "&a鈾提取機",
            "&7將鵝卵石轉化成鈾",
            "",
            LorePreset.energyPerSecond(240)
    );
    public static final SlimefunItemStack DECOMPRESSOR = new SlimefunItemStack(
            "DECOMPRESSOR",
            Material.TARGET,
            "&7解壓縮器",
            "&7還原方塊至它原本的材料",
            "",
            LorePreset.energyPerSecond(60)
    );
    private static final int GEAR_TRANSFORMER_ENERGY = 12000;
    public static final SlimefunItemStack GEAR_TRANSFORMER = new SlimefunItemStack(
            "GEAR_TRANSFORMER",
            Material.EMERALD_BLOCK,
            "&7裝備變壓機",
            "&7改變原版工具和裝備的材料",
            "",
            LorePreset.energy(GEAR_TRANSFORMER_ENERGY) + "次使用"
    );
    public static final SlimefunItemStack BASIC_COBBLE = new SlimefunItemStack(
            "BASIC_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&9基本&8鵝卵石製造機",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(24)
    );
    public static final SlimefunItemStack ADVANCED_COBBLE = new SlimefunItemStack(
            "ADVANCED_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&c高級&8鵝卵石製造機",
            "",
            LorePreset.speed(4),
            LorePreset.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITY_COBBLE = new SlimefunItemStack(
            "INFINITY_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&c無限&8鵝卵石製造機",
            "",
            LorePreset.speed(64),
            LorePreset.energyPerSecond(800)
    );
    public static final SlimefunItemStack BASIC_OBSIDIAN = new SlimefunItemStack(
            "BASIC_OBSIDIAN_GEN",
            Material.SMOOTH_STONE,
            "&8黑曜石製造機",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(240)
    );
    public static final SlimefunItemStack SINGULARITY_CONSTRUCTOR = new SlimefunItemStack(
            "SINGULARITY_CONSTRUCTOR",
            Material.QUARTZ_BRICKS,
            "&f奇點構造機",
            "&7凝聚大量的資源",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITY_CONSTRUCTOR = new SlimefunItemStack(
            "INFINITY_CONSTRUCTOR",
            Material.CHISELED_QUARTZ_BLOCK,
            "&b無限&f構造機",
            "&7更快的凝聚大量資源",
            "",
            LorePreset.speed(64),
            LorePreset.energyPerSecond(1200)
    );
    public static final SlimefunItemStack STONEWORKS_FACTORY = new SlimefunItemStack(
            "STONEWORKS_FACTORY",
            Material.BLAST_FURNACE,
            "&8石材工廠",
            "&7生產鵝卵石並將其加工成各種材料",
            "",
            LorePreset.energyPerSecond(240)
    );
    public static final SlimefunItemStack VOID_HARVESTER = new SlimefunItemStack(
            "VOID_HARVESTER",
            Material.OBSIDIAN,
            "&8虛空收割機",
            "&7緩慢的從虛無中收集 &8虛空&7之點...",
            "",
            LorePreset.speed(1),
            LorePreset.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITE_VOID_HARVESTER = new SlimefunItemStack(
            "INFINITE_VOID_HARVESTER",
            Material.CRYING_OBSIDIAN,
            "&b無限&8虛空收割機",
            "&7從虛無中收集 &8虛空&7之點...",
            "",
            LorePreset.speed(64),
            LorePreset.energyPerSecond(12000)
    );

    public static void setup(InfinityExpansion plugin) {
        new VoidHarvester(Groups.ADVANCED_MACHINES, VOID_HARVESTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.TITANIUM, Materials.TITANIUM, Materials.TITANIUM,
                Materials.MACHINE_PLATE, SlimefunItems.GEO_MINER, Materials.MACHINE_PLATE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 120, 1).register(plugin);
        new VoidHarvester(Groups.INFINITY_CHEAT, INFINITE_VOID_HARVESTER, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, VOID_HARVESTER, VOID_HARVESTER, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE
        }, 12000, 64).register(plugin);
        new StoneworksFactory(Groups.ADVANCED_MACHINES, STONEWORKS_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, BASIC_COBBLE, Materials.MAGSTEEL_PLATE,
                SlimefunItems.ELECTRIC_FURNACE_3, Materials.MACHINE_CIRCUIT, SlimefunItems.ELECTRIC_ORE_GRINDER,
                Materials.MAGSTEEL_PLATE, SlimefunItems.ELECTRIC_PRESS, Materials.MAGSTEEL_PLATE
        }, 240).register(plugin);
        new SingularityConstructor(Groups.ADVANCED_MACHINES, SINGULARITY_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL, Materials.MAGSTEEL, Materials.MAGSTEEL,
                Materials.MACHINE_PLATE, SlimefunItems.CARBON_PRESS_3, Materials.MACHINE_PLATE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 120, 1).register(plugin);
        new SingularityConstructor(Groups.INFINITY_CHEAT, INFINITY_CONSTRUCTOR, InfinityWorkbench.TYPE, new ItemStack[] {
                null, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, null,
                null, Materials.VOID_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, null,
                null, Materials.VOID_INGOT, SINGULARITY_CONSTRUCTOR, SINGULARITY_CONSTRUCTOR, Materials.VOID_INGOT, null,
                null, Materials.VOID_INGOT, SINGULARITY_CONSTRUCTOR, SINGULARITY_CONSTRUCTOR, Materials.VOID_INGOT, null,
                null, Materials.INFINITE_INGOT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT
        }, 1200, 64).register(plugin);
        new ResourceSynthesizer(Groups.ADVANCED_MACHINES, RESOURCE_SYNTHESIZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.ADAMANTITE, Materials.ADAMANTITE, Materials.ADAMANTITE,
                Materials.MACHINE_PLATE, SlimefunItems.REINFORCED_FURNACE, Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.MACHINE_CORE, Materials.MACHINE_PLATE
        }, new SlimefunItemStack[] {
                Materials.IRON_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 32),
                Materials.IRON_SINGULARITY, Materials.REDSTONE_SINGULARITY, new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY, 32),
                Materials.DIAMOND_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(SlimefunItems.CARBONADO, 16),
                Materials.GOLD_SINGULARITY, Materials.EMERALD_SINGULARITY, new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 16),
                Materials.COPPER_SINGULARITY, Materials.ZINC_SINGULARITY, new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 64),
                Materials.IRON_SINGULARITY, Materials.QUARTZ_SINGULARITY, new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 64)
        }, 1_000_000).register(plugin);

        new PoweredBedrock(Groups.INFINITY_CHEAT, POWERED_BEDROCK, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MACHINE_PLATE, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.VOID_INGOT, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR, Materials.VOID_INGOT, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.VOID_INGOT, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MACHINE_PLATE, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5
        }, BEDROCK_ENERGY).register(plugin);
        new MaterialGenerator(Groups.BASIC_MACHINES, BASIC_COBBLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL, new ItemStack(Material.DIAMOND_PICKAXE), Materials.MAGSTEEL,
                new ItemStack(Material.WATER_BUCKET), Materials.COBBLE_2, new ItemStack(Material.LAVA_BUCKET),
                Materials.MAGSTEEL, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL
        }, 24, 1, Material.COBBLESTONE).register(plugin);
        new MaterialGenerator(Groups.ADVANCED_MACHINES, ADVANCED_COBBLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, BASIC_COBBLE, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.WATER_BUCKET), Materials.COBBLE_3, new ItemStack(Material.LAVA_BUCKET),
                Materials.MACHINE_CIRCUIT, BASIC_COBBLE, Materials.MACHINE_CIRCUIT
        }, 75, 4, Material.COBBLESTONE).register(plugin);
        new MaterialGenerator(Groups.INFINITY_CHEAT, INFINITY_COBBLE, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT
        }, 800, 64, Material.COBBLESTONE).register(plugin);
        new MaterialGenerator(Groups.ADVANCED_MACHINES, BASIC_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.FLUID_PUMP, SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.FLUID_PUMP,
                new ItemStack(Material.DISPENSER), Materials.VOID_INGOT, new ItemStack(Material.DISPENSER),
                Materials.MACHINE_CIRCUIT, ADVANCED_COBBLE, Materials.MACHINE_CIRCUIT
        }, 240, 1, Material.OBSIDIAN).register(plugin);
        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_GROWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                Materials.MAGSTEEL, new ItemStack(Material.DIAMOND_HOE), Materials.MAGSTEEL,
                Materials.MACHINE_CIRCUIT, new ItemStack(Material.GRASS_BLOCK), Materials.MACHINE_CIRCUIT
        }, 18, 300, false).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_GROWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
                Materials.MAGNONIUM, BASIC_GROWER, Materials.MAGNONIUM,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 90, 60, false).register(plugin);
        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_GROWER, InfinityWorkbench.TYPE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GLASS),
                Materials.MACHINE_PLATE, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, ADVANCED_GROWER, ADVANCED_GROWER, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }, 900, 12, false).register(plugin);

        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_TREE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                Materials.MAGSTEEL, new ItemStack(Material.PODZOL), Materials.MAGSTEEL,
                Materials.MACHINE_CIRCUIT, BASIC_GROWER, Materials.MACHINE_CIRCUIT
        }, 36, 600, true).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_TREE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
                Materials.MAGNONIUM, BASIC_TREE, Materials.MAGNONIUM,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 180, 120, true).register(plugin);
        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_TREE, InfinityWorkbench.TYPE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SlimefunItems.TREE_GROWTH_ACCELERATOR, null, null, SlimefunItems.TREE_GROWTH_ACCELERATOR, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), ADVANCED_TREE, null, null, ADVANCED_TREE, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SlimefunItems.TREE_GROWTH_ACCELERATOR, null, null, SlimefunItems.TREE_GROWTH_ACCELERATOR, new ItemStack(Material.GLASS),
                Materials.MACHINE_PLATE, new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }, 1800, 24, true).register(plugin);

        new ConversionMachine(Groups.ADVANCED_MACHINES, EXTREME_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.FREEZER_2, SlimefunItems.FREEZER_2, SlimefunItems.FREEZER_2,
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.FLUID_PUMP, new ItemStack(Material.WATER_BUCKET),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }, 90, new ItemStack[] {
                new ItemStack(Material.ICE, 2),
                new ItemStack(Material.MAGMA_BLOCK, 2)
        }, new ItemStack[] {
                SlimefunItems.REACTOR_COOLANT_CELL,
                SlimefunItems.NETHER_ICE_COOLANT_CELL
        }).register(plugin);

        new ConversionMachine(Groups.ADVANCED_MACHINES, DUST_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }, 240, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE, 4),
                new ItemStack(Material.ANDESITE, 4),
                new ItemStack(Material.STONE, 4),
                new ItemStack(Material.DIORITE, 4),
                new ItemStack(Material.GRANITE, 4)
        }, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 2),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 2),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 2),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 2),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 2),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 2),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 2),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 2)
        }).register(plugin);

        new ConversionMachine(Groups.INFINITY_CHEAT, INFINITY_DUST_EXTRACTOR, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }, 7200, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE, 64),
                new ItemStack(Material.ANDESITE, 64),
                new ItemStack(Material.STONE, 64),
                new ItemStack(Material.DIORITE, 64),
                new ItemStack(Material.GRANITE, 64)
        }, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 64),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64)
        }).register(plugin);

        new ConversionMachine(Groups.ADVANCED_MACHINES, COBBLE_PRESS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.COBBLE_3, Materials.MACHINE_PLATE,
                SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2,
                Materials.MACHINE_PLATE, Materials.COBBLE_3, Materials.MACHINE_PLATE
        }, 120, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE, 64),
                new SlimefunItemStack(Materials.COBBLE_1, 64),
                new SlimefunItemStack(Materials.COBBLE_2, 64),
                new SlimefunItemStack(Materials.COBBLE_3, 64),
                new SlimefunItemStack(Materials.COBBLE_4, 64)
        }, new ItemStack[] {
                new SlimefunItemStack(Materials.COBBLE_1, 8),
                new SlimefunItemStack(Materials.COBBLE_2, 8),
                new SlimefunItemStack(Materials.COBBLE_3, 8),
                new SlimefunItemStack(Materials.COBBLE_4, 8),
                new SlimefunItemStack(Materials.COBBLE_5, 8)
        }).register(plugin);

        new ConversionMachine(Groups.ADVANCED_MACHINES, INGOT_FORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2,
                SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }, 240, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 8),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 8),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 8),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 8),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 8),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 8),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 8),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 8),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 8)
        }, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.TIN_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.GOLD_24K, 1),
                new ItemStack(Material.IRON_INGOT, 4),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 4)
        }).register(plugin);

        new ConversionMachine(Groups.INFINITY_CHEAT, INFINITY_INGOT_FORMER, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }, 7200, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 64),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64)
        }, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.GOLD_24K, 10),
                new ItemStack(Material.IRON_INGOT, 64),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64)
        }).register(plugin);

        new ConversionMachine(Groups.ADVANCED_MACHINES, URANIUM_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ENHANCED_AUTO_CRAFTER,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }, 240, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE, 4),
                new ItemStack(Material.ANDESITE, 4),
                new ItemStack(Material.STONE, 4),
                new ItemStack(Material.DIORITE, 4),
                new ItemStack(Material.GRANITE, 4)
        }, new ItemStack[] {
                SlimefunItems.SMALL_URANIUM
        }).register(plugin);

        new ConversionMachine(Groups.ADVANCED_MACHINES, DECOMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, Materials.MAGSTEEL_PLATE, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.STICKY_PISTON), SlimefunItems.ELECTRIC_PRESS_2, new ItemStack(Material.STICKY_PISTON),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }, 60, new ItemStack[] {
                new ItemStack(Material.EMERALD_BLOCK, 1),
                new ItemStack(Material.DIAMOND_BLOCK, 1),
                new ItemStack(Material.GOLD_BLOCK, 1),
                new ItemStack(Material.IRON_BLOCK, 1),
                new ItemStack(Material.NETHERITE_BLOCK, 1),
                new ItemStack(Material.REDSTONE_BLOCK, 1),
                new ItemStack(Material.QUARTZ_BLOCK, 1),
                new ItemStack(Material.LAPIS_BLOCK, 1),
                new ItemStack(Material.COAL_BLOCK, 1),
                Materials.COBBLE_5,
                Materials.COBBLE_4,
                Materials.COBBLE_3,
                Materials.COBBLE_2,
                Materials.COBBLE_1
        }, new ItemStack[] {
                new ItemStack(Material.EMERALD, 9),
                new ItemStack(Material.DIAMOND, 9),
                new ItemStack(Material.GOLD_INGOT, 9),
                new ItemStack(Material.IRON_INGOT, 9),
                new ItemStack(Material.NETHERITE_INGOT, 9),
                new ItemStack(Material.REDSTONE, 9),
                new ItemStack(Material.QUARTZ, 4),
                new ItemStack(Material.LAPIS_LAZULI, 9),
                new ItemStack(Material.COAL, 9),
                new SlimefunItemStack(Materials.COBBLE_4, 9),
                new SlimefunItemStack(Materials.COBBLE_3, 9),
                new SlimefunItemStack(Materials.COBBLE_2, 9),
                new SlimefunItemStack(Materials.COBBLE_1, 9),
                new ItemStack(Material.COBBLESTONE, 9)
        }).register(plugin);
        new GearTransformer(Groups.ADVANCED_MACHINES, GEAR_TRANSFORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL_PLATE,
                Materials.MACHINE_CIRCUIT, new ItemStack(Material.SMITHING_TABLE), Materials.MACHINE_CIRCUIT,
                Materials.MAGSTEEL_PLATE, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL_PLATE
        }, GEAR_TRANSFORMER_ENERGY).register(plugin);
        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.MACHINE_PLATE,
                Materials.VOID_INGOT, SlimefunExtension.ADVANCED_GEO_MINER, Materials.VOID_INGOT,
                Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.MACHINE_PLATE,
        }, GEO_QUARRY_ENERGY, GEO_QUARRY_INTERVAL).register(plugin);
    }

}
