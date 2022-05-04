package fr.pixfri.pixfrimod.item;

import fr.pixfri.pixfrimod.PixfriMod;
import fr.pixfri.pixfrimod.item.custom.CoalCokeItem;
import fr.pixfri.pixfrimod.item.custom.DowsingRodItem;
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

    public static final RegistryObject<Item> CITRINE_STICK = ITEMS.register("citrine_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB).durability(16)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB).food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB)));

    public static final RegistryObject<Item> EBONY = ITEMS.register("ebony",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PIXFRIMOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
