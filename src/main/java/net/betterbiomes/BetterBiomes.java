package net.betterbiomes;

import com.terraformersmc.biolith.api.surface.SurfaceGeneration;
import net.betterbiomes.particle.ModParticles;
import net.betterbiomes.registry.content.*;
import net.betterbiomes.sound.ModSounds;
import net.betterbiomes.world.biome.SurfaceRules;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBiomes implements ModInitializer {
	public static final String MOD_ID = "betterbiomes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MapleContent.appendBoats();
		SakuraContent.appendBoats();
		PalmContent.register();
		FoodContent.appendItemGroups();
		VanillaPilesContent.register();


		ModSounds.register();
		ModParticles.register();







		// SurfaceRules
		SurfaceGeneration.addOverworldSurfaceRules(Identifier.of("minecraft", "rules/overworld"), SurfaceRules.overworld());
	}
}