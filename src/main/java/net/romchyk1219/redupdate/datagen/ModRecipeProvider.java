package net.romchyk1219.redupdate.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.romchyk1219.redupdate.block.ModBlocks;
import net.romchyk1219.redupdate.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY,
                RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        createStairsRecipe(ModBlocks.RUBY_STAIRS, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RUBY_SLAB, ModItems.RUBY);
        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.RUBY_PRESSURE_PLATE, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_PRESSURE_PLATE)));
        createFenceRecipe(ModBlocks.RUBY_FENCE, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_FENCE)));
        createFenceGateRecipe(ModBlocks.RUBY_FENCE_GATE, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_FENCE_GATE)));
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.RUBY_WALL, ModItems.RUBY);
        createDoorRecipe(ModBlocks.RUBY_DOOR, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_DOOR)));
        createTrapdoorRecipe(ModBlocks.RUBY_TRAPDOOR, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_TRAPDOOR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BUTTON).input(ModItems.RUBY).criterion(FabricRecipeProvider.hasItem(ModBlocks.RUBY_BUTTON),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.RUBY_BUTTON)).criterion(FabricRecipeProvider.hasItem(ModItems.RUBY),
                FabricRecipeProvider.conditionsFromItem(ModItems.RUBY)).offerTo(exporter);
    }
}
