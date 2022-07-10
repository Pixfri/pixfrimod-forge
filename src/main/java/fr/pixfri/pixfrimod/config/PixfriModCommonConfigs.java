package fr.pixfri.pixfrimod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PixfriModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // overworld
    public static final ForgeConfigSpec.ConfigValue<Integer> CITRINE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> CITRINE_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> TITANIUM_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> TITANIUM_ORE_VEIN_SIZE;

    // nether
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_CITRINE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_CITRINE_ORE_VEIN_SIZE;

    // end
    public static final ForgeConfigSpec.ConfigValue<Integer> END_CITRINE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_CITRINE_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for Pixfri Mod");

        // overworld
        CITRINE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Citrine Ore Veins spawn per chunk in the overworld!")
                .define("Overworld Citrine Veins Per Chunk", 7);
        CITRINE_ORE_VEIN_SIZE = BUILDER.comment("How many Citrine Ore Blocks spawn in one Vein in the overworld!")
                .defineInRange("Overworld Citrine Vein Size", 9, 4, 20);

        TITANIUM_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Titanium Ore Veins spawn per chunk in the overworld!")
                .define("Overworld Titanium Veins Per Chunk", 4);
        TITANIUM_ORE_VEIN_SIZE = BUILDER.comment("How many Titanium Ore Blocks spawn in one Vein in the overworld!")
                .defineInRange("Overworld Titanium Vein Size", 12, 4, 30);

        // nether
        NETHER_CITRINE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Citrine Ore Veins spawn per chunk in the nether!")
                .define("Nether Citrine Veins Per Chunk", 7);
        NETHER_CITRINE_ORE_VEIN_SIZE = BUILDER.comment("How many Citrine Ore Blocks spawn in one Vein in the nether!")
                .defineInRange("Nether Citrine Vein Size", 9, 4, 20);

        // end
        END_CITRINE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Citrine Ore Veins spawn per chunk in the end!")
                .define("End Citrine Veins Per Chunk", 7);
        END_CITRINE_ORE_VEIN_SIZE = BUILDER.comment("How many Citrine Ore Blocks spawn in one Vein in the end!")
                .defineInRange("End Citrine Vein Size", 9, 4, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
