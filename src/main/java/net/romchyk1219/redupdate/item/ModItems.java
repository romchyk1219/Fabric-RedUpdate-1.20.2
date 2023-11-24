package net.romchyk1219.redupdate.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romchyk1219.redupdate.RedUpdate;
import net.romchyk1219.redupdate.block.ModBlocks;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    private static void addItemsToFoodAndDrinkTabGroup(FabricItemGroupEntries entries) {
        entries.add(TOMATO);
    }

    private static void addItemsToBuildingBlocksTabGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.RUBY_BLOCK);
        entries.add(ModBlocks.RUBY_STAIRS);
        entries.add(ModBlocks.RUBY_SLAB);
        entries.add(ModBlocks.RUBY_BUTTON);
        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
        entries.add(ModBlocks.RUBY_FENCE);
        entries.add(ModBlocks.RUBY_FENCE_GATE);
        entries.add(ModBlocks.RUBY_DOOR);
        entries.add(ModBlocks.RUBY_TRAPDOOR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RedUpdate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RedUpdate.LOGGER.info("Registering Mod Items for " + RedUpdate.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksTabGroup);
    }
}
