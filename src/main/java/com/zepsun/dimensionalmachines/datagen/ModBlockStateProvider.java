package com.zepsun.dimensionalmachines.datagen;

import com.zepsun.dimensionalmachines.DimensionalMachines;
import com.zepsun.dimensionalmachines.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DimensionalMachines.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Transpar
        blockWithItem(ModBlocks.TRANSPAR_COMPOST);
        blockWithItem(ModBlocks.TRANSPAR_LEAVES);
        blockWithItem(ModBlocks.TRANSPAR_PLANKS);

        // Crepe Myrtle
        blockWithItem(ModBlocks.CREPE_MYRTLE_COMPOST);
        blockWithItem(ModBlocks.CREPE_MYRTLE_LEAVES);
        blockWithItem(ModBlocks.CREPE_MYRTLE_PLANKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    //private void horizontalPillarBlockWithItem(RegistryObject<Block> blockRegistryObject) {
    //    simpleBlockWithItem(blockRegistryObject.get(), itemModels().cubeColumnHorizontal(blockRegistryObject.get() + "_side"));
    //}
}
