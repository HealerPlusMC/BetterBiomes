package net.betterbiomes.world.tree;

import net.betterbiomes.BetterBiomes;
import net.betterbiomes.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {



    /*----------Maple---------------*/
    public static final SaplingGenerator FULVOUS_MAPLE = new SaplingGenerator(BetterBiomes.MOD_ID + "fulvous",
            Optional.empty(), Optional.of(ModConfiguredFeatures.FULVOUS_MAPLE_KEY), Optional.empty());
    public static final SaplingGenerator MIKADO_MAPLE = new SaplingGenerator(BetterBiomes.MOD_ID + ":mikado",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MIKADO_MAPLE_KEY), Optional.empty());
    public static final SaplingGenerator VERMILION_MAPLE = new SaplingGenerator(BetterBiomes.MOD_ID + ":vermilion",
            Optional.empty(), Optional.of(ModConfiguredFeatures.VERMILION_MAPLE_KEY), Optional.empty());
    public static final SaplingGenerator SAP_MAPLE = new SaplingGenerator(BetterBiomes.MOD_ID + ":sap",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SAP_MAPLE_KEY), Optional.empty());



    /*----------Sakura---------------*/
    public static final SaplingGenerator BLUSH_SAKURA = new SaplingGenerator(BetterBiomes.MOD_ID + ":blush",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLUSH_SAKURA_KEY), Optional.empty());
    public static final SaplingGenerator COTTON_SAKURA = new SaplingGenerator(BetterBiomes.MOD_ID + ":cotton",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COTTON_SAKURA_KEY), Optional.empty());
}