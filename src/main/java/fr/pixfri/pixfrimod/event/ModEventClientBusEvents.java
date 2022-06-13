package fr.pixfri.pixfrimod.event;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.block.entity.ModBlockEntities;
import fr.pixfri.pixfrimod.block.entity.client.LevitatingGoldRenderer;
import fr.pixfri.pixfrimod.entity.client.armor.CitrineArmorRenderer;
import fr.pixfri.pixfrimod.item.custom.CitrineArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = PixfriMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(CitrineArmorItem.class, new CitrineArmorRenderer());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.LEVITATING_GOLD_ENTITY.get(), LevitatingGoldRenderer::new);
    }
}
