package fr.pixfri.pixfrimod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier CITRINE = new ForgeTier(2, 1400, 5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

    public static final ForgeTier COLTAN = new ForgeTier(3, 1500, 6.5f,
            4f, 26, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.COLTAN.get()));

    public static final ForgeTier TITANIUM = new ForgeTier(4, 3600, 15f,
            6f, 36, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.TITANIUM.get()));
}
