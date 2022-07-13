package fr.pixfri.pixfrimod.item.client;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.block.entity.custom.LevitatingGoldEntity;
import fr.pixfri.pixfrimod.item.custom.LevitatingGoldItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LevitatingGoldItemModel extends AnimatedGeoModel<LevitatingGoldItem> {
    @Override
    public ResourceLocation getModelLocation(LevitatingGoldItem object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "geo/levitating_gold.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LevitatingGoldItem object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "textures/machines/levitating_gold.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LevitatingGoldItem animatable) {
        return new ResourceLocation(PixfriMod.MOD_ID, "animations/levitating_gold.animation.json");
    }
}
