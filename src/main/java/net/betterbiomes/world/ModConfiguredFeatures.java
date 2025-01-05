package net.betterbiomes.world;


import com.google.common.collect.ImmutableList;
import net.betterbiomes.BetterBiomes;
import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class ModConfiguredFeatures {


    /*-----------------------Maple---------------------*/

    public static final RegistryKey<ConfiguredFeature<?, ?>> VERMILION_MAPLE_KEY = registerKey("tress_vermilion_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VERMILION_BEES_MAPLE_KEY = registerKey("tress_vermilion_fancy_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FULVOUS_MAPLE_KEY = registerKey("tress_fulvous_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FULVOUS_BEES_MAPLE_KEY = registerKey("tress_fulvous_fancy_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIKADO_MAPLE_KEY = registerKey("tress_mikado_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIKADO_BEES_MAPLE_KEY = registerKey("tress_mikado_fancy_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAP_MAPLE_KEY = registerKey("tress_sap_carnelian_treeway");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAP_BEES_MAPLE_KEY = registerKey("tress_sap_fancy_carnelian_treeway");




    public static final RegistryKey<ConfiguredFeature<?, ?>> VERMILION_PILE_KEY = registerKey("piles_vermilion_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FULVOUS_PILE_KEY = registerKey("piles_fulvous_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIKADO_PILE_KEY = registerKey("piles_mikado_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAP_PILE_KEY = registerKey("piles_sap_maple");






    /*-----------------------Sakura---------------------*/


    public static final RegistryKey<ConfiguredFeature<?, ?>> COTTON_SAKURA_KEY = registerKey("tress_cotton_sakura_groves");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COTTON_BEES_SAKURA_KEY = registerKey("tress_cotton_fancy_sakura_groves");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUSH_SAKURA_KEY = registerKey("tress_blush_sakura_groves");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUSH_BEES_SAKURA_KEY = registerKey("tress_blush_fancy_sakura_groves");



    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUSH_PILE_KEY = registerKey("piles_blush_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COTTON_PILE_KEY = registerKey("piles_cotton_maple");


    // Beehive
    public static BeehiveTreeDecorator BeehiveTreeDecorator = new BeehiveTreeDecorator(0.5F);


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        /*-----------------------Maple---------------------*/

        register(context, FULVOUS_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.FULVOUS_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, FULVOUS_BEES_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.FULVOUS_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(List.of(BeehiveTreeDecorator)).build());
        register(context, VERMILION_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.VERMILION_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, VERMILION_BEES_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.VERMILION_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(List.of(BeehiveTreeDecorator)).build());
        register(context, MIKADO_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.MIKADO_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, MIKADO_BEES_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.MIKADO_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(List.of(BeehiveTreeDecorator)).build());
        register(context, SAP_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.SAP_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, SAP_BEES_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MapleContent.MAPLE_LOG),
                new StraightTrunkPlacer(5, 4, 0),
                BlockStateProvider.of(MapleContent.SAP_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(List.of(BeehiveTreeDecorator)).build());
        register(context, VERMILION_PILE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(10, 4, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(MapleContent.VERMILION_MAPLE_PILE)))));
        register(context, FULVOUS_PILE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(10, 4, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(MapleContent.FULVOUS_MAPLE_PILE)))));
        register(context, MIKADO_PILE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(10, 4, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(MapleContent.MIKADO_MAPLE_PILE)))));
        register(context, SAP_PILE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(10, 4, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(MapleContent.SAP_MAPLE_PILE)))));



        /*-----------------------Sakura---------------------*/





        register(context, BLUSH_SAKURA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(SakuraContent.SAKURA_LOG),
                new ForkingTrunkPlacer(5, 3, 2),
                BlockStateProvider.of(SakuraContent.BLUSH_SAKURA_BLOSSOMS),
                new AcaciaFoliagePlacer(UniformIntProvider.create(1, 2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).forceDirt().ignoreVines().build());
        register(context, BLUSH_BEES_SAKURA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(SakuraContent.SAKURA_LOG),
                new ForkingTrunkPlacer(6, 4, 3),
                BlockStateProvider.of(SakuraContent.BLUSH_SAKURA_BLOSSOMS),
                new AcaciaFoliagePlacer(UniformIntProvider.create(1, 2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(List.of(BeehiveTreeDecorator)).ignoreVines().forceDirt().build());
        register(context, COTTON_SAKURA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(SakuraContent.SAKURA_LOG),
                new ForkingTrunkPlacer(5, 3, 2),
                BlockStateProvider.of(SakuraContent.COTTON_SAKURA_BLOSSOMS),
                new AcaciaFoliagePlacer(UniformIntProvider.create(1, 2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(ImmutableList.of(new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL)))).forceDirt().ignoreVines().build());
        register(context, COTTON_BEES_SAKURA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(SakuraContent.SAKURA_LOG),
                new ForkingTrunkPlacer(6, 4, 3),
                BlockStateProvider.of(SakuraContent.COTTON_SAKURA_BLOSSOMS),
                new AcaciaFoliagePlacer(UniformIntProvider.create(1, 2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).decorators(List.of(BeehiveTreeDecorator)).ignoreVines().forceDirt().build());
        register(context, COTTON_PILE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(15, 6, 4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(SakuraContent.COTTON_SAKURA_BLOSSOM_PILE)))));
        register(context, BLUSH_PILE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(20, 8, 6, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(SakuraContent.BLUSH_SAKURA_BLOSSOM_PILE)))));


    }





    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BetterBiomes.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}