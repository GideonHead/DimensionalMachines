package com.zepsun.dimensionalmachines.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_OPAL.get())
        //         .requires(ModBlocks.BLACK_OPAL_BLOCK.get())
        //         .unlockedBy("has_black_opal_block", inventoryTrigger(ItemPredicate.Builder.item()
        //                 .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
        //         .save(consumer);

        // ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
        //         .define('B', ModItems.BLACK_OPAL.get())
        //         .pattern("BBB")
        //         .pattern("BBB")
        //         .pattern("BBB")
        //         .unlockedBy("has_black_opal", inventoryTrigger(ItemPredicate.Builder.item()
        //                 .of(ModItems.BLACK_OPAL.get()).build()))
        //         .save(consumer);
    }
}
