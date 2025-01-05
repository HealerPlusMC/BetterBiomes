package net.betterbiomes.datagen.tags;

import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.betterbiomes.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        //  MAPLE_CONTENT

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(MapleContent.MAPLE_PLANKS.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(MapleContent.MAPLE_SLAB.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(MapleContent.MAPLE_STAIRS.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(MapleContent.MAPLE_DOOR.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(MapleContent.MAPLE_TRAPDOOR.asItem())
                .setReplace(false);



        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(MapleContent.MAPLE_BUTTON.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(MapleContent.MAPLE_PRESSURE_PLATE.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(MapleContent.MAPLE_FENCE.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(MapleContent.MAPLE_FENCE_GATE.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(MapleContent.MAPLE_BOAT.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(MapleContent.MAPLE_CHEST_BOAT.asItem())
                .setReplace(false);



        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(MapleContent.HANGING_MAPLE_SIGN.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(MapleContent.STANDING_MAPLE_SIGN.asItem())
                .setReplace(false);



        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(MapleContent.MAPLE_LOG.asItem())
                .add(MapleContent.MAPLE_WOOD.asItem())
                .add(MapleContent.STRIPPED_MAPLE_LOG.asItem())
                .add(MapleContent.STRIPPED_MAPLE_WOOD.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ModItemTags.MAPLE_LOGS)
                .add(MapleContent.MAPLE_LOG.asItem())
                .add(MapleContent.STRIPPED_MAPLE_LOG.asItem())
                .add(MapleContent.MAPLE_WOOD.asItem())
                .add(MapleContent.STRIPPED_MAPLE_WOOD.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(MapleContent.MIKADO_MAPLE_LEAVES.asItem())
                .add(MapleContent.VERMILION_MAPLE_LEAVES.asItem())
                .add(MapleContent.FULVOUS_MAPLE_LEAVES.asItem())
                .setReplace(false);

        //  SAKURA_CONTENT


        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(SakuraContent.SAKURA_PLANKS.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(SakuraContent.SAKURA_SLAB.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(SakuraContent.SAKURA_STAIRS.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(SakuraContent.SAKURA_DOOR.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(SakuraContent.SAKURA_TRAPDOOR.asItem())
                .setReplace(false);



        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(SakuraContent.SAKURA_BUTTON.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(SakuraContent.SAKURA_PRESSURE_PLATE.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(SakuraContent.SAKURA_FENCE.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(SakuraContent.SAKURA_FENCE_GATE.asItem())
                .setReplace(false);

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(SakuraContent.SAKURA_BOAT.asItem())
                .setReplace(false);
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(SakuraContent.SAKURA_CHEST_BOAT.asItem())
                .setReplace(false);



        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(SakuraContent.HANGING_SAKURA_SIGN.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(SakuraContent.STANDING_SAKURA_SIGN.asItem())
                .setReplace(false);



        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(SakuraContent.SAKURA_LOG.asItem())
                .add(SakuraContent.SAKURA_WOOD.asItem())
                .add(SakuraContent.STRIPPED_SAKURA_LOG.asItem())
                .add(SakuraContent.STRIPPED_SAKURA_WOOD.asItem())
                .setReplace(false);


        getOrCreateTagBuilder(ModItemTags.SAKURA_LOGS)
                .add(SakuraContent.SAKURA_LOG.asItem())
                .add(SakuraContent.STRIPPED_SAKURA_LOG.asItem())
                .add(SakuraContent.SAKURA_WOOD.asItem())
                .add(SakuraContent.STRIPPED_SAKURA_WOOD.asItem())
                .setReplace(false);
    }
}
