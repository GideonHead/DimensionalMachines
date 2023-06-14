package com.zepsun.dimensionalmachines.tab;

import com.zepsun.dimensionalmachines.DimensionalMachines;
import com.zepsun.dimensionalmachines.item.DMItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DMCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimensionalMachines.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DIMENSIONAL_MACHINES_TAB = TABS.register("dimensional_machines_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + DimensionalMachines.MOD_ID + ".dimensional_machines_tab"))
            .icon(() -> new ItemStack(DMItems.EXAMPLE.get()))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(DMItems.EXAMPLE.get());
            }).build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}