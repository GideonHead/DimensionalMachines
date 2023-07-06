package com.zepsun.dimensionalmachines.tab;

import com.zepsun.dimensionalmachines.DimensionalMachines;
import com.zepsun.dimensionalmachines.block.ModBlocks;
import com.zepsun.dimensionalmachines.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimensionalMachines.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DIMENSIONAL_MACHINES_TAB = TABS.register("dimensional_machines_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + DimensionalMachines.MOD_ID + ".dimensional_machines_tab"))
            .icon(() -> new ItemStack(ModItems.EXAMPLE.get()))
            .displayItems((enabledFeatures, entries) -> {

                entries.accept(ModItems.EXAMPLE.get());

                // Transpar
                entries.accept(ModBlocks.TRANSPAR_LEAVES.get());
                entries.accept(ModBlocks.TRANSPAR_LOG.get());
                entries.accept(ModBlocks.TRANSPAR_PLANKS.get());
                entries.accept(ModBlocks.TRANSPAR_WOOD.get());
                entries.accept(ModBlocks.TRANSPAR_SAPLING.get());
                entries.accept(ModBlocks.STRIPPED_TRANSPAR_LOG.get());
                entries.accept(ModBlocks.STRIPPED_TRANSPAR_WOOD.get());
                entries.accept(ModBlocks.TRANSPAR_COMPOST.get());

                //Crepe Myrtle
                entries.accept(ModBlocks.CREPE_MYRTLE_LEAVES.get());
                entries.accept(ModBlocks.CREPE_MYRTLE_LOG.get());
                entries.accept(ModBlocks.CREPE_MYRTLE_PLANKS.get());
                entries.accept(ModBlocks.CREPE_MYRTLE_WOOD.get());
                entries.accept(ModBlocks.CREPE_MYRTLE_SAPLING.get());
                entries.accept(ModBlocks.STRIPPED_CREPE_MYRTLE_LOG.get());
                entries.accept(ModBlocks.STRIPPED_CREPE_MYRTLE_WOOD.get());
                entries.accept(ModBlocks.CREPE_MYRTLE_COMPOST.get());

            }).build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}