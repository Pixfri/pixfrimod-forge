package fr.pixfri.pixfrimod.world;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.world.gen.ModFlowerGeneration;
import fr.pixfri.pixfrimod.world.gen.ModOreGeneration;
import fr.pixfri.pixfrimod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PixfriMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generatedFlowers(event);
    }
}
