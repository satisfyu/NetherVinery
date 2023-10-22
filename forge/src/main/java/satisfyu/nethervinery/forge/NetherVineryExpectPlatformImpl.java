package satisfyu.nethervinery.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class NetherVineryExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
