package fr.pixfri.pixfrimod.item;

import fr.pixfri.pixfrimod.PixfriMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PixfriMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
