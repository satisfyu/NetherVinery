package satisfyu.nethervinery.world;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import satisfyu.nethervinery.NetherVinery;
import satisfyu.nethervinery.NetherVineryIdentifier;

import java.util.function.Supplier;

public class NetherVineryWarpedFeatures {

    private static final Registrar<Feature<?>> FEATURES = DeferredRegister.create(NetherVinery.MODID, Registry.FEATURE_REGISTRY).getRegistrar();
    public static final RegistrySupplier<Feature<BlockStateConfiguration>> WARPED_GRAPE_FEATURE = register("warped_grape_feature", () -> new WarpedGrapeFeature(BlockStateConfiguration.CODEC));
    public static void init(){
        NetherVinery.LOGGER.debug("Registering Features!");
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> RegistrySupplier<F> register(String name, Supplier<F> feature) {
        return FEATURES.register(new NetherVineryIdentifier(name), feature);
    }

}
