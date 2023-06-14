package com.zepsun.dimensionalmachines;

import com.google.common.io.Closer;
import com.mojang.logging.LogUtils;
import com.zepsun.dimensionalmachines.block.DMBlocks;
import com.zepsun.dimensionalmachines.item.DMItems;
import com.zepsun.dimensionalmachines.tab.DMCreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DimensionalMachines.MOD_ID)
public class DimensionalMachines {
    public static final String MOD_ID = "dimensionalmachines";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DimensionalMachines() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DMItems.register(modEventBus);
        DMBlocks.register(modEventBus);
        DMCreativeTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
