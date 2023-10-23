package satisfyu.nethervinery.registry;

import net.minecraft.world.level.block.Block;
import satisfyu.vinery.registry.ObjectRegistry;
import satisfyu.vinery.registry.VineryStorageTypes;

import java.util.List;
import java.util.Set;

public class NetherStorageTypes extends VineryStorageTypes {

    public static void registerBlocks(Set<Block> blocks) {
        blocks.add(NetherObjectRegistry.CRIMSON_WINE_RACK_BIG.get());
        blocks.add(NetherObjectRegistry.CRIMSON_WINE_RACK_SMALL.get());
        blocks.add(NetherObjectRegistry.CRIMSON_WINE_RACK_MID.get());
        blocks.add(NetherObjectRegistry.WARPED_WINE_RACK_BIG.get());
        blocks.add(NetherObjectRegistry.WARPED_WINE_RACK_MID.get());
        blocks.add(NetherObjectRegistry.WARPED_WINE_RACK_SMALL.get());
        blocks.addAll(List.of((Block) NetherObjectRegistry.GHASTLY_GRENACHE.get(), (Block)NetherObjectRegistry.NETHERITE_NECTAR.get(), (Block)NetherObjectRegistry.BLAZEWINE_PINOT.get(), (Block)NetherObjectRegistry.LAVA_FIZZ.get(), (Block)NetherObjectRegistry.NETHER_FIZZ.get(), (Block)NetherObjectRegistry.IMPROVED_NETHER_FIZZ.get(), (Block)NetherObjectRegistry.IMPROVED_LAVA_FIZZ.get()));
    }
}
