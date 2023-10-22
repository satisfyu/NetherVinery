package satisfyu.nethervinery.registry;

import de.cristelknight.doapi.DoApiExpectPlatform;
import net.minecraft.world.level.block.Block;

public class NetherFlammableBlocks {

    public static void init() {
        add(5, 20, NetherObjectRegistry.WARPED_FERMENTATION_BARREL.get(), NetherObjectRegistry.WARPED_WINE_RACK_SMALL.get(), NetherObjectRegistry.WARPED_WINE_RACK_MID.get(), NetherObjectRegistry.WARPED_WINE_RACK_BIG.get(), NetherObjectRegistry.CRIMSON_FERMENTATION_BARREL.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_SMALL.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_MID.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_BIG.get()
        );
    }


    private static void add(int burnOdd, int igniteOdd, Block... blocks) {
        DoApiExpectPlatform.addFlammable(burnOdd, igniteOdd, blocks);
    }

}
