package net.betterbiomes.datagen.tags;

import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {




        // MAPLE_CONTENT


        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                    .add(MapleContent.MAPLE_TRAPDOOR)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                    .add(MapleContent.MAPLE_STAIRS)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                    .add(MapleContent.MAPLE_FENCE)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                    .add(MapleContent.MAPLE_FENCE_GATE)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                    .add(MapleContent.MAPLE_BUTTON)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                    .add(MapleContent.MAPLE_PRESSURE_PLATE)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                    .add(MapleContent.MAPLE_DOOR)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                    .add(MapleContent.MAPLE_TRAPDOOR)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                    .add(MapleContent.WALL_HANGING_MAPLE_SIGN)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                    .add(MapleContent.STANDING_MAPLE_SIGN)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.LEAVES)
                    .add(MapleContent.FULVOUS_MAPLE_LEAVES)
                    .add(MapleContent.VERMILION_MAPLE_LEAVES)
                    .add(MapleContent.MIKADO_MAPLE_LEAVES)
                    .add(MapleContent.SAP_MAPLE_LEAVES)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.SAPLINGS)
                    .add(MapleContent.FULVOUS_MAPLE_SAPLING)
                    .add(MapleContent.VERMILION_MAPLE_SAPLING)
                    .add(MapleContent.MIKADO_MAPLE_SAPLING)
                    .add(MapleContent.SAP_MAPLE_SAPLING)
                    .setReplace(false);
            getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                    .add(MapleContent.MAPLE_LOG)
                    .add(MapleContent.MAPLE_WOOD)
                    .add(MapleContent.STRIPPED_MAPLE_LOG)
                    .add(MapleContent.STRIPPED_MAPLE_WOOD)
                    .setReplace(false);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(MapleContent.FULVOUS_MAPLE_LEAVES)
                .add(MapleContent.VERMILION_MAPLE_LEAVES)
                .add(MapleContent.MIKADO_MAPLE_LEAVES)
                .add(MapleContent.SAP_MAPLE_LEAVES);




        //  SAKURA_CONTENT


        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(SakuraContent.SAKURA_TRAPDOOR)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(SakuraContent.SAKURA_STAIRS)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(SakuraContent.SAKURA_FENCE)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(SakuraContent.SAKURA_FENCE_GATE)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(SakuraContent.SAKURA_BUTTON)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(SakuraContent.SAKURA_PRESSURE_PLATE)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(SakuraContent.SAKURA_DOOR)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(SakuraContent.SAKURA_TRAPDOOR)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(SakuraContent.WALL_HANGING_SAKURA_SIGN)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(SakuraContent.STANDING_SAKURA_SIGN)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(SakuraContent.BLUSH_SAKURA_BLOSSOMS)
                .add(SakuraContent.COTTON_SAKURA_BLOSSOMS)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(SakuraContent.BLUSH_SAKURA_SAPLING)
                .add(SakuraContent.COTTON_SAKURA_SAPLING)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(SakuraContent.SAKURA_LOG)
                .add(SakuraContent.SAKURA_WOOD)
                .add(SakuraContent.STRIPPED_SAKURA_LOG)
                .add(SakuraContent.STRIPPED_SAKURA_WOOD)
                .setReplace(false);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(SakuraContent.COTTON_SAKURA_BLOSSOMS)
                .add(SakuraContent.BLUSH_SAKURA_BLOSSOMS);



    }
}
