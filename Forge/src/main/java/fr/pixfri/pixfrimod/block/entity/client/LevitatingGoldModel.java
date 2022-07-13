package fr.pixfri.pixfrimod.block.entity.client;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.block.entity.custom.LevitatingGoldEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LevitatingGoldModel extends AnimatedGeoModel<LevitatingGoldEntity> {
    @Override
    public ResourceLocation getModelLocation(LevitatingGoldEntity object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "geo/levitating_gold.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LevitatingGoldEntity object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "textures/machines/levitating_gold.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LevitatingGoldEntity animatable) {
        return new ResourceLocation(PixfriMod.MOD_ID, "animations/levitating_gold.animation.json");
    }
}
