package com.aspr.dynamictreesassorted;

import com.aspr.dynamictreesassorted.worldgen.JacarandaFeatureCanceller;
import com.ferreusveritas.dynamictrees.DynamicTrees;
import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.blocks.rootyblocks.SoilProperties;
import com.ferreusveritas.dynamictrees.trees.Family;
import com.ferreusveritas.dynamictrees.trees.Species;
import com.ferreusveritas.dynamictrees.worldgen.cancellers.TreeFeatureCanceller;
import com.teamaurora.abundance.core.Abundance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTAssortedRegistry {
//
//    public DTAssortedRegistry() {
//    }
//
//    public static void setup() {
//        //Nothing
//    }
//
//    public static final FeatureCanceller JACARANDA_CANCELLER = new JacarandaFeatureCanceller<>(new ResourceLocation(DTAssorted.MODID, "jacaranda"));
//
//    @SubscribeEvent
//    public static void onFeatureCancellerRegistry(final com.ferreusveritas.dynamictrees.api.registry.RegistryEvent<FeatureCanceller> event) {
//        event.getRegistry().registerAll(JACARANDA_CANCELLER);
//    }
//
//


}
