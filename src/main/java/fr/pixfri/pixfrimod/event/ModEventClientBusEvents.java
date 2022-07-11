package fr.pixfri.pixfrimod.event;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.block.ModBlocks;
import fr.pixfri.pixfrimod.block.entity.ModBlockEntities;
import fr.pixfri.pixfrimod.block.entity.ModWoodTypes;
import fr.pixfri.pixfrimod.block.entity.client.LevitatingGoldRenderer;
import fr.pixfri.pixfrimod.block.entity.custom.GemCuttingStationBlockEntity;
import fr.pixfri.pixfrimod.entity.ModEntityTypes;
import fr.pixfri.pixfrimod.entity.client.RaccoonRenderer;
import fr.pixfri.pixfrimod.entity.client.armor.CitrineArmorRenderer;
import fr.pixfri.pixfrimod.fluid.ModFluids;
import fr.pixfri.pixfrimod.item.custom.CitrineArmorItem;
import fr.pixfri.pixfrimod.particle.ModParticles;
import fr.pixfri.pixfrimod.particle.custom.CitrineParticles;
import fr.pixfri.pixfrimod.screen.GemCuttingStationScreen;
import fr.pixfri.pixfrimod.screen.ModMenuTypes;
import fr.pixfri.pixfrimod.util.ModItemProperties;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = PixfriMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(CitrineArmorItem.class, new CitrineArmorRenderer());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.RACCOON.get(), RaccoonRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LEVITATING_GOLD_ENTITY.get(), LevitatingGoldRenderer::new);
    }

    @SubscribeEvent
    public void clientSetup(final FMLClientSetupEvent event) {
        PixfriMod.LOGGER.info("Setting up client");
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTER_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GEM_CUTTING_STATION.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_FLOWING.get(), RenderType.translucent());


        ModItemProperties.addCustomItemProperties();

        MenuScreens.register(ModMenuTypes.GEM_CUTTING_STATION_MENU.get(), GemCuttingStationScreen::new);

        WoodType.register(ModWoodTypes.EBONY);
        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);

        EntityRenderers.register(ModEntityTypes.RACCOON.get(), RaccoonRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PIXFRI_PORTAL.get(), RenderType.translucent());

        PixfriMod.LOGGER.info("Client has been setup successfully");
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.CITRINE_PARTICLES.get(),
                CitrineParticles.Provider::new);
    }
}
