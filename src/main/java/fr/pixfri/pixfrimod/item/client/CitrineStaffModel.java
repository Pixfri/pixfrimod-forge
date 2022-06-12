package fr.pixfri.pixfrimod.item.client;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.item.custom.CitrineStaffItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CitrineStaffModel extends AnimatedGeoModel<CitrineStaffItem> {
    @Override
    public ResourceLocation getModelLocation(CitrineStaffItem object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "geo/citrine_staff.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CitrineStaffItem object) {
        return new ResourceLocation(PixfriMod.MOD_ID, "textures/item/citrine_staff_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CitrineStaffItem animatable) {
        return new ResourceLocation(PixfriMod.MOD_ID, "animations/citrine_staff.animation.json");
    }
}
