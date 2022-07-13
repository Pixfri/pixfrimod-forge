package fr.pixfri.pixfrimod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PixfriModClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Pixfri Mod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
