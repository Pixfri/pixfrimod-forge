package fr.pixfri.pixfrimod.item;

import fr.pixfri.pixfrimod.PixfriMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public enum ModArmorMaterials implements ArmorMaterial {
    CITRINE("citrine", 28, new int[]{2, 5, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.CITRINE.get())),

    COLTAN("coltan", 30, new int[]{5, 8, 11, 8}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            3.0F, 0.5F, () -> Ingredient.of(ModItems.COLTAN.get())),

    TITANIUM("titanium", 34, new int[]{8, 20, 32, 12}, 22, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 1.0F, () -> Ingredient.of(ModItems.TITANIUM.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                              SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return PixfriMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
