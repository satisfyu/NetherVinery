package satisfyu.nethervinery.registry;

import de.cristelknight.doapi.DoApiExpectPlatform;
import net.minecraft.world.level.block.Block;

import static satisfyu.nethervinery.registry.NetherObjectRegistry.*;

public class NetherFlammableBlocks {

    public static void init() {
        add(5, 20, NetherObjectRegistry.WARPED_FERMENTATION_BARREL.get(), NetherObjectRegistry.WARPED_WINE_RACK_SMALL.get(), NetherObjectRegistry.WARPED_WINE_RACK_MID.get(), NetherObjectRegistry.WARPED_WINE_RACK_BIG.get(), NetherObjectRegistry.CRIMSON_FERMENTATION_BARREL.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_SMALL.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_MID.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_BIG.get(),
                NetherObjectRegistry.WARPED_APPLE_PRESS.get(), NetherObjectRegistry.WARPED_GRAPEVINE_POT.get(), NetherObjectRegistry.REINFORCED_WARPED_PLANKS.get(), REINFORCED_CRIMSON_PLANKS.get(), CRESTED_CRIMSON_PLANKS.get(), CRESTED_WARPED_PLANKS.get(), CRIMSON_APPLE_PRESS.get(), CRIMSON_GRAPEVINE_POT.get(), CRIMSON_BARREL.get(), WARPED_BARREL.get()
        );
        add(2, 10, CRIMSON_GRAPE_GRATE.get(), WARPED_GRAPE_CRATE.get()
        );
    }


    private static void add(int burnOdd, int igniteOdd, Block... blocks) {
        DoApiExpectPlatform.addFlammable(burnOdd, igniteOdd, blocks);
    }

}
