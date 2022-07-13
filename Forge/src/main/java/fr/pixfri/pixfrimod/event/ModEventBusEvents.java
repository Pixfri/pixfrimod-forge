package fr.pixfri.pixfrimod.event;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.entity.ModEntityTypes;
import fr.pixfri.pixfrimod.entity.custom.RaccoonEntity;
import fr.pixfri.pixfrimod.event.loot.CoalCokeFromCreeperAdditionModifier;
import fr.pixfri.pixfrimod.event.loot.CucumberSeedsFromGrassAdditionModifier;
import fr.pixfri.pixfrimod.event.loot.DowsingRodInIglooAdditionModifier;
import fr.pixfri.pixfrimod.recipe.GemCuttingStationRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = PixfriMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new CucumberSeedsFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PixfriMod.MOD_ID,"cucumber_seeds_from_grass")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PixfriMod.MOD_ID,"dowsing_rod_in_igloo")),
                new CoalCokeFromCreeperAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PixfriMod.MOD_ID,"coal_coke_from_creeper"))
        );
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, GemCuttingStationRecipe.Type.ID, GemCuttingStationRecipe.Type.INSTANCE);
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
    }
}
