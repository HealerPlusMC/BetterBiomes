package net.betterbiomes.registry.content;

import net.betterbiomes.BetterBiomes;
import net.betterbiomes.block.BlueBerryBushBlock;
import net.healer.item.ItemGroupHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FoodContent {



   public static final Item BLUE_BERRIES = registerItem("blue_berries",
           new AliasedBlockItem(FoodContent.BLUE_BERRY_BUSH, new Item.Settings().food(FoodComponents.SWEET_BERRIES)));


   public static final Block BLUE_BERRY_BUSH = registerBlockWithoutBlockItem("blue_berry_bush",
           new BlueBerryBushBlock(AbstractBlock.Settings.create()));


    public static void appendItemGroups() {

        ItemGroupHelper.append(ItemGroups.BUILDING_BLOCKS, entries -> entries.addAfter(Items.SWEET_BERRIES,
                BLUE_BERRIES));

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name), item);
    }



    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }


}
