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

public class SakuraContent {






    public static final Block SAKURA_LOG = registerBlock("sakura_log",
            HealerBlockSettings.createLogBlock(MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log",
            HealerBlockSettings.createLogBlock(MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block SAKURA_WOOD = registerBlock("sakura_wood",
            HealerBlockSettings.createWoodBlock(MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood",
            HealerBlockSettings.createWoodBlock(MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block SAKURA_PLANKS = registerBlock("sakura_planks",
            HealerBlockSettings.createPlanksBlock(MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));


    public static final Block COTTON_SAKURA_BLOSSOMS = registerBlock("cotton_sakura_blossoms",
            HealerBlockSettings.createLeavesBlock(MapColor.OFF_WHITE, BlockSoundGroup.CHERRY_LEAVES));
    public static final Block COTTON_SAKURA_BLOSSOM_PILE = registerBlock("cotton_sakura_blossom_pile",
            HealerBlockSettings.createPileBlock(MapColor.OFF_WHITE, BlockSoundGroup.CHERRY_LEAVES));
    public static final Block COTTON_SAKURA_SAPLING = registerBlock("cotton_sakura_sapling",
            HealerBlockSettings.createSaplingBlock(ModSaplingGenerators.COTTON_SAKURA, MapColor.OFF_WHITE, BlockSoundGroup.CHERRY_SAPLING));
    public static final Block POTTED_COTTON_SAKURA_SAPLING = registerBlockWithoutBlockItem("potted_cotton_sakura_sapling",
            HealerBlockSettings.createFlowerPotBlock(COTTON_SAKURA_SAPLING));

    public static final Block BLUSH_SAKURA_BLOSSOMS = registerBlock("blush_sakura_blossoms",
            HealerBlockSettings.createLeavesBlock(MapColor.PINK, BlockSoundGroup.CHERRY_LEAVES));
    public static final Block BLUSH_SAKURA_BLOSSOM_PILE = registerBlock("blush_sakura_blossom_pile",
            HealerBlockSettings.createPileBlock(MapColor.PINK, BlockSoundGroup.CHERRY_LEAVES));
    public static final Block BLUSH_SAKURA_SAPLING = registerBlock("blush_sakura_sapling",
            HealerBlockSettings.createSaplingBlock(ModSaplingGenerators.BLUSH_SAKURA, MapColor.PINK, BlockSoundGroup.CHERRY_SAPLING));
    public static final Block POTTED_BLUSH_SAKURA_SAPLING = registerBlockWithoutBlockItem("potted_blush_sakura_sapling",
            HealerBlockSettings.createFlowerPotBlock(BLUSH_SAKURA_SAPLING));




    public static final Block SAKURA_STAIRS = registerBlock("sakura_stairs",
            HealerBlockSettings.createWoodenStairsBlock(SAKURA_PLANKS.getDefaultState().getBlock(), MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block SAKURA_SLAB = registerBlock("sakura_slab",
            HealerBlockSettings.createWoodenSlabsBlock(MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block SAKURA_BUTTON = registerBlock("sakura_button",
            HealerBlockSettings.createWoodenButtonBlock(BlockSetType.CHERRY));
    public static final Block SAKURA_PRESSURE_PLATE = registerBlock("sakura_pressure_plate",
            HealerBlockSettings.createWoodenPressurePlateBlock(BlockSetType.CHERRY, MapColor.TERRACOTTA_BROWN));
    public static final Block SAKURA_FENCE = registerBlock("sakura_fence",
            HealerBlockSettings.createWoodenFenceBlock(MapColor.TERRACOTTA_BROWN, BlockSoundGroup.CHERRY_WOOD));
    public static final Block SAKURA_FENCE_GATE = registerBlock("sakura_fence_gate",
            HealerBlockSettings.createWoodenFenceGateBlock(WoodType.CHERRY, MapColor.TERRACOTTA_BROWN));
    public static final Block SAKURA_DOOR = registerBlock("sakura_door",
            HealerBlockSettings.createDoorBlock(BlockSetType.CHERRY, MapColor.TERRACOTTA_BROWN));
    public static final Block SAKURA_TRAPDOOR = registerBlock("sakura_trapdoor",
            HealerBlockSettings.createTrapDoorBlock(BlockSetType.CHERRY, MapColor.TERRACOTTA_BROWN));


    public static final Identifier SAKURA_SIGN_TEXTURE = Identifier.of(BetterBiomes.MOD_ID, "entity/signs/sakura");
    public static final Identifier SAKURA_HANGING_SIGN_TEXTURE = Identifier.of(BetterBiomes.MOD_ID, "entity/signs/hanging/sakura");
    public static final Identifier SAKURA_HANGING_GUI_SIGN_TEXTURE = Identifier.of(BetterBiomes.MOD_ID, "textures/gui/hanging_signs/sakura");
    public static final Block STANDING_SAKURA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "sakura_sign"),
            new TerraformSignBlock(SAKURA_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(SAKURA_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()));
    public static final Block WALL_SAKURA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "sakura_wall_sign"),
            new TerraformWallSignBlock(SAKURA_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).dropsLike(STANDING_SAKURA_SIGN).burnable()));
    public static final Block HANGING_SAKURA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "sakura_hanging_sign"),
            new TerraformHangingSignBlock(SAKURA_HANGING_SIGN_TEXTURE, SAKURA_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(SAKURA_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()));
    public static final Block WALL_HANGING_SAKURA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, "sakura_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SAKURA_HANGING_SIGN_TEXTURE, SAKURA_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.create().mapColor(SAKURA_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(HANGING_SAKURA_SIGN)));

    public static final BlockFamily SAKURA_FAMILY = BlockFamilies.register(SAKURA_PLANKS)
            .sign(STANDING_SAKURA_SIGN, WALL_SAKURA_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();




    public static final Item SAKURA_SIGN = registerItem("sakura_sign",
            new SignItem(new Item.Settings().maxCount(16), STANDING_SAKURA_SIGN, WALL_SAKURA_SIGN));
    public static final Item SAKURA_HANGING_SIGN = registerItem("sakura_hanging_sign",
            new HangingSignItem(HANGING_SAKURA_SIGN, WALL_HANGING_SAKURA_SIGN, new Item.Settings().maxCount(16)));



    public static final Identifier SAKURA_BOAT_ID = Identifier.of(BetterBiomes.MOD_ID, "sakura_boat");
    public static final Identifier SAKURA_CHEST_BOAT_ID =  Identifier.of(BetterBiomes.MOD_ID, "sakura_chest_boat");

    public static final RegistryKey<TerraformBoatType> SAKURA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SAKURA_BOAT_ID);

    public static final Item SAKURA_BOAT = TerraformBoatItemHelper.registerBoatItem(SakuraContent.SAKURA_BOAT_ID, SakuraContent.SAKURA_BOAT_KEY, false);
    public static final Item SAKURA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(SakuraContent.SAKURA_CHEST_BOAT_ID, SakuraContent.SAKURA_BOAT_KEY, true);


    public static void appendBoats() {
        TerraformBoatType SakuraBoat = new TerraformBoatType.Builder()
                .item(SakuraContent.SAKURA_BOAT)
                .chestItem(SakuraContent.SAKURA_CHEST_BOAT)
                .planks(SakuraContent.SAKURA_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SAKURA_BOAT_KEY, SakuraBoat);






        appendItemGroups();
        appendVillagerTrades();
        appendSakuraSettings();
        appendWorldGen();
    }


    public static void appendItemGroups() {

        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, entries -> entries.addAfter(Blocks.BIRCH_BUTTON,
                SAKURA_LOG,
                SAKURA_WOOD,
                STRIPPED_SAKURA_LOG,
                STRIPPED_SAKURA_WOOD,
                SAKURA_PLANKS,
                SAKURA_STAIRS,
                SAKURA_SLAB,
                SAKURA_FENCE,
                SAKURA_FENCE_GATE,
                SAKURA_DOOR,
                SAKURA_TRAPDOOR,
                SAKURA_PRESSURE_PLATE,
                SAKURA_BUTTON));


        ItemGroupHelper.append(ItemGroups.NATURAL, entries -> {
            entries.addAfter(Blocks.BIRCH_LOG, SAKURA_LOG);
            entries.addAfter(Blocks.BIRCH_LEAVES, BLUSH_SAKURA_BLOSSOMS, BLUSH_SAKURA_BLOSSOM_PILE, COTTON_SAKURA_BLOSSOMS, COTTON_SAKURA_BLOSSOM_PILE);
            entries.addAfter(Blocks.BIRCH_SAPLING, BLUSH_SAKURA_SAPLING, COTTON_SAKURA_SAPLING);

        });
        ItemGroupHelper.append(ItemGroups.FUNCTIONAL, entries -> {
            entries.addAfter(Items.BIRCH_HANGING_SIGN, SAKURA_SIGN, HANGING_SAKURA_SIGN);
        });
        ItemGroupHelper.append(ItemGroups.TOOLS, entries -> {
            entries.addAfter(Items.BIRCH_CHEST_BOAT, SAKURA_BOAT, SAKURA_CHEST_BOAT);
        });
    }



    public static void appendVillagerTrades() {

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(BLUSH_SAKURA_SAPLING, 1),
                        8, 1, 0.05f)));


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 5),
                        new ItemStack(COTTON_SAKURA_SAPLING, 1),
                        8, 1, 0.05f)));


    }



    public static void appendSakuraSettings() {


        StrippableBlockRegistry.register(SakuraContent.SAKURA_LOG, SakuraContent.STRIPPED_SAKURA_LOG);
        StrippableBlockRegistry.register(SakuraContent.SAKURA_WOOD, SakuraContent.STRIPPED_SAKURA_WOOD);


        CompostingChanceRegistry.INSTANCE.add(SakuraContent.BLUSH_SAKURA_BLOSSOM_PILE, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(SakuraContent.COTTON_SAKURA_BLOSSOM_PILE, 0.3F);


        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(SAKURA_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_SAKURA_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_SAKURA_WOOD, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(BLUSH_SAKURA_BLOSSOMS, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(COTTON_SAKURA_BLOSSOMS, 30, 60);


        FlammableBlockRegistry.getDefaultInstance().add(BLUSH_SAKURA_BLOSSOM_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(COTTON_SAKURA_BLOSSOM_PILE, 30, 60);


    }

    public static void appendWorldGen() {


        BiomePlacement.addOverworld(ModBiomeKeys.SAKURA_GROVES,
                new MultiNoiseUtil.NoiseHypercube(
                        MultiNoiseUtil.ParameterRange.of(-0.8f, -0.1f),
                        MultiNoiseUtil.ParameterRange.of(-0.7f, 0.2f),
                        MultiNoiseUtil.ParameterRange.of(0.3f, 0.8f),
                        MultiNoiseUtil.ParameterRange.of(-0.4f, 0.1f),
                        MultiNoiseUtil.ParameterRange.of(-5F),
                        MultiNoiseUtil.ParameterRange.of(0.5f, 3.0f),
                        0L
                ));
        BiomePlacement.replaceOverworld(BiomeKeys.PLAINS, ModBiomeKeys.SAKURA_GROVES);



        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_GROVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.COTTON_SAKURA_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_GROVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.COTTON_BEES_SAKURA_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_GROVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUSH_SAKURA_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_GROVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUSH_BEES_SAKURA_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_GROVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.COTTON_PILE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_GROVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUSH_PILE_KEY);



    }




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name), item);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }
}
