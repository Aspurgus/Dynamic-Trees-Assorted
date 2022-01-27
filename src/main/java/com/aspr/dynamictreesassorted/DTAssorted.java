package com.aspr.dynamictreesassorted;

import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.blocks.rootyblocks.SoilProperties;
import com.ferreusveritas.dynamictrees.trees.Family;
import com.ferreusveritas.dynamictrees.trees.Species;
import com.minecraftabnormals.autumnity.core.registry.AutumnityFeatures;
import com.teamaurora.abundance.core.registry.AbundanceFeatures;
import com.teamaurora.abundance.core.registry.AbundanceFeatures.Configured;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;
import java.util.Random;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DTAssorted.MODID)
public class DTAssorted
{


    public static final String MODID = "dtassorted";

    public DTAssorted() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        RegistryHandler.setup(MODID);

        RegistryHandler.setup("dtabundance");
        RegistryHandler.setup("dtterraincognita");
        MinecraftForge.EVENT_BUS.register(this);

        //Abundances
        clearConfiguredFeature(Configured.REDBUD);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SuppressWarnings("unchecked")
    private void clearConfiguredFeature (ConfiguredFeature<?,?> configuredFeature){
        Feature<NoFeatureConfig> nullFeature = new Feature<NoFeatureConfig>(NoFeatureConfig.CODEC){
            @Override public boolean generate(@Nonnull ISeedReader p_241855_1_,@Nonnull  ChunkGenerator p_241855_2_,@Nonnull  Random p_241855_3_,@Nonnull  BlockPos p_241855_4_,@Nonnull  NoFeatureConfig p_241855_5_) { return false; }
        };
        ConfiguredFeature<NoFeatureConfig,Feature<NoFeatureConfig>> castedConfigured = (ConfiguredFeature<NoFeatureConfig,Feature<NoFeatureConfig>>)configuredFeature;
        castedConfigured.feature = nullFeature;
        castedConfigured.config = NoFeatureConfig.INSTANCE;
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        //Stuff and Things
    }


}
