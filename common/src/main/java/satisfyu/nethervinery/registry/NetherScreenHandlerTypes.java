package satisfyu.nethervinery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import satisfyu.nethervinery.client.gui.ApplePressGuiHandler;
import satisfyu.vinery.Vinery;
import satisfyu.vinery.VineryIdentifier;
import satisfyu.vinery.client.gui.handler.FermentationBarrelGuiHandler;
import satisfyu.vinery.client.gui.handler.WinePressGuiHandler;

import java.util.function.Supplier;

public class NetherScreenHandlerTypes {

    private static final Registrar<MenuType<?>> MENU_TYPES = DeferredRegister.create(Vinery.MODID, Registry.MENU_REGISTRY).getRegistrar();

    public static final RegistrySupplier<MenuType<ApplePressGuiHandler>> APPLE_PRESS_SCREEN_HANDLER = register("apple_press_gui_handler", () -> new MenuType<>(ApplePressGuiHandler::new));


    public static <T extends AbstractContainerMenu> RegistrySupplier<MenuType<T>> register(String name, Supplier<MenuType<T>> menuType){
        return MENU_TYPES.register(new VineryIdentifier(name), menuType);
    }

    public static void init() {
    }
}
