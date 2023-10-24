package satisfyu.nethervinery.registry;

import satisfyu.vinery.block.grape.GrapeType;
import satisfyu.vinery.registry.GrapeTypes;


public class NetherGrapeTypes {

    public static final GrapeType CRIMSON = GrapeTypes.registerGrapeType("crimson");
    public static final GrapeType WARPED = GrapeTypes.registerGrapeType("warped");

    public static GrapeType registerGrapeType() {
        GrapeType grapeType = new GrapeType("", false);
        GrapeTypes.GRAPE_TYPE_TYPES.add(grapeType);
        return grapeType;
    }

    public static void addGrapeAttributes() {
        CRIMSON.setItems(NetherObjectRegistry.CRIMSON_GRAPE, NetherObjectRegistry.CRIMSON_GRAPE_SEEDS, NetherObjectRegistry.CRIMSON_GRAPEJUICE);
        WARPED.setItems(NetherObjectRegistry.WARPED_GRAPE, NetherObjectRegistry.WARPED_GRAPE_SEEDS, NetherObjectRegistry.WARPED_GRAPEJUICE);
    }
}
