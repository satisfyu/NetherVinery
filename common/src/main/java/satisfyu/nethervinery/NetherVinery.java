package satisfyu.nethervinery;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import satisfyu.nethervinery.registry.*;


public class NetherVinery {
    public static final String MODID = "nethervinery";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final CreativeModeTab NETHERVINERY_TAB = CreativeTabRegistry.create(new NetherVineryIdentifier("nethervinery_tab"), () ->
            new ItemStack(NetherObjectRegistry.CRIMSON_GRAPE.get()));




    public static void init() {
        NetherObjectRegistry.init();
        NetherBlockEntityTypes.init();
        NetherGrapeTypes.addGrapeAttributes();
        NetherEffects.init();
        NetherScreenHandlerTypes.init();
    }

    public static void commonSetup(){
        NetherCompostableItems.init();
        NetherFlammableBlocks.init();
    }
}
