package net.betterbiomes.world.biome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import static net.minecraft.world.gen.surfacebuilder.MaterialRules.*;
import static net.minecraft.world.gen.surfacebuilder.MaterialRules.sequence;




public class SurfaceRules {



    private static MaterialRules.MaterialRule block(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
    public static MaterialRules.MaterialRule overworld() {
        MaterialRules.MaterialRule CARNELIAN_TREEWAY = MaterialRules.condition(MaterialRules.biome(ModBiomeKeys.CARNELIAN_TREEWAY), sequence(
                condition(STONE_DEPTH_FLOOR, block(Blocks.GRASS_BLOCK)),
                condition(STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, block(Blocks.DIRT))));

        return sequence(
                CARNELIAN_TREEWAY
        );

    }
}
