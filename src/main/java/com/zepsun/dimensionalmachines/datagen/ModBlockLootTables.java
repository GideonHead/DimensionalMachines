package com.zepsun.dimensionalmachines.datagen;

import com.zepsun.dimensionalmachines.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Iterator;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }



    @Override
    protected void generate() {

        //transpar
        dropSelf(ModBlocks.TRANSPAR_LEAVES.get());
        dropSelf(ModBlocks.TRANSPAR_LOG.get());
        dropSelf(ModBlocks.TRANSPAR_COMPOST.get());
        dropSelf(ModBlocks.TRANSPAR_PLANKS.get());
        dropSelf(ModBlocks.TRANSPAR_SAPLING.get());
        dropSelf(ModBlocks.TRANSPAR_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_TRANSPAR_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_TRANSPAR_LOG.get());

        //crepe_myrtle
        dropSelf(ModBlocks.CREPE_MYRTLE_LEAVES.get());
        dropSelf(ModBlocks.CREPE_MYRTLE_LOG.get());
        dropSelf(ModBlocks.CREPE_MYRTLE_COMPOST.get());
        dropSelf(ModBlocks.CREPE_MYRTLE_PLANKS.get());
        dropSelf(ModBlocks.CREPE_MYRTLE_SAPLING.get());
        dropSelf(ModBlocks.CREPE_MYRTLE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_CREPE_MYRTLE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_CREPE_MYRTLE_LOG.get());

        //add(ModBlocks.EXAMPLE_ORE.get(),
        //        (block) -> createOreDrop(ModBlocks.EXAMPLE_ORE.get(), ModBlocks.EXAMPLE_GEM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
