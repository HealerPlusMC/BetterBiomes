package net.betterbiomes.util;

import net.betterbiomes.BetterBiomes;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {


    public static final TagKey<Item> MAPLE_LOGS = createTag("maple_logs");
    public static final TagKey<Item> SAKURA_LOGS = createTag("sakura_logs");


    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(BetterBiomes.MOD_ID, name));
    }
}
