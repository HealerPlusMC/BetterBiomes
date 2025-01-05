package net.betterbiomes.registry.content;

import com.terraformersmc.biolith.api.biome.BiomePlacement;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.betterbiomes.BetterBiomes;
import net.betterbiomes.world.ModPlacedFeatures;
import net.betterbiomes.world.biome.ModBiomeKeys;
import net.betterbiomes.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.healer.block.HealerBlockSettings;
import net.healer.item.ItemGroupHelper;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.gen.GenerationStep;

public class MapleContent {


    public static final Block MAPLE_LOG = registerBlock("maple_log",
            HealerBlockSettings.createLogBlock(MapColor.DEEPSLATE_GRAY, MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            HealerBlockSettings.createLogBlock(MapColor.DEEPSLATE_GRAY, MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            HealerBlockSettings.createWoodBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            HealerBlockSettings.createWoodBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            HealerBlockSettings.createPlanksBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.WOOD));


    public static final Block FULVOUS_MAPLE_LEAVES = registerBlock("fulvous_maple_leaves",
            HealerBlockSettings.createLeavesBlock(MapColor.ORANGE, BlockSoundGroup.GRASS));
    public static final Block FULVOUS_MAPLE_PILE = registerBlock("fulvous_maple_leaf_pile",
            HealerBlockSettings.createPileBlock(MapColor.ORANGE, BlockSoundGroup.GRASS));
    public static final Block FULVOUS_MAPLE_SAPLING = registerBlock("fulvous_maple_sapling",
            HealerBlockSettings.createSaplingBlock(ModSaplingGenerators.FULVOUS_MAPLE, MapColor.ORANGE, BlockSoundGroup.GRASS));
    public static final Block POTTED_FULVOUS_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_fulvous_maple_sapling",
            HealerBlockSettings.createFlowerPotBlock(FULVOUS_MAPLE_SAPLING));


    public static final Block VERMILION_MAPLE_LEAVES = registerBlock("vermilion_maple_leaves",
            HealerBlockSettings.createLeavesBlock(MapColor.DULL_RED, BlockSoundGroup.GRASS));
    public static final Block VERMILION_MAPLE_PILE = registerBlock("vermilion_maple_leaf_pile",
            HealerBlockSettings.createPileBlock(MapColor.DULL_RED, BlockSoundGroup.GRASS));
    public static final Block VERMILION_MAPLE_SAPLING = registerBlock("vermilion_maple_sapling",
            HealerBlockSettings.createSaplingBlock(ModSaplingGenerators.VERMILION_MAPLE, MapColor.DULL_RED, BlockSoundGroup.GRASS));
    public static final Block POTTED_VERMILION_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_vermilion_maple_sapling",
            HealerBlockSettings.createFlowerPotBlock(VERMILION_MAPLE_SAPLING));

    public static final Block MIKADO_MAPLE_LEAVES = registerBlock("mikado_maple_leaves",
            HealerBlockSettings.createLeavesBlock(MapColor.GOLD, BlockSoundGroup.GRASS));
    public static final Block MIKADO_MAPLE_PILE = registerBlock("mikado_maple_leaf_pile",
            HealerBlockSettings.createPileBlock(MapColor.GOLD, BlockSoundGroup.GRASS));
    public static final Block MIKADO_MAPLE_SAPLING = registerBlock("mikado_maple_sapling",
            HealerBlockSettings.createSaplingBlock(ModSaplingGenerators.MIKADO_MAPLE, MapColor.GOLD, BlockSoundGroup.GRASS));
    public static final Block POTTED_MIKADO_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_mikado_maple_sapling",
            HealerBlockSettings.createFlowerPotBlock(MIKADO_MAPLE_SAPLING));

    public static final Block SAP_MAPLE_LEAVES = registerBlock("sap_maple_leaves",
            HealerBlockSettings.createLeavesBlock(MapColor.GREEN, BlockSoundGroup.GRASS));
    public static final Block SAP_MAPLE_PILE = registerBlock("sap_maple_leaf_pile",
            HealerBlockSettings.createPileBlock(MapColor.GREEN, BlockSoundGroup.GRASS));
    public static final Block SAP_MAPLE_SAPLING = registerBlock("sap_maple_sapling",
            HealerBlockSettings.createSaplingBlock(ModSaplingGenerators.SAP_MAPLE, MapColor.GREEN, BlockSoundGroup.GRASS));
    public static final Block POTTED_SAP_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_sap_maple_sapling",
            HealerBlockSettings.createFlowerPotBlock(SAP_MAPLE_SAPLING));



    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            HealerBlockSettings.createWoodenStairsBlock(MAPLE_PLANKS.getDefaultState().getBlock(), MAPLE_PLANKS.getDefaultMapColor(), BlockSoundGroup.WOOD));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            HealerBlockSettings.createWoodenSlabsBlock(MAPLE_PLANKS.getDefaultMapColor(), BlockSoundGroup.WOOD));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            HealerBlockSettings.createWoodenButtonBlock(BlockSetType.OAK));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            HealerBlockSettings.createWoodenPressurePlateBlock(BlockSetType.OAK, MAPLE_PLANKS.getDefaultMapColor()));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            HealerBlockSettings.createWoodenFenceBlock(MAPLE_PLANKS.getDefaultMapColor(), BlockSoundGroup.WOOD));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            HealerBlockSettings.createWoodenFenceGateBlock(WoodType.OAK, MAPLE_PLANKS.getDefaultMapColor()));
    public static final Block MAPLE_DOOR = registerBlock("maple_door",
            HealerBlockSettings.createDoorBlock(BlockSetType.OAK, MAPLE_PLANKS.getDefaultMapColor()));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            HealerBlockSettings.createTrapDoorBlock(BlockSetType.OAK, MAPLE_PLANKS.getDefaultMapColor()));




    public static final Identifier MAPLE_SIGN_TEXTURE = Identifier.of(BetterBiomes.MOD_ID, "entity/signs/maple");
    public static final Identifier MAPLE_HANGING_SIGN_TEXTURE = Identifier.of(BetterBiomes.MOD_ID, "entity/signs/hanging/maple");
    public static final Identifier MAPLE_HANGING_GUI_SIGN_TEXTURE = Identifier.of(BetterBiomes.MOD_ID, "textures/gui/hanging_signs/maple");
    public static final Block STANDING_MAPLE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "maple_sign"),
            new TerraformSignBlock(MAPLE_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(MAPLE_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()));
    public static final Block WALL_MAPLE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "maple_wall_sign"),
            new TerraformWallSignBlock(MAPLE_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).dropsLike(STANDING_MAPLE_SIGN).burnable()));
    public static final Block HANGING_MAPLE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "maple_hanging_sign"),
            new TerraformHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(MAPLE_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()));
    public static final Block WALL_HANGING_MAPLE_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "maple_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(MAPLE_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(HANGING_MAPLE_SIGN)));


    public static final BlockFamily MAPLE_FAMILY = BlockFamilies.register(MAPLE_PLANKS)
            .sign(STANDING_MAPLE_SIGN, WALL_MAPLE_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();




    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new Item.Settings().maxCount(16), STANDING_MAPLE_SIGN, WALL_MAPLE_SIGN));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            new HangingSignItem(HANGING_MAPLE_SIGN, WALL_HANGING_MAPLE_SIGN, new Item.Settings().maxCount(16)));







    public static final Identifier MAPLE_BOAT_ID = Identifier.of(BetterBiomes.MOD_ID, "maple_boat");
    public static final Identifier MAPLE_CHEST_BOAT_ID = Identifier.of(BetterBiomes.MOD_ID, "maple_chest_boat");

    public static final RegistryKey<TerraformBoatType> MAPLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAPLE_BOAT_ID);

    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(MapleContent.MAPLE_BOAT_ID, MapleContent.MAPLE_BOAT_KEY, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(MapleContent.MAPLE_CHEST_BOAT_ID, MapleContent.MAPLE_BOAT_KEY, true);
    public static void appendBoats() {

        TerraformBoatType MapleBoat = new TerraformBoatType.Builder()
                .item(MapleContent.MAPLE_BOAT)
                .chestItem(MapleContent.MAPLE_CHEST_BOAT)
                .planks(MapleContent.MAPLE_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAPLE_BOAT_KEY, MapleBoat);




        appendItemGroups();
        appendVillagerTrades();
        appendMapleSettings();
        appendWorldGen();
    }

    public static void appendItemGroups() {

        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, entries -> entries.addAfter(SakuraContent.SAKURA_BUTTON,
                MAPLE_LOG,
                MAPLE_WOOD,
                STRIPPED_MAPLE_LOG,
                STRIPPED_MAPLE_WOOD,
                MAPLE_PLANKS,
                MAPLE_STAIRS,
                MAPLE_SLAB,
                MAPLE_FENCE,
                MAPLE_FENCE_GATE,
                MAPLE_DOOR,
                MAPLE_TRAPDOOR,
                MAPLE_PRESSURE_PLATE,
                MAPLE_BUTTON));


        ItemGroupHelper.append(ItemGroups.NATURAL, entries -> {

            entries.addAfter(SakuraContent.SAKURA_LOG, MAPLE_LOG);
            entries.addAfter(SakuraContent.COTTON_SAKURA_BLOSSOM_PILE, MIKADO_MAPLE_LEAVES, MIKADO_MAPLE_PILE, VERMILION_MAPLE_LEAVES, VERMILION_MAPLE_PILE, FULVOUS_MAPLE_LEAVES, FULVOUS_MAPLE_PILE, SAP_MAPLE_LEAVES, SAP_MAPLE_PILE);
            entries.addAfter(SakuraContent.COTTON_SAKURA_SAPLING, MIKADO_MAPLE_SAPLING, VERMILION_MAPLE_SAPLING, FULVOUS_MAPLE_SAPLING, SAP_MAPLE_SAPLING);

        });


        ItemGroupHelper.append(ItemGroups.FUNCTIONAL, entries -> {
            entries.addAfter(SakuraContent.SAKURA_HANGING_SIGN, MAPLE_SIGN, HANGING_MAPLE_SIGN);
        });


        ItemGroupHelper.append(ItemGroups.TOOLS, entries -> {
            entries.addAfter(SakuraContent.SAKURA_CHEST_BOAT, MAPLE_BOAT, MAPLE_CHEST_BOAT);
        });

    }




    public static void appendVillagerTrades() {

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(VERMILION_MAPLE_SAPLING, 1),
                        8, 1, 0.05f)));


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(MIKADO_MAPLE_SAPLING, 1),
                        8, 1, 0.05f)));


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(FULVOUS_MAPLE_SAPLING, 1),
                        8, 1, 0.05f)));


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(SAP_MAPLE_SAPLING, 1),
                        8, 1, 0.05f)));

    }




    public static void appendMapleSettings() {




        StrippableBlockRegistry.register(MapleContent.MAPLE_LOG, MapleContent.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(MapleContent.MAPLE_WOOD, MapleContent.STRIPPED_MAPLE_WOOD);


        CompostingChanceRegistry.INSTANCE.add(MapleContent.FULVOUS_MAPLE_PILE, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MapleContent.MIKADO_MAPLE_PILE, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MapleContent.VERMILION_MAPLE_PILE, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(MapleContent.SAP_MAPLE_PILE, 0.3F);



        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_PLANKS, 5,20);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_SLAB, 5,20);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_STAIRS, 5,20);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_FENCE, 5,20);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_FENCE_GATE, 5,20);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(MAPLE_WOOD, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_MAPLE_LOG, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_MAPLE_WOOD, 5,5);
        FlammableBlockRegistry.getDefaultInstance().add(FULVOUS_MAPLE_LEAVES, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(MIKADO_MAPLE_LEAVES, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(VERMILION_MAPLE_LEAVES, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(SAP_MAPLE_LEAVES, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(FULVOUS_MAPLE_PILE, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(MIKADO_MAPLE_PILE, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(VERMILION_MAPLE_PILE, 30,60);
        FlammableBlockRegistry.getDefaultInstance().add(SAP_MAPLE_PILE, 30,60);



    }



    public static void appendWorldGen() {


        BiomePlacement.addOverworld(ModBiomeKeys.CARNELIAN_TREEWAY,
                new MultiNoiseUtil.NoiseHypercube(
                        MultiNoiseUtil.ParameterRange.of(-0.8f, -0.1f),
                        MultiNoiseUtil.ParameterRange.of(-0.7f, 0.2f),
                        MultiNoiseUtil.ParameterRange.of(0.3f, 0.8f),
                        MultiNoiseUtil.ParameterRange.of(-0.4f, 0.1f),
                        MultiNoiseUtil.ParameterRange.of(-5F),
                        MultiNoiseUtil.ParameterRange.of(0.5f, 3.0f),
                        0L
                ));

        BiomePlacement.replaceOverworld(BiomeKeys.FOREST, ModBiomeKeys.CARNELIAN_TREEWAY);







        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SAP_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SAP_BEES_MAPLE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VERMILION_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VERMILION_BEES_MAPLE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MIKADO_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MIKADO_BEES_MAPLE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FULVOUS_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FULVOUS_BEES_MAPLE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VERMILION_PILE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FULVOUS_PILE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MIKADO_PILE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.CARNELIAN_TREEWAY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SAP_PILE_KEY);

    }



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name), item);
    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
}
