package fr.pixfri.pixfrimod.item;

import fr.pixfri.pixfrimod.PixfriMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item CITRINE_STICK = registerItem("citrine_stick",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MAGIC_DUST = registerItem("magic_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TITANIUM = registerItem("titanium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PixfriMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PixfriMod.LOGGER.info("Registering Mod Items for " + PixfriMod.MOD_ID);
    }
}
