package fr.pixfri.pixfrimod.item.client;

import fr.pixfri.pixfrimod.item.custom.CitrineStaffItem;
import fr.pixfri.pixfrimod.item.custom.LevitatingGoldItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LevitatingGoldItemRenderer extends GeoItemRenderer<LevitatingGoldItem> {
    public LevitatingGoldItemRenderer() {
        super(new LevitatingGoldItemModel());
    }
}
