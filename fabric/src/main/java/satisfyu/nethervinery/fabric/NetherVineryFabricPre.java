package satisfyu.nethervinery.fabric;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import satisfyu.nethervinery.util.NetherVineryPre;

public class NetherVineryFabricPre implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        NetherVineryPre.preInit();
    }
}
