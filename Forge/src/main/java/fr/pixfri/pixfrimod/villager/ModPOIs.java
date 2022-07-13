package fr.pixfri.pixfrimod.villager;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, PixfriMod.MOD_ID);

    public static final RegistryObject<PoiType> PIXFRI_PORTAL =
            POI.register("pixfri_portal", () -> new PoiType("pixfri_portal",
                    PoiType.getBlockStates(ModBlocks.PIXFRI_PORTAL.get()), 0, 1));

    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
