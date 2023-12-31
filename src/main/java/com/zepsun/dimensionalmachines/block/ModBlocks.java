package com.zepsun.dimensionalmachines.block;

import com.zepsun.dimensionalmachines.DimensionalMachines;
import com.zepsun.dimensionalmachines.block.common.FlammableBlock;
import com.zepsun.dimensionalmachines.block.tree.FlammableWoodLog;
import com.zepsun.dimensionalmachines.block.tree.StrippableFlammableWoodLog;
import com.zepsun.dimensionalmachines.item.ModItems;
import com.zepsun.dimensionalmachines.world.feature.tree.CrepeMyrtleTreeGrower;
import com.zepsun.dimensionalmachines.world.feature.tree.TransparTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionalMachines.MOD_ID);

    // Transpar
    public static final RegistryObject<Block> STRIPPED_TRANSPAR_WOOD = registerBlock("stripped_transpar_wood", () -> new FlammableWoodLog(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TRANSPAR_WOOD = registerBlock("transpar_wood", () -> new StrippableFlammableWoodLog(STRIPPED_TRANSPAR_WOOD, BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_TRANSPAR_LOG = registerBlock("stripped_transpar_log", () -> new FlammableWoodLog(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TRANSPAR_LOG = registerBlock("transpar_log", () -> new StrippableFlammableWoodLog(STRIPPED_TRANSPAR_LOG, BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TRANSPAR_PLANKS = registerBlock("transpar_planks", () -> new FlammableBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TRANSPAR_LEAVES = registerBlock("transpar_leaves", () -> new FlammableBlock(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> TRANSPAR_SAPLING = registerBlock("transpar_sapling", () -> new SaplingBlock(new TransparTreeGrower(), BlockBehaviour.Properties.of().noCollission().sound(SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> TRANSPAR_COMPOST = registerBlock("transpar_compost", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.ROOTED_DIRT)));

    // Crepe Myrtle
    public static final RegistryObject<Block> STRIPPED_CREPE_MYRTLE_WOOD = registerBlock("stripped_crepe_myrtle_wood", () -> new FlammableWoodLog(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CREPE_MYRTLE_WOOD = registerBlock("crepe_myrtle_wood", () -> new StrippableFlammableWoodLog(STRIPPED_CREPE_MYRTLE_WOOD, BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_CREPE_MYRTLE_LOG = registerBlock("stripped_crepe_myrtle_log", () -> new FlammableWoodLog(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CREPE_MYRTLE_LOG = registerBlock("crepe_myrtle_log", () -> new StrippableFlammableWoodLog(STRIPPED_CREPE_MYRTLE_LOG, BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CREPE_MYRTLE_PLANKS = registerBlock("crepe_myrtle_planks", () -> new FlammableBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CREPE_MYRTLE_LEAVES = registerBlock("crepe_myrtle_leaves", () -> new FlammableBlock(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<Block> CREPE_MYRTLE_SAPLING = registerBlock("crepe_myrtle_sapling", () -> new SaplingBlock(new CrepeMyrtleTreeGrower(), BlockBehaviour.Properties.of().noCollission().sound(SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> CREPE_MYRTLE_COMPOST = registerBlock("crepe_myrtle_compost", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.ROOTED_DIRT)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

