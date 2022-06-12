package fr.pixfri.pixfrimod.item.client;

import fr.pixfri.pixfrimod.item.custom.CitrineStaffItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CitrineStaffRenderer extends GeoItemRenderer<CitrineStaffItem> {
    public CitrineStaffRenderer() {
        super(new CitrineStaffModel());
    }
}
