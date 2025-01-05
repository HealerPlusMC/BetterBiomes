package net.betterbiomes.world.biome;


import net.betterbiomes.BetterBiomes;
import net.betterbiomes.particle.ModParticles;
import net.betterbiomes.sound.ModSounds;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicType;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ModBiomeKeys {



    public static final RegistryKey<Biome> CARNELIAN_TREEWAY = register("carnelian_treeway");
    public static final RegistryKey<Biome> SAKURA_GROVES = register("sakura_groves");

    public static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(BetterBiomes.MOD_ID, name));
    }


    public static void bootstrap(Registerable<Biome> context) {
        context.register(CARNELIAN_TREEWAY, CARNELIAN_TREEWAY(context));
        context.register(SAKURA_GROVES, SAKURA_GROVES(context));

    }


    public static Biome CARNELIAN_TREEWAY(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 3, 3));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);
        DefaultBiomeFeatures.addForestGrass(biomeBuilder);
        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(155336)
                        .waterFogColor(541)
                        .skyColor(7907327)
                        .grassColor(9090320)
                        .foliageColor(10931465)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .particleConfig(new BiomeParticleConfig(ModParticles.MAPLE_LEAF, 0.001F))
                        .music(MusicType.createIngameMusic(RegistryEntry.of(ModSounds.BRISE_COULEUR_PASTEL)))
                        .build())
                .build();
    }


    public static Biome SAKURA_GROVES(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PANDA, 4, 3, 3));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);
        DefaultBiomeFeatures.addForestGrass(biomeBuilder);
        DefaultBiomeFeatures.addBamboo(biomeBuilder);
        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.6f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(6459391)
                        .waterFogColor(2170954)
                        .skyColor(8037887)
                        .grassColor(6484135)
                        .foliageColor(10931465)
                        .fogColor(12638463)
                        .moodSound(BiomeMoodSound.CAVE)
                        .particleConfig(new BiomeParticleConfig(ModParticles.SAKURA_LEAF, 0.001F))
                        .music(MusicType.createIngameMusic(RegistryEntry.of(ModSounds.BRISE_COULEUR_PASTEL)))
                        .build())
                .build();
    }
}






