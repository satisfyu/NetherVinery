package satisfyu.nethervinery.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import satisfyu.nethervinery.client.NetherVineryClient;

public class NetherVineryClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        NetherVineryClient.onInitializeClient();
    }
}
