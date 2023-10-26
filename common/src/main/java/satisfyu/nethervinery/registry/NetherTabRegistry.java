package satisfyu.nethervinery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import satisfyu.nethervinery.NetherVinery;

public class NetherTabRegistry {
    public static final DeferredRegister<CreativeModeTab> NETHERVINERY_TABS = DeferredRegister.create(NetherVinery.MODID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> NetherVinery_TAB = NETHERVINERY_TABS.register("nethervinery", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(NetherObjectRegistry.CRIMSON_GRAPE.get()))
            .title(Component.translatable("itemGroup.nethervinery.nethervinery_tab"))
            .displayItems((parameters, out) -> {
                out.accept(NetherObjectRegistry.OBSIDIAN_STEM.get());
                out.accept(NetherObjectRegistry.CRIMSON_NETHER_BAG.get());
                out.accept(NetherObjectRegistry.WARPED_NETHER_BAG.get());
                out.accept(NetherObjectRegistry.CRIMSON_GRAPE_SEEDS.get());
                out.accept(NetherObjectRegistry.CRIMSON_GRAPE.get());
                out.accept(NetherObjectRegistry.WARPED_GRAPE_SEEDS.get());
                out.accept(NetherObjectRegistry.WARPED_GRAPE.get());
                out.accept(NetherObjectRegistry.CRIMSON_GRAPE_GRATE.get());
                out.accept(NetherObjectRegistry.WARPED_GRAPE_CRATE.get());
                out.accept(NetherObjectRegistry.CRIMSON_GRAPEJUICE.get());
                out.accept(NetherObjectRegistry.WARPED_GRAPEJUICE.get());
                out.accept(NetherObjectRegistry.BLAZEWINE_PINOT.get());
                out.accept(NetherObjectRegistry.NETHERITE_NECTAR.get());
                out.accept(NetherObjectRegistry.GHASTLY_GRENACHE.get());
                out.accept(NetherObjectRegistry.LAVA_FIZZ.get());
                out.accept(NetherObjectRegistry.NETHER_FIZZ.get());
                out.accept(NetherObjectRegistry.IMPROVED_LAVA_FIZZ.get());
                out.accept(NetherObjectRegistry.IMPROVED_NETHER_FIZZ.get());
                out.accept(NetherObjectRegistry.CRIMSON_FERMENTATION_BARREL.get());
                out.accept(NetherObjectRegistry.CRIMSON_GRAPEVINE_POT.get());
                out.accept(NetherObjectRegistry.CRIMSON_APPLE_PRESS.get());
                out.accept(NetherObjectRegistry.CRIMSON_WINE_RACK_BIG.get());
                out.accept(NetherObjectRegistry.CRIMSON_WINE_RACK_MID.get());
                out.accept(NetherObjectRegistry.CRIMSON_WINE_RACK_SMALL.get());
                out.accept(NetherObjectRegistry.REINFORCED_CRIMSON_PLANKS.get());
                out.accept(NetherObjectRegistry.CRESTED_CRIMSON_PLANKS.get());
                out.accept(NetherObjectRegistry.CRIMSON_BARREL.get());
                out.accept(NetherObjectRegistry.WARPED_FERMENTATION_BARREL.get());
                out.accept(NetherObjectRegistry.WARPED_GRAPEVINE_POT.get());
                out.accept(NetherObjectRegistry.WARPED_APPLE_PRESS.get());
                out.accept(NetherObjectRegistry.WARPED_WINE_RACK_BIG.get());
                out.accept(NetherObjectRegistry.WARPED_WINE_RACK_MID.get());
                out.accept(NetherObjectRegistry.WARPED_WINE_RACK_SMALL.get());
                out.accept(NetherObjectRegistry.REINFORCED_WARPED_PLANKS.get());
                out.accept(NetherObjectRegistry.CRESTED_WARPED_PLANKS.get());
                out.accept(NetherObjectRegistry.WARPED_BARREL.get());

            })
            .build());

    public static void init() {
        NETHERVINERY_TABS.register();
    }
}
