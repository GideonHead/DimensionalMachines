package com.zepsun.dimensionalmachines.util;

import com.zepsun.dimensionalmachines.DimensionalMachines;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class FeatureUtil {
    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(DimensionalMachines.MOD_ID, name));
    }
}
