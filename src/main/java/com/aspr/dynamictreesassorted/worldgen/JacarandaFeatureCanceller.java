package com.aspr.dynamictreesassorted.worldgen;

import com.ferreusveritas.dynamictrees.api.worldgen.BiomePropertySelectors;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import com.teamaurora.abundance.common.world.gen.feature.JacarandaFeature;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.*;

public class JacarandaFeatureCanceller<T extends IFeatureConfig> extends FeatureCanceller {

    public JacarandaFeatureCanceller(ResourceLocation registryName) {
        super(registryName);
    }

    @Override
    public boolean shouldCancel(ConfiguredFeature<?,?> configuredFeature, BiomePropertySelectors.FeatureCancellations featureCancellations) {

        IFeatureConfig featureConfig = configuredFeature.config;

        if (!(featureConfig instanceof DecoratedFeatureConfig))
            return false;
        featureConfig = ((DecoratedFeatureConfig) featureConfig).feature.get().config;

        return featureConfig instanceof DecoratedFeatureConfig
                && ((DecoratedFeatureConfig) featureConfig).feature.get().feature instanceof JacarandaFeature;

    }


}
