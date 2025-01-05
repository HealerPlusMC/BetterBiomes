package net.betterbiomes.datagen;

import net.betterbiomes.registry.content.MapleContent;
import net.betterbiomes.registry.content.SakuraContent;
import net.betterbiomes.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {




        //TODO : MAPLE_CONTENT


        offerPlanksRecipe(exporter, MapleContent.MAPLE_PLANKS, ModItemTags.MAPLE_LOGS, 4);

        offerBarkBlockRecipe(exporter, MapleContent.MAPLE_WOOD, MapleContent.MAPLE_LOG);
        offerBarkBlockRecipe(exporter, MapleContent.STRIPPED_MAPLE_WOOD, MapleContent.STRIPPED_MAPLE_LOG);




        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MapleContent.MAPLE_SLAB, MapleContent.MAPLE_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleContent.MAPLE_STAIRS, 4)
                .pattern("  R")
                .pattern(" RR")
                .pattern("RRR")
                .input('R', MapleContent.MAPLE_PLANKS)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleContent.MAPLE_SIGN, 3)
                .pattern("RRR")
                .pattern("RRR")
                .pattern(" X ")
                .input('R', MapleContent.MAPLE_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);
        offerHangingSignRecipe(exporter, MapleContent.MAPLE_HANGING_SIGN, MapleContent.STRIPPED_MAPLE_LOG);




        offerBoatRecipe(exporter, MapleContent.MAPLE_BOAT, MapleContent.MAPLE_PLANKS);
        offerChestBoatRecipe(exporter, MapleContent.MAPLE_CHEST_BOAT, MapleContent.MAPLE_BOAT);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleContent.MAPLE_DOOR, 3)
                .pattern(" RR")
                .pattern(" RR")
                .pattern(" RR")
                .input('R', MapleContent.MAPLE_PLANKS)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleContent.MAPLE_TRAPDOOR, 2)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("   ")
                .input('R', MapleContent.MAPLE_PLANKS)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleContent.MAPLE_PRESSURE_PLATE)
                .pattern(" RR")
                .pattern("   ")
                .pattern("   ")
                .input('R', MapleContent.MAPLE_PLANKS)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleContent.MAPLE_BUTTON)
                .input(MapleContent.MAPLE_PLANKS)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleContent.MAPLE_FENCE, 3)
                .pattern("RSR")
                .pattern("RSR")
                .pattern("   ")
                .input('R', MapleContent.MAPLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleContent.MAPLE_FENCE_GATE)
                .pattern("SRS")
                .pattern("SRS")
                .pattern("   ")
                .input('R', MapleContent.MAPLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(MapleContent.MAPLE_PLANKS), conditionsFromItem(MapleContent.MAPLE_PLANKS))
                .offerTo(exporter);



        //TODO : SAKURA_CONTENT



        offerPlanksRecipe(exporter, SakuraContent.SAKURA_PLANKS, ModItemTags.SAKURA_LOGS, 4);

        offerBarkBlockRecipe(exporter, SakuraContent.SAKURA_WOOD, SakuraContent.SAKURA_LOG);
        offerBarkBlockRecipe(exporter, SakuraContent.STRIPPED_SAKURA_WOOD, SakuraContent.STRIPPED_SAKURA_LOG);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SakuraContent.SAKURA_SLAB, SakuraContent.SAKURA_LOG);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SakuraContent.SAKURA_STAIRS, 4)
                .pattern("  R")
                .pattern(" RR")
                .pattern("RRR")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, SakuraContent.SAKURA_SIGN, 3)
                .pattern("RRR")
                .pattern("RRR")
                .pattern(" X ")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);
        offerHangingSignRecipe(exporter, SakuraContent.SAKURA_HANGING_SIGN, SakuraContent.STRIPPED_SAKURA_LOG);

        offerBoatRecipe(exporter, SakuraContent.SAKURA_BOAT, SakuraContent.SAKURA_PLANKS);
        offerChestBoatRecipe(exporter, SakuraContent.SAKURA_CHEST_BOAT, SakuraContent.SAKURA_BOAT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SakuraContent.SAKURA_DOOR, 3)
                .pattern(" RR")
                .pattern(" RR")
                .pattern(" RR")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SakuraContent.SAKURA_TRAPDOOR, 2)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("   ")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, SakuraContent.SAKURA_PRESSURE_PLATE)
                .pattern(" RR")
                .pattern("   ")
                .pattern("   ")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, SakuraContent.SAKURA_BUTTON)
                .input(SakuraContent.SAKURA_PLANKS)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, SakuraContent.SAKURA_FENCE, 3)
                .pattern("RSR")
                .pattern("RSR")
                .pattern("   ")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, SakuraContent.SAKURA_FENCE_GATE)
                .pattern("SRS")
                .pattern("SRS")
                .pattern("   ")
                .input('R', SakuraContent.SAKURA_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(SakuraContent.SAKURA_PLANKS), conditionsFromItem(SakuraContent.SAKURA_PLANKS))
                .offerTo(exporter);

    }
}
