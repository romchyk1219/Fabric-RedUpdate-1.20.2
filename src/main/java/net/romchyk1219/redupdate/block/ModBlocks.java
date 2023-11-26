package net.romchyk1219.redupdate.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romchyk1219.redupdate.RedUpdate;
import net.romchyk1219.redupdate.block.custom.TomatoCropBlock;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BRIGHT_RED)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BRIGHT_RED)));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BRIGHT_RED)));

    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BRIGHT_RED), BlockSetType.IRON, 10, true));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BRIGHT_RED), BlockSetType.IRON));

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.OAK));
    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.STONE));
    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.STONE));

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(RedUpdate.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RedUpdate.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RedUpdate.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        RedUpdate.LOGGER.info("Registering ModBlocks for " + RedUpdate.MOD_ID);
    }
}
