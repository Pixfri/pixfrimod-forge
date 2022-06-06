package fr.pixfri.pixfrimod.entity.client;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity> {
    @Override
    public ResourceLocation getModelLocation(RaccoonEntity object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "textures/entity/raccoon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RaccoonEntity animatable) {
        return new ResourceLocation(PixfriMod.MOD_ID, "animations/raccoon.animation.json");
    }
}
