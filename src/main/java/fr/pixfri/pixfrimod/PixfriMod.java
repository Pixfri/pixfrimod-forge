package fr.pixfri.pixfrimod;

import fr.pixfri.pixfrimod.block.ModBlocks;
import fr.pixfri.pixfrimod.block.entity.ModBlockEntities;
import fr.pixfri.pixfrimod.block.entity.ModWoodTypes;
import fr.pixfri.pixfrimod.config.PixfriModClientConfigs;
import fr.pixfri.pixfrimod.config.PixfriModCommonConfigs;
import fr.pixfri.pixfrimod.effect.ModEffects;
import fr.pixfri.pixfrimod.enchantment.ModEnchantments;
import fr.pixfri.pixfrimod.entity.ModEntityTypes;
import fr.pixfri.pixfrimod.entity.client.RaccoonRenderer;
import fr.pixfri.pixfrimod.fluid.ModFluids;
import fr.pixfri.pixfrimod.item.ModItems;
import fr.pixfri.pixfrimod.painting.ModPaintings;
import fr.pixfri.pixfrimod.particle.ModParticles;
import fr.pixfri.pixfrimod.potion.ModPotions;
import fr.pixfri.pixfrimod.recipe.ModRecipes;
import fr.pixfri.pixfrimod.screen.GemCuttingStationScreen;
import fr.pixfri.pixfrimod.screen.ModMenuTypes;
import fr.pixfri.pixfrimod.sound.ModSounds;
import fr.pixfri.pixfrimod.util.BetterBrewingRecipe;
import fr.pixfri.pixfrimod.util.ModItemProperties;
import fr.pixfri.pixfrimod.villager.ModPOIs;
import fr.pixfri.pixfrimod.villager.ModVillagers;
import fr.pixfri.pixfrimod.world.dimension.ModDimensions;
import fr.pixfri.pixfrimod.world.structure.ModStructures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PixfriMod.MOD_ID)
public class PixfriMod {
    public static final String MOD_ID = "pixfrimod";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    // Add a comment
    public PixfriMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModPaintings.register(eventBus);
        ModSounds.register(eventBus);

        ModEffects.register(eventBus);
        ModPotions.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);
        ModParticles.register(eventBus);

        ModFluids.register(eventBus);
        ModEnchantments.register(eventBus);

        ModEntityTypes.register(eventBus);
        ModVillagers.register(eventBus);

        ModStructures.register(eventBus);
        ModDimensions.register();

        ModPOIs.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::ClientSetup);

        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, PixfriModClientConfigs.SPEC, "pixfrimod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PixfriModCommonConfigs.SPEC, "pixfrimod-common.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void ClientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Setting up client");
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

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PIXFRI_PORTAL.get(), RenderType.translucent());

        ModItemProperties.addCustomItemProperties();

        MenuScreens.register(ModMenuTypes.GEM_CUTTING_STATION_MENU.get(), GemCuttingStationScreen::new);

        WoodType.register(ModWoodTypes.EBONY);
        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);

        EntityRenderers.register(ModEntityTypes.RACCOON.get(), RaccoonRenderer::new);

        LOGGER.info("Client has been setup successfully");
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("setting up Pixfri Mod");
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_ROSE.getId(), ModBlocks.POTTED_PINK_ROSE);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.CITRINE.get(), ModPotions.FREEZE_POTION.get()));

            Sheets.addWoodType(ModWoodTypes.EBONY);

            SpawnPlacements.register(ModEntityTypes.RACCOON.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);

            ModVillagers.registerPOIs();
        });
        LOGGER.info("Pixfri Mod has been setup successfully");
    }
}
