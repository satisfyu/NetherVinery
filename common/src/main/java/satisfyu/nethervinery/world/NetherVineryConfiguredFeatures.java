package satisfyu.nethervinery.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import satisfyu.nethervinery.NetherVineryIdentifier;


public class NetherVineryConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> WARPED_GRAPE_BUSH_PATCH_KEY = registerKey("warped_grape_bush");
    public static final ResourceKey<ConfiguredFeature<?,?>> CRIMSON_GRAPE_BUSH_PATCH_KEY = registerKey("crimson_grape_bush");


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new NetherVineryIdentifier(name));
    }

}

