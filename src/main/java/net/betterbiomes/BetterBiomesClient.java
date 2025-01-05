package net.betterbiomes;


import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.betterbiomes.particle.FloatingParticle;
import net.betterbiomes.particle.ModParticles;
import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.world.biome.FoliageColors;
import net.minecraft.world.biome.GrassColors;

import java.util.Objects;

import static net.betterbiomes.registry.content.MapleContent.MAPLE_BOAT_ID;
import static net.betterbiomes.registry.content.SakuraContent.SAKURA_BOAT_ID;

public class BetterBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {



        /*---------------Maple----------------------*/

        Block[] MapleCutoutMippedBlocks = {
                MapleContent.FULVOUS_MAPLE_PILE,
                MapleContent.VERMILION_MAPLE_PILE,
                MapleContent.MIKADO_MAPLE_PILE,
                MapleContent.SAP_MAPLE_PILE,
                MapleContent.FULVOUS_MAPLE_LEAVES,
                MapleContent.VERMILION_MAPLE_LEAVES,
                MapleContent.MIKADO_MAPLE_LEAVES,
                MapleContent.SAP_MAPLE_LEAVES,

        };
        for (Block Block : MapleCutoutMippedBlocks) {
            BlockRenderLayerMap.INSTANCE.putBlock(Block, RenderLayer.getCutoutMipped());
        }
        Block[] MapleCutoutBlocks = {
                MapleContent.VERMILION_MAPLE_SAPLING,
                MapleContent.POTTED_VERMILION_MAPLE_SAPLING,
                MapleContent.FULVOUS_MAPLE_SAPLING,
                MapleContent.POTTED_FULVOUS_MAPLE_SAPLING,
                MapleContent.MIKADO_MAPLE_SAPLING,
                MapleContent.POTTED_MIKADO_MAPLE_SAPLING,
                MapleContent.SAP_MAPLE_SAPLING,
                MapleContent.POTTED_SAP_MAPLE_SAPLING,
                MapleContent.MAPLE_DOOR,
                MapleContent.MAPLE_TRAPDOOR
        };
        for (Block Block : MapleCutoutBlocks) {
            BlockRenderLayerMap.INSTANCE.putBlock(Block, RenderLayer.getCutout());
        }
        TerraformBoatClientHelper.registerModelLayers(MAPLE_BOAT_ID, false);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAPLE_LEAF, FloatingParticle.MapleLeafFactory::new);



        /*---------------Sakura----------------------*/

        Block[] SakuraCutoutMippedBlocks = {
                SakuraContent.BLUSH_SAKURA_BLOSSOM_PILE,
                SakuraContent.COTTON_SAKURA_BLOSSOM_PILE,
                SakuraContent.BLUSH_SAKURA_BLOSSOMS,
                SakuraContent.COTTON_SAKURA_BLOSSOMS
        };

        for (Block Block : SakuraCutoutMippedBlocks) {
            BlockRenderLayerMap.INSTANCE.putBlock(Block, RenderLayer.getCutoutMipped());
        }

        Block[] SakuraCutoutBlocks = {
                SakuraContent.BLUSH_SAKURA_SAPLING,
                SakuraContent.POTTED_BLUSH_SAKURA_SAPLING,
                SakuraContent.COTTON_SAKURA_SAPLING,
                SakuraContent.POTTED_COTTON_SAKURA_SAPLING,
                SakuraContent.SAKURA_DOOR,
                SakuraContent.SAKURA_TRAPDOOR
        };

        for (Block Block : SakuraCutoutBlocks) {
            BlockRenderLayerMap.INSTANCE.putBlock(Block, RenderLayer.getCutout());
        }

        ParticleFactoryRegistry.getInstance().register(ModParticles.SAKURA_LEAF, FloatingParticle.BlossomFactory::new);
        TerraformBoatClientHelper.registerModelLayers(SAKURA_BOAT_ID, false);

        /*---------------Colors----------------------*/

        BetterBiomesClient.RegBlockColors();
        BetterBiomesClient.RegItemColors();

    }

    private static final int SAP_MAPLE_COLOR = 10931465;


    private static void RegBlockColors() {

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> pos != null && world != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(), MapleContent.SAP_MAPLE_LEAVES, MapleContent.SAP_MAPLE_PILE);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
        if (world == null || pos == null) {
            return GrassColors.getColor(0.5, 1.0);
        }
        return BiomeColors.getGrassColor(world, pos);
    });

    }



    private static void RegItemColors() {

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            BlockState blockState = block.getDefaultState();
            return Objects.requireNonNull(ColorProviderRegistry.BLOCK.get(block)).getColor(blockState, null, null, tintIndex);
        }, MapleContent.SAP_MAPLE_PILE);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SAP_MAPLE_COLOR, MapleContent.SAP_MAPLE_LEAVES, MapleContent.SAP_MAPLE_PILE);
    }
}