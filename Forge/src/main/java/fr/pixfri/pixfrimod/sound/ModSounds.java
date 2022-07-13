package fr.pixfri.pixfrimod.sound;

import fr.pixfri.pixfrimod.PixfriMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PixfriMod.MOD_ID);

    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");

    public static RegistryObject<SoundEvent> CITRINE_LAMP_BREAK = registerSoundEvent("citrine_lamp_break");
    public static RegistryObject<SoundEvent> CITRINE_LAMP_STEP = registerSoundEvent("citrine_lamp_step");
    public static RegistryObject<SoundEvent> CITRINE_LAMP_PLACE = registerSoundEvent("citrine_lamp_place");
    public static RegistryObject<SoundEvent> CITRINE_LAMP_HIT = registerSoundEvent("citrine_lamp_hit");
    public static RegistryObject<SoundEvent> CITRINE_LAMP_FALL = registerSoundEvent("citrine_lamp_fall");

    public static RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvent("bar_brawl");


    public static final ForgeSoundType CITRINE_LAMP_SOUNDS = new ForgeSoundType(1f, 1f,
            CITRINE_LAMP_BREAK, CITRINE_LAMP_STEP, CITRINE_LAMP_PLACE,
            CITRINE_LAMP_HIT, CITRINE_LAMP_FALL);
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(PixfriMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
