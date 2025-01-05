package net.betterbiomes.datagen;

import net.betterbiomes.block.BlueBerryBushBlock;
import net.betterbiomes.registry.content.FoodContent;
import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;



public class ModModelsProvider extends FabricModelProvider {

    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {



        // MAPLE_CONTENT
        blockStateModelGenerator.registerLog(MapleContent.MAPLE_LOG).log(MapleContent.MAPLE_LOG).wood(MapleContent.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(MapleContent.STRIPPED_MAPLE_LOG).log(MapleContent.STRIPPED_MAPLE_LOG).wood(MapleContent.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSingleton(MapleContent.VERMILION_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(MapleContent.FULVOUS_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(MapleContent.MIKADO_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(MapleContent.SAP_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(MapleContent.VERMILION_MAPLE_SAPLING, MapleContent.POTTED_VERMILION_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleContent.MIKADO_MAPLE_SAPLING, MapleContent.POTTED_MIKADO_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleContent.FULVOUS_MAPLE_SAPLING, MapleContent.POTTED_FULVOUS_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleContent.SAP_MAPLE_SAPLING, MapleContent.POTTED_SAP_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        BlockStateModelGenerator.BlockTexturePool MaplePlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(MapleContent.MAPLE_PLANKS);
        MaplePlanks.stairs(MapleContent.MAPLE_STAIRS);
        MaplePlanks.slab(MapleContent.MAPLE_SLAB);
        MaplePlanks.button(MapleContent.MAPLE_BUTTON);
        MaplePlanks.pressurePlate(MapleContent.MAPLE_PRESSURE_PLATE);
        MaplePlanks.family(MapleContent.MAPLE_FAMILY);
        MaplePlanks.fence(MapleContent.MAPLE_FENCE);
        MaplePlanks.fenceGate(MapleContent.MAPLE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(MapleContent.MAPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(MapleContent.MAPLE_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(MapleContent.STRIPPED_MAPLE_LOG, MapleContent.HANGING_MAPLE_SIGN, MapleContent.WALL_HANGING_MAPLE_SIGN);


        // SAKURA_CONTENT



        blockStateModelGenerator.registerLog(SakuraContent.SAKURA_LOG).log(SakuraContent.SAKURA_LOG).wood(SakuraContent.SAKURA_WOOD);
        blockStateModelGenerator.registerLog(SakuraContent.STRIPPED_SAKURA_LOG).log(SakuraContent.STRIPPED_SAKURA_LOG).wood(SakuraContent.STRIPPED_SAKURA_WOOD);
        blockStateModelGenerator.registerSingleton(SakuraContent.BLUSH_SAKURA_BLOSSOMS, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(SakuraContent.COTTON_SAKURA_BLOSSOMS, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(SakuraContent.BLUSH_SAKURA_SAPLING, SakuraContent.POTTED_BLUSH_SAKURA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(SakuraContent.COTTON_SAKURA_SAPLING, SakuraContent.POTTED_COTTON_SAKURA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        BlockStateModelGenerator.BlockTexturePool SakuraPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(SakuraContent.SAKURA_PLANKS);
        SakuraPlanks.stairs(SakuraContent.SAKURA_STAIRS);
        SakuraPlanks.slab(SakuraContent.SAKURA_SLAB);
        SakuraPlanks.button(SakuraContent.SAKURA_BUTTON);
        SakuraPlanks.pressurePlate(SakuraContent.SAKURA_PRESSURE_PLATE);
        SakuraPlanks.family(SakuraContent.SAKURA_FAMILY);
        SakuraPlanks.fence(SakuraContent.SAKURA_FENCE);
        SakuraPlanks.fenceGate(SakuraContent.SAKURA_FENCE_GATE);
        blockStateModelGenerator.registerDoor(SakuraContent.SAKURA_DOOR);
        blockStateModelGenerator.registerTrapdoor(SakuraContent.SAKURA_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(SakuraContent.STRIPPED_SAKURA_LOG, SakuraContent.HANGING_SAKURA_SIGN, SakuraContent.WALL_HANGING_SAKURA_SIGN);



        // FOOD_CONTENT

      blockStateModelGenerator.registerTintableCrossBlockStateWithStages(FoodContent.BLUE_BERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
              BlueBerryBushBlock.AGE, 0, 1, 2, 3);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


        // MAPLE_CONTENT

        itemModelGenerator.register(MapleContent.MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleContent.MAPLE_CHEST_BOAT, Models.GENERATED);


        // SAKURA_CONTENT

        itemModelGenerator.register(SakuraContent.SAKURA_BOAT, Models.GENERATED);
        itemModelGenerator.register(SakuraContent.SAKURA_CHEST_BOAT, Models.GENERATED);


    }
}
