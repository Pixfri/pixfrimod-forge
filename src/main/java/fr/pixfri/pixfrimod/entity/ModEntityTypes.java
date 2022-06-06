package fr.pixfri.pixfrimod.entity;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, PixfriMod.MOD_ID);

    public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON = ENTITY_TYPES.register("raccoon",
            () -> EntityType.Builder.of(RaccoonEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(PixfriMod.MOD_ID, "raccoon").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
