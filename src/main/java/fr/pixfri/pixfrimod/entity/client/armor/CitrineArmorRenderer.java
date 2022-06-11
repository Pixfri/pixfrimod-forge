package fr.pixfri.pixfrimod.entity.client.armor;

import fr.pixfri.pixfrimod.item.custom.CitrineArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CitrineArmorRenderer extends GeoArmorRenderer<CitrineArmorItem> {
    public CitrineArmorRenderer() {
        super(new CitrineArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";

    }

}
