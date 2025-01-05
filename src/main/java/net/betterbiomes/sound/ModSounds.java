package net.betterbiomes.sound;

import net.betterbiomes.BetterBiomes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {



    public static final SoundEvent BRISE_COULEUR_PASTEL = registerSoundEvent("brise_couleur_pastel");




    private static SoundEvent registerSoundEvent(String name) {
        Identifier ID = Identifier.of(BetterBiomes.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, ID, SoundEvent.of(ID));
    }

    public static void register() {

    }
}