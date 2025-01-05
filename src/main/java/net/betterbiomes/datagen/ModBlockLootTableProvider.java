package net.betterbiomes.datagen;

import net.betterbiomes.block.BlueBerryBushBlock;
import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.betterbiomes.registry.content.FoodContent.BLUE_BERRIES;
import static net.betterbiomes.registry.content.FoodContent.BLUE_BERRY_BUSH;


public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {


        addDrop(MapleContent.MAPLE_LOG);
        addDrop(MapleContent.MAPLE_WOOD);
        addDrop(MapleContent.STRIPPED_MAPLE_LOG);
        addDrop(MapleContent.STRIPPED_MAPLE_WOOD);
        addDrop(MapleContent.MAPLE_PLANKS);
        addDrop(MapleContent.FULVOUS_MAPLE_SAPLING);
        addDrop(MapleContent.MIKADO_MAPLE_SAPLING);
        addDrop(MapleContent.VERMILION_MAPLE_SAPLING);
        addDrop(MapleContent.SAP_MAPLE_SAPLING);
        addDrop(MapleContent.FULVOUS_MAPLE_LEAVES, leavesDrops(MapleContent.FULVOUS_MAPLE_LEAVES, MapleContent.FULVOUS_MAPLE_SAPLING, 0.0f));
        addDrop(MapleContent.MIKADO_MAPLE_LEAVES, leavesDrops(MapleContent.MIKADO_MAPLE_LEAVES, MapleContent.MIKADO_MAPLE_SAPLING, 0.0f));
        addDrop(MapleContent.VERMILION_MAPLE_LEAVES, leavesDrops(MapleContent.VERMILION_MAPLE_LEAVES, MapleContent.VERMILION_MAPLE_SAPLING, 0.0f));
        addDrop(MapleContent.SAP_MAPLE_LEAVES, leavesDrops(MapleContent.SAP_MAPLE_LEAVES, MapleContent.SAP_MAPLE_SAPLING, 0.0f));
        addDrop(MapleContent.FULVOUS_MAPLE_PILE);
        addDrop(MapleContent.MIKADO_MAPLE_PILE);
        addDrop(MapleContent.VERMILION_MAPLE_PILE);
        addDrop(MapleContent.SAP_MAPLE_PILE);
        addDrop(MapleContent.MAPLE_STAIRS);
        addDrop(MapleContent.MAPLE_SLAB,  slabDrops(MapleContent.MAPLE_SLAB));
        addDrop(MapleContent.MAPLE_BUTTON);
        addDrop(MapleContent.MAPLE_PRESSURE_PLATE);
        addDrop(MapleContent.MAPLE_FENCE);
        addDrop(MapleContent.MAPLE_FENCE_GATE);
        addDrop(MapleContent.MAPLE_DOOR, doorDrops(MapleContent.MAPLE_DOOR));
        addDrop(MapleContent.MAPLE_TRAPDOOR);
        addDrop(MapleContent.STANDING_MAPLE_SIGN, MapleContent.MAPLE_SIGN);
        addDrop(MapleContent.WALL_MAPLE_SIGN, MapleContent.MAPLE_SIGN);
        addDrop(MapleContent.HANGING_MAPLE_SIGN, MapleContent.MAPLE_HANGING_SIGN);
        addDrop(MapleContent.WALL_HANGING_MAPLE_SIGN, MapleContent.MAPLE_HANGING_SIGN);





        addDrop(SakuraContent.SAKURA_LOG);
        addDrop(SakuraContent.SAKURA_WOOD);
        addDrop(SakuraContent.STRIPPED_SAKURA_LOG);
        addDrop(SakuraContent.STRIPPED_SAKURA_WOOD);
        addDrop(SakuraContent.SAKURA_PLANKS);
        addDrop(SakuraContent.BLUSH_SAKURA_SAPLING);
        addDrop(SakuraContent.COTTON_SAKURA_SAPLING);
        addDrop(SakuraContent.BLUSH_SAKURA_BLOSSOMS, leavesDrops(SakuraContent.BLUSH_SAKURA_BLOSSOMS, SakuraContent.BLUSH_SAKURA_SAPLING, 0.0f));
        addDrop(SakuraContent.COTTON_SAKURA_BLOSSOMS, leavesDrops(SakuraContent.COTTON_SAKURA_BLOSSOMS, SakuraContent.COTTON_SAKURA_SAPLING, 0.0f));
        addDrop(SakuraContent.BLUSH_SAKURA_BLOSSOM_PILE);
        addDrop(SakuraContent.COTTON_SAKURA_BLOSSOM_PILE);
        addDrop(SakuraContent.SAKURA_STAIRS);
        addDrop(SakuraContent.SAKURA_SLAB, slabDrops(SakuraContent.SAKURA_SLAB));
        addDrop(SakuraContent.SAKURA_BUTTON);
        addDrop(SakuraContent.SAKURA_PRESSURE_PLATE);
        addDrop(SakuraContent.SAKURA_FENCE);
        addDrop(SakuraContent.SAKURA_FENCE_GATE);
        addDrop(SakuraContent.SAKURA_DOOR, doorDrops(SakuraContent.SAKURA_DOOR));
        addDrop(SakuraContent.SAKURA_TRAPDOOR);
        addDrop(SakuraContent.STANDING_SAKURA_SIGN, SakuraContent.SAKURA_SIGN);
        addDrop(SakuraContent.WALL_SAKURA_SIGN, SakuraContent.SAKURA_SIGN);
        addDrop(SakuraContent.HANGING_SAKURA_SIGN, SakuraContent.SAKURA_HANGING_SIGN);
        addDrop(SakuraContent.WALL_HANGING_SAKURA_SIGN, SakuraContent.SAKURA_HANGING_SIGN);







        // FoodContent
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        addDrop(BLUE_BERRY_BUSH,
          block -> this.applyExplosionDecay(
          block, LootTable.builder().pool(LootPool.builder().conditionally(
          BlockStatePropertyLootCondition.builder(BLUE_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(BlueBerryBushBlock.AGE, 3)))
         .with(ItemEntry.builder(BLUE_BERRIES))
         .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
         .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))
         .pool(LootPool.builder().conditionally(
         BlockStatePropertyLootCondition.builder(BLUE_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(BlueBerryBushBlock.AGE, 2))).with(ItemEntry.builder(BLUE_BERRIES))
        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));


    }
}
