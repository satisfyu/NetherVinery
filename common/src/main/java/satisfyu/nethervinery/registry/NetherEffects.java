package satisfyu.nethervinery.registry;

import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import satisfyu.nethervinery.NetherVinery;
import satisfyu.nethervinery.NetherVineryIdentifier;
import satisfyu.nethervinery.effect.*;

import java.util.function.Supplier;

public class NetherEffects {

    private static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(NetherVinery.MODID, Registries.MOB_EFFECT);
    private static final Registrar<MobEffect> MOB_EFFECTS_REGISTRAR = MOB_EFFECTS.getRegistrar();

    public static final RegistrySupplier<MobEffect> GRAVEDIGGER;
    public static final RegistrySupplier<MobEffect> HEARTHSTONE;
    public static final RegistrySupplier<MobEffect> IMPROVED_GRAVEDIGGER;
    public static final RegistrySupplier<MobEffect> IMPROVED_HEARTHSTONE;
    public static final RegistrySupplier<MobEffect> NETHERITE;


    private static RegistrySupplier<MobEffect> registerEffect(String name, Supplier<MobEffect> effect){
        if(Platform.isForge()){
            return MOB_EFFECTS.register(name, effect);
        }
        return MOB_EFFECTS_REGISTRAR.register(new NetherVineryIdentifier(name), effect);
    }

    public static void init(){
        NetherVinery.LOGGER.debug("Mob effects");
        MOB_EFFECTS.register();
    }

    static {
        GRAVEDIGGER = registerEffect("gravedigger", GravediggerEffect::new);
        HEARTHSTONE = registerEffect("hearthstone", HearthstoneEffect::new);
        IMPROVED_GRAVEDIGGER = registerEffect("improved_gravedigger", ImprovedGravediggerEffect::new);
        IMPROVED_HEARTHSTONE = registerEffect("improved_hearthstone", ImprovedHearthstoneEffect::new);
        NETHERITE = registerEffect("netherite", NetheriteEffect::new);

    }
}
