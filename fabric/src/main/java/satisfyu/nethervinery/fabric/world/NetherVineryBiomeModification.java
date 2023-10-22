package satisfyu.nethervinery.fabric.world;

import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import satisfyu.nethervinery.NetherVineryIdentifier;
import satisfyu.nethervinery.world.NetherVineryPlacedFeatures;

import java.util.function.Predicate;


public class NetherVineryBiomeModification {

    public static void init() {
        BiomeModification world = BiomeModifications.create(new NetherVineryIdentifier("world_features"));
        Predicate<BiomeSelectionContext> crimsonBiomes = getVinerySelector("spawns_crimson_grape");
        Predicate<BiomeSelectionContext> warpedBiomes = getVinerySelector("spawns_warped_grape");



        world.add(ModificationPhase.ADDITIONS, crimsonBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NetherVineryPlacedFeatures.CRIMSON_GRAPE_PATCH_CHANCE_KEY));
        world.add(ModificationPhase.ADDITIONS, warpedBiomes, ctx -> ctx.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NetherVineryPlacedFeatures.WARPED_GRAPE_PATCH_CHANCE_KEY));
    }

    private static Predicate<BiomeSelectionContext> getVinerySelector(String path) {
        return BiomeSelectors.tag(TagKey.create(Registry.BIOME_REGISTRY, new NetherVineryIdentifier(path)));
    }



}
