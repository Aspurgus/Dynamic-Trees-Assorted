package com.aspr.dynamictreesassorted;

import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import com.ferreusveritas.dynamictrees.worldgen.cancellers.TreeFeatureCanceller;
import com.teamaurora.abundance.common.world.gen.feature.JacarandaFeature;
import com.teamaurora.abundance.core.registry.AbundanceBiomes;
import com.teamaurora.abundance.core.registry.AbundanceFeatures;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.Random;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TreesAssorted.MODID)
public class TreesAssorted
{

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "dynamictreesassorted";

    public TreesAssorted() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }



}
