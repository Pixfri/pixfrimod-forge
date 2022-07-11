package fr.pixfri.pixfrimod.integration;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.block.ModBlocks;
import fr.pixfri.pixfrimod.item.ModItems;
import fr.pixfri.pixfrimod.recipe.GemCuttingStationRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class GemCuttingStationRecipeCategory implements IRecipeCategory<GemCuttingStationRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(PixfriMod.MOD_ID, "gem_cutting");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(PixfriMod.MOD_ID, "textures/gui/gem_cutting_station_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public GemCuttingStationRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.GEM_CUTTING_STATION.get()));
    }

    @SuppressWarnings("removal")
    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @SuppressWarnings("removal")
    @Override
    public Class<? extends GemCuttingStationRecipe> getRecipeClass() {
        return GemCuttingStationRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("gui.pixfrimod.title.jei_gem_cutting_station_title");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull GemCuttingStationRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 34, 40).addIngredients(Ingredient.of((Items.POTION).getDefaultInstance()));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(ModItems.GEM_CUTTER_TOOL.get()));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());
    }
}