package satisfyu.nethervinery.world;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import satisfyu.nethervinery.NetherVineryIdentifier;

public class NetherVineryPlacedFeatures {


    public static final ResourceKey<PlacedFeature> WARPED_GRAPE_PATCH_CHANCE_KEY = registerKey("warped_grape_bush_chance");
    public static final ResourceKey<PlacedFeature> CRIMSON_GRAPE_PATCH_CHANCE_KEY = registerKey("crimson_grape_bush_chance");


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new NetherVineryIdentifier(name));
    }
}
