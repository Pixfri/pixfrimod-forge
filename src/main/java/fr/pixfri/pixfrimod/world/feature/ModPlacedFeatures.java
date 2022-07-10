package fr.pixfri.pixfrimod.world.feature;

import fr.pixfri.pixfrimod.config.PixfriModCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.register("ebony_placed",
        ModConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            ModConfiguredFeatures.PINK_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    // citrine
    public static final Holder<PlacedFeature> CITRINE_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            ModConfiguredFeatures.CITRINE_ORE, ModOrePlacement.commonOrePlacement(
                    PixfriModCommonConfigs.CITRINE_ORE_VEINS_PER_CHUNK.get(), // veinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> END_CITRINE_ORE_PLACED = PlacementUtils.register("end_citrine_ore_placed",
            ModConfiguredFeatures.END_CITRINE_ORE, ModOrePlacement.commonOrePlacement(
                    PixfriModCommonConfigs.END_CITRINE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> NETHER_CITRINE_ORE_PLACED = PlacementUtils.register("nether_citrine_ore_placed",
            ModConfiguredFeatures.NETHER_CITRINE_ORE, ModOrePlacement.commonOrePlacement(
                    PixfriModCommonConfigs.NETHER_CITRINE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    // titanium
    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE, ModOrePlacement.rareOrePlacement(
                    PixfriModCommonConfigs.TITANIUM_ORE_VEINS_PER_CHUNK.get(), // veinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
