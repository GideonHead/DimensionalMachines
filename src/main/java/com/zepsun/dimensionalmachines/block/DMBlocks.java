package com.zepsun.dimensionalmachines.block;

import com.zepsun.dimensionalmachines.DimensionalMachines;
import com.zepsun.dimensionalmachines.block.common.DMFlammableBlock;
import com.zepsun.dimensionalmachines.block.tree.DMFlammableWoodLog;
import com.zepsun.dimensionalmachines.block.tree.DMStrippableFlammableWoodLog;
import com.zepsun.dimensionalmachines.item.DMItems;
import com.zepsun.dimensionalmachines.world.feature.tree.DMTransparTreeGrower;
import com.zepsun.dimensionalmachines.world.feature.tree.DMTreeFeatures;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class DMBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionalMachines.MOD_ID);

    // Transpar Wood
    public static final RegistryObject STRIPPED_TRANSPAR_WOOD = registerBlock("stripped_transpar_wood", () -> new DMFlammableWoodLog(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject TRANSPAR_WOOD = registerBlock("transpar_wood", () -> new DMStrippableFlammableWoodLog(STRIPPED_TRANSPAR_WOOD, BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject STRIPPED_TRANSPAR_LOG = registerBlock("stripped_transpar_log", () -> new DMFlammableWoodLog(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject TRANSPAR_LOG = registerBlock("transpar_log", () -> new DMStrippableFlammableWoodLog(STRIPPED_TRANSPAR_LOG, BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject TRANSPAR_PLANKS = registerBlock("transpar_planks", () -> new DMFlammableBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final RegistryObject TRANSPAR_LEAVES = registerBlock("transpar_leaves", () -> new DMFlammableBlock(BlockBehaviour.Properties.of().sound(SoundType.AZALEA_LEAVES)));
    public static final RegistryObject<?> TRANSPAR_SAPLING = registerBlock("transpar_sapling", () -> new SaplingBlock(new DMTransparTreeGrower(), BlockBehaviour.Properties.of().sound(SoundType.WOOD)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return DMItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

