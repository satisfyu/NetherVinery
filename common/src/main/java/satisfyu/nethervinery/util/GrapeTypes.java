package satisfyu.nethervinery.util;

import satisfyu.nethervinery.registry.NetherObjectRegistry;
import satisfyu.vinery.block.grape.GrapeType;

import static satisfyu.vinery.registry.GrapeTypes.registerGrapeType;

public class GrapeTypes {

    public static final GrapeType CRIMSON = registerGrapeType("crimson");
    public static final GrapeType WARPED = registerGrapeType("warped", true);

    public static void addGrapeAttributes() {
        CRIMSON.setItems(NetherObjectRegistry.CRIMSON_GRAPE, NetherObjectRegistry.CRIMSON_GRAPE_SEEDS, NetherObjectRegistry.CRIMSON_GRAPEJUICE);
        WARPED.setItems(NetherObjectRegistry.WARPED_GRAPE, NetherObjectRegistry.WARPED_GRAPE_SEEDS, NetherObjectRegistry.WARPED_GRAPEJUICE);
    }
}
