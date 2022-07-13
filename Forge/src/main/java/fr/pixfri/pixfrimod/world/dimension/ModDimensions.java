package fr.pixfri.pixfrimod.world.dimension;

import fr.pixfri.pixfrimod.PixfriMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> PIXFRI_DIMENSION_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(PixfriMod.MOD_ID, "pixfri_dimension"));
    public static final ResourceKey<DimensionType> PIXFRI_DIMENSION_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, PIXFRI_DIMENSION_KEY.getRegistryName());

    public static void register() {
        PixfriMod.LOGGER.info("Registering ModDimensions for " + PixfriMod.MOD_ID);
    }
}
