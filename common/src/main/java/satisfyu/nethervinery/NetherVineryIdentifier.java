package satisfyu.nethervinery;

import net.minecraft.resources.ResourceLocation;

public class NetherVineryIdentifier extends ResourceLocation {

    public NetherVineryIdentifier(String path) {
        super(NetherVinery.MODID, path);
    }

    public static String asString(String path) {
        return (NetherVinery.MODID + ":" + path);
    }
}
