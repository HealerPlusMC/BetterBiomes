package net.betterbiomes.world;

import net.betterbiomes.BetterBiomes;
import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {


    /*-----------------------Maple-----------------*/
    public static final RegistryKey<PlacedFeature> MIKADO_MAPLE_PLACED_KEY   = registerKey("trees_mikado_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> VERMILION_BEES_MAPLE_KEY  = registerKey("tress_vermilion_fancy_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> VERMILION_MAPLE_PLACED_KEY= registerKey("trees_vermilion_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> FULVOUS_BEES_MAPLE_KEY    = registerKey("tress_fulvous_fancy_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> FULVOUS_MAPLE_PLACED_KEY  = registerKey("trees_fulvous_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> MIKADO_BEES_MAPLE_KEY     = registerKey("tress_mikado_fancy_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> SAP_MAPLE_PLACED_KEY      = registerKey("trees_sap_carnelian_treeway");
    public static final RegistryKey<PlacedFeature> SAP_BEES_MAPLE_KEY        = registerKey("tress_sap_fancy_carnelian_treeway");



    public static final RegistryKey<PlacedFeature> VERMILION_PILE_KEY = registerKey("piles_vermilion_maple");
    public static final RegistryKey<PlacedFeature> FULVOUS_PILE_KEY = registerKey("piles_mikado_maple");
    public static final RegistryKey<PlacedFeature> MIKADO_PILE_KEY = registerKey("piles_fulvous_maple");
    public static final RegistryKey<PlacedFeature> SAP_PILE_KEY = registerKey("piles_sap_maple");





    /*-----------------------Sakura-----------------*/
    public static final RegistryKey<PlacedFeature> COTTON_SAKURA_KEY   = registerKey("tress_cotton_sakura_groves");
    public static final RegistryKey<PlacedFeature> COTTON_BEES_SAKURA_KEY  = registerKey("tress_cotton_fancy_sakura_groves");
    public static final RegistryKey<PlacedFeature> BLUSH_SAKURA_KEY= registerKey("tress_blush_sakura_groves");
    public static final RegistryKey<PlacedFeature> BLUSH_BEES_SAKURA_KEY    = registerKey("tress_blush_fancy_sakura_groves");


    public static final RegistryKey<PlacedFeature> BLUSH_PILE_KEY = registerKey("piles_blush_maple");
    public static final RegistryKey<PlacedFeature> COTTON_PILE_KEY = registerKey("piles_cotton_maple");




    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);



        /*-----------------------Maple-----------------*/
        register(context, VERMILION_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERMILION_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.VERMILION_MAPLE_SAPLING));
        register(context, VERMILION_BEES_MAPLE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERMILION_BEES_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.VERMILION_MAPLE_SAPLING));
        register(context, MIKADO_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MIKADO_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.MIKADO_MAPLE_SAPLING));
        register(context, MIKADO_BEES_MAPLE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MIKADO_BEES_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.MIKADO_MAPLE_SAPLING));
        register(context, FULVOUS_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FULVOUS_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.FULVOUS_MAPLE_SAPLING));
        register(context, FULVOUS_BEES_MAPLE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FULVOUS_BEES_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.FULVOUS_MAPLE_SAPLING));
        register(context, SAP_MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAP_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.SAP_MAPLE_SAPLING));
        register(context, SAP_BEES_MAPLE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAP_BEES_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleContent.SAP_MAPLE_SAPLING));
        register(context, VERMILION_PILE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERMILION_PILE_KEY),
                CountPlacementModifier.of( 25), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, FULVOUS_PILE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FULVOUS_PILE_KEY),
                CountPlacementModifier.of( 25), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, MIKADO_PILE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MIKADO_PILE_KEY),
                CountPlacementModifier.of( 25), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SAP_PILE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAP_PILE_KEY),
                CountPlacementModifier.of( 25), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());






        /*-----------------------Sakura-----------------*/
        register(context, COTTON_SAKURA_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_SAKURA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SakuraContent.COTTON_SAKURA_SAPLING));
        register(context, COTTON_BEES_SAKURA_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_BEES_SAKURA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SakuraContent.COTTON_SAKURA_SAPLING));
        register(context, BLUSH_SAKURA_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUSH_SAKURA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SakuraContent.BLUSH_SAKURA_SAPLING));
        register(context, BLUSH_BEES_SAKURA_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUSH_BEES_SAKURA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), SakuraContent.BLUSH_SAKURA_SAPLING));
        register(context, BLUSH_PILE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUSH_PILE_KEY),
                CountPlacementModifier.of( 15), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, COTTON_PILE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_PILE_KEY),
                CountPlacementModifier.of( 15), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());




    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(BetterBiomes.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
    register(context, key, configuration, List.of(modifiers));
    }
}

