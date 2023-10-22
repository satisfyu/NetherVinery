package satisfyu.nethervinery.client;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.menu.MenuRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import satisfyu.nethervinery.client.gui.handler.ApplePressGui;
import satisfyu.nethervinery.registry.NetherObjectRegistry;
import satisfyu.nethervinery.registry.NetherScreenHandlerTypes;
import satisfyu.vinery.client.gui.WinePressGui;
import satisfyu.vinery.registry.VineryScreenHandlerTypes;

import static satisfyu.vinery.registry.ObjectRegistry.*;

@Environment(EnvType.CLIENT)
public class NetherVineryClient {

    public static void onInitializeClient() {

        RenderTypeRegistry.register(RenderType.cutout(),
                NetherObjectRegistry.BLAZEWINE_PINOT.get(), NetherObjectRegistry.NETHER_FIZZ.get(), NetherObjectRegistry.GHASTLY_GRENACHE.get(),
                NetherObjectRegistry.IMPROVED_LAVA_FIZZ.get(), NetherObjectRegistry.LAVA_FIZZ.get(), NetherObjectRegistry.IMPROVED_LAVA_FIZZ.get(),
                NetherObjectRegistry.NETHERITE_NECTAR.get(), NetherObjectRegistry.CRIMSON_WINE_RACK_MID.get(), NetherObjectRegistry.WARPED_GRAPE_BUSH.get(),
                NetherObjectRegistry.WARPED_WINE_RACK_MID.get(), NetherObjectRegistry.CRIMSON_GRAPE_BUSH.get()
                );

        ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex)->{
                    if(world== null || pos == null){
                        return -1;
                    }
                    return BiomeColors.getAverageFoliageColor(world,pos);
                }, NetherObjectRegistry.OBSIDIAN_STEM.get()
        );

        MenuRegistry.registerScreenFactory(NetherScreenHandlerTypes.APPLE_PRESS_SCREEN_HANDLER.get(), ApplePressGui::new);

    }
}