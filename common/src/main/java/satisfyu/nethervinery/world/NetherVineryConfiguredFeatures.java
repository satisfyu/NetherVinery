package satisfyu.nethervinery.world;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import satisfyu.nethervinery.NetherVineryIdentifier;


public class NetherVineryConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> WARPED_GRAPE_BUSH_PATCH_KEY = registerKey("warped_grape_bush");
    public static final ResourceKey<ConfiguredFeature<?,?>> CRIMSON_GRAPE_BUSH_PATCH_KEY = registerKey("crimson_grape_bush");


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, new NetherVineryIdentifier(name));
    }

}

