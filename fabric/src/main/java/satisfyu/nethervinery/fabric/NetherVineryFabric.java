package satisfyu.nethervinery.fabric;

import net.fabricmc.api.ModInitializer;
import satisfyu.nethervinery.NetherVinery;
import satisfyu.nethervinery.client.NetherVineryClient;
import satisfyu.nethervinery.fabric.world.NetherVineryBiomeModification;

public class NetherVineryFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        NetherVinery.init();
        NetherVinery.commonSetup();
        NetherVineryBiomeModification.init();
    }
}
