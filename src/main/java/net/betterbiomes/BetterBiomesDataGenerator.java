package net.betterbiomes;

import net.betterbiomes.datagen.*;
import net.betterbiomes.datagen.lang.ModEnglishLangProvider;
import net.betterbiomes.datagen.tags.ModBlockTagsProvider;
import net.betterbiomes.datagen.tags.ModItemTagsProvider;
import net.betterbiomes.world.ModConfiguredFeatures;
import net.betterbiomes.world.ModPlacedFeatures;
import net.betterbiomes.world.biome.ModBiomeKeys;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BetterBiomesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModDynamicRegistryProvider::new);




		pack.addProvider(ModEnglishLangProvider::new);

	}

	

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ModBiomeKeys::bootstrap);
	}
}
