package io.github.mooy1.infinityexpansion.implementation.gear;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.implementation.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.implementation.materials.CompressedItem;
import io.github.mooy1.infinityexpansion.implementation.materials.SmelteryItem;
import io.github.mooy1.infinityexpansion.setup.categories.Categories;
import io.github.mooy1.infinitylib.PluginUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;

/**
 * armor
 *
 * @author Mooy1
 */
public final class InfinityArmor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable { //add sf bow too
    
    private static final NamespacedKey key = PluginUtils.getKey("infinity_armor");
    
    public static void setup(InfinityExpansion plugin) {
        new InfinityArmor(CROWN, new PotionEffect[] {
                new PotionEffect(PotionEffectType.SATURATION, 1200, 0),
                new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 0),
                new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 0)
        }, new ItemStack[] {
                null, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, null,
                SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY,
                SmelteryItem.INFINITY, CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT, SmelteryItem.INFINITY,
                null, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null
        }).register(plugin);
        new InfinityArmor(CHESTPLATE, new PotionEffect[] {
                new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 1),
                new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 1),
                new PotionEffect(PotionEffectType.ABSORPTION, 1200, 2),
        }, new ItemStack[] {
                null, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, null,
                SmelteryItem.INFINITY, CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT, SmelteryItem.INFINITY,
                CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT,
                CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT, CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT,
                null, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, null,
                null, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, null
        }).register(plugin);
        new InfinityArmor(LEGGINGS, new PotionEffect[] {
                new PotionEffect(PotionEffectType.CONDUIT_POWER, 1200, 0),
                new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 2),
                new PotionEffect(PotionEffectType.REGENERATION, 1200, 0),
        }, new ItemStack[] {
                null, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, null,
                SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY, SmelteryItem.INFINITY,
                CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT,
                CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT,
                CompressedItem.VOID_INGOT, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, CompressedItem.VOID_INGOT,
                null, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, null
        }).register(plugin);
        new InfinityArmor(BOOTS, new PotionEffect[] {
                new PotionEffect(PotionEffectType.SPEED, 1200, 2),
                new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1200, 0),
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 0)
        }, new ItemStack[] {
                null, null, null, null, null, null,
                SmelteryItem.INFINITY, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, SmelteryItem.INFINITY,
                SmelteryItem.INFINITY, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, SmelteryItem.INFINITY,
                CompressedItem.VOID_INGOT, CompressedItem.VOID_INGOT, null, null, CompressedItem.VOID_INGOT, CompressedItem.VOID_INGOT,
                SmelteryItem.INFINITY, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, SmelteryItem.INFINITY,
                SmelteryItem.INFINITY, SmelteryItem.INFINITY, null, null, SmelteryItem.INFINITY, SmelteryItem.INFINITY
        }).register(plugin);
    }
    
    public static final SlimefunItemStack CROWN = new SlimefunItemStack(
            "INFINITY_CROWN",
            Material.NETHERITE_HELMET,
            "&b無限頭冠",
            "&7飽食 I",
            "&7夜視 I",
            "&7水下呼吸 I",
            "&7免疫鞘翅墜落傷害"
    );
    public static final SlimefunItemStack CHESTPLATE = new SlimefunItemStack(
            "INFINITY_CHESTPLATE",
            Material.NETHERITE_CHESTPLATE,
            "&b無限胸甲",
            "&7力量 II",
            "&7生命值提升 III",
            "&7抗性 II",
            "&7免疫蜜蜂螫"
    );
    public static final SlimefunItemStack LEGGINGS = new SlimefunItemStack(
            "INFINITY_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&b無限護腿",
            "&7挖掘加速 III",
            "&7海靈祝福 I",
            "&7回復 I",
            "&7免疫輻射"
    );
    public static final SlimefunItemStack BOOTS = new SlimefunItemStack(
            "INFINITY_BOOTS",
            Material.NETHERITE_BOOTS,
            "&b無限靴子",
            "&7加速 III",
            "&7海豚悠游 I",
            "&7抗火 I"
    );
    
    private InfinityArmor(SlimefunItemStack item, PotionEffect[] effects, ItemStack[] recipe) {
        super(Categories.INFINITY_CHEAT , item, InfinityWorkbench.TYPE, recipe, effects);
    }

    @Nonnull
    @Override
    public ProtectionType[] getProtectionTypes() {
        return new ProtectionType[] {
                ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL
        };
    }

    @Override
    public boolean isFullSetRequired() {
        return false;
    }

    @Nonnull
    @Override
    public NamespacedKey getArmorSetId() {
        return key;
    }

}