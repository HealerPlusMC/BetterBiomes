package net.betterbiomes.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us",  registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder TS) {

        TS.add("block.betterbiomes.maple_log", "Maple Log");
        TS.add("block.betterbiomes.stripped_maple_log", "Stripped Maple Log");
        TS.add("block.betterbiomes.stripped_maple_wood", "Stripped Maple Wood");
        TS.add("block.betterbiomes.maple_wood", "Maple Wood");
        TS.add("block.betterbiomes.maple_planks", "Maple Planks");
        TS.add("block.betterbiomes.fulvous_maple_leaves", "Fulvous Maple Leaves");
        TS.add("block.betterbiomes.mikado_maple_leaves", "Mikado Maple Leaves");
        TS.add("block.betterbiomes.vermilion_maple_leaves", "Vermilion Maple Leaves");
        TS.add("block.betterbiomes.sap_maple_leaves", "Sap Maple Leaves");
        TS.add("block.betterbiomes.mixed_fulvous_maple_leaf_pile", "Mixed Fulvous Maple Leaf Pile");
        TS.add("block.betterbiomes.fulvous_maple_leaf_pile", "Fulvous Maple Leaf Pile");
        TS.add("block.betterbiomes.mixed_mikado_maple_leaf_pile", "Mixed Mikado Maple Leaf Pile");
        TS.add("block.betterbiomes.mikado_maple_leaf_pile", "Mikado Maple Leaf Pile");
        TS.add("block.betterbiomes.mixed_vermilion_maple_leaf_pile", "Mixed Vermilion Maple Leaf Pile");
        TS.add("block.betterbiomes.vermilion_maple_leaf_pile", "Vermilion Maple Leaf Pile");
        TS.add("block.betterbiomes.sap_maple_leaf_pile", "Sap Maple Leaf Pile");
        TS.add("block.betterbiomes.potted_fulvous_maple_sapling", "Potted Fulvous Maple Sapling");
        TS.add("block.betterbiomes.fulvous_maple_sapling", "Fulvous Maple Sapling");
        TS.add("block.betterbiomes.potted_mikado_maple_sapling", "Potted Mikado Maple Sapling");
        TS.add("block.betterbiomes.mikado_maple_sapling", "Mikado Maple Sapling");
        TS.add("block.betterbiomes.potted_vermilion_maple_sapling", "Potted Vermilion Maple Sapling");
        TS.add("block.betterbiomes.vermilion_maple_sapling", "Vermilion Maple Sapling");
        TS.add("block.betterbiomes.sap_maple_sapling", "Sap Maple Sapling");
        TS.add("block.betterbiomes.maple_stairs", "Maple Stairs");
        TS.add("block.betterbiomes.maple_slab", "Maple Slab");
        TS.add("block.betterbiomes.maple_fence", "Maple Fence");
        TS.add("block.betterbiomes.maple_fence_gate", "Maple Fence Gate");
        TS.add("block.betterbiomes.maple_door", "Maple Door");
        TS.add("block.betterbiomes.maple_trapdoor", "Maple Trapdoor");
        TS.add("item.betterbiomes.maple_boat", "Maple Boat");
        TS.add("item.betterbiomes.maple_chest_boat", "Maple Chest Boat");
        TS.add("block.betterbiomes.maple_sign", "Maple Sign");
        TS.add("block.betterbiomes.maple_hanging_sign", "Maple Hanging Sign");
        TS.add("block.betterbiomes.maple_pressure_plate", "Maple Pressure Plate");
        TS.add("block.betterbiomes.maple_button", "Maple Button");

        TS.add("block.betterbiomes.sakura_log", "Sakura Log");
        TS.add("block.betterbiomes.stripped_sakura_log", "Stripped Sakura Log");
        TS.add("block.betterbiomes.stripped_sakura_wood", "Stripped Sakura Wood");
        TS.add("block.betterbiomes.sakura_wood", "Sakura Wood");
        TS.add("block.betterbiomes.sakura_planks", "Sakura Planks");
        TS.add("block.betterbiomes.cotton_sakura_leaves", "Blush Sakura Blossom");
        TS.add("block.betterbiomes.blush_sakura_leaves", "Cotton Sakura Blossom");
        TS.add("block.betterbiomes.cotton_sakura_leaf_pile", "Blush Sakura Blossom Pile");
        TS.add("block.betterbiomes.blush_sakura_leaf_pile", "Cotton Sakura Blossom Pile");
        TS.add("block.betterbiomes.potted_blush_sakura_sapling", "Potted Blush Sakura Sapling");
        TS.add("block.betterbiomes.blush_sakura_sapling", "Blush Sakura Sapling");
        TS.add("block.betterbiomes.potted_cotton_sakura_sapling", "Potted Cotton Sakura Sapling");
        TS.add("block.betterbiomes.cotton_sakura_sapling", "Cotton Sakura Sapling");
        TS.add("block.betterbiomes.sakura_stairs", "Sakura Stairs");
        TS.add("block.betterbiomes.sakura_slab", "Sakura Slab");
        TS.add("block.betterbiomes.sakura_fence", "Sakura Fence");
        TS.add("block.betterbiomes.sakura_fence_gate", "Sakura Fence Gate");
        TS.add("block.betterbiomes.sakura_door", "Sakura Door");
        TS.add("block.betterbiomes.sakura_trapdoor", "Sakura Trapdoor");
        TS.add("item.betterbiomes.sakura_boat", "Sakura Boat");
        TS.add("item.betterbiomes.sakura_chest_boat", "Sakura Chest Boat");
        TS.add("block.betterbiomes.sakura_sign", "Sakura Sign");
        TS.add("block.betterbiomes.sakura_hanging_sign", "Sakura Hanging Sign");
        TS.add("block.betterbiomes.sakura_pressure_plate", "Sakura Pressure Plate");
        TS.add("block.betterbiomes.sakura_button", "Sakura Button");

        TS.add("biome.betterbiomes.carnelian_treeway", "Carnelian Treeway");
        TS.add("biome.betterbiomes.sakura_groves", "Sakura Groves");

    }
}
