package satisfyu.nethervinery.registry;

import net.minecraft.world.level.block.Block;
import satisfyu.vinery.registry.VineryStorageTypes;

import java.util.Set;

public class NetherStorageTypes extends VineryStorageTypes {

    public static void registerBlocks(Set<Block> blocks) {
        blocks.add(NetherObjectRegistry.CRIMSON_WINE_RACK_BIG.get());
        blocks.add(NetherObjectRegistry.CRIMSON_WINE_RACK_SMALL.get());
        blocks.add(NetherObjectRegistry.CRIMSON_WINE_RACK_MID.get());
        blocks.add(NetherObjectRegistry.WARPED_WINE_RACK_BIG.get());
        blocks.add(NetherObjectRegistry.WARPED_WINE_RACK_MID.get());
        blocks.add(NetherObjectRegistry.WARPED_WINE_RACK_SMALL.get());
    }
}
