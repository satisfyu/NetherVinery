package satisfyu.nethervinery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import satisfyu.nethervinery.NetherVineryIdentifier;
import satisfyu.nethervinery.block.entity.AgingBarrelBlockEntity;
import satisfyu.nethervinery.block.entity.ApplePressBlockEntity;
import satisfyu.vinery.Vinery;

import java.util.function.Supplier;

public class NetherBlockEntityTypes {

    private static final Registrar<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Vinery.MODID, Registries.BLOCK_ENTITY_TYPE).getRegistrar();

    public static final RegistrySupplier<BlockEntityType<ApplePressBlockEntity>> APPLE_PRESS_BLOCK_ENTITY = create("crimson_apple_press", () -> BlockEntityType.Builder.of(ApplePressBlockEntity::new, NetherObjectRegistry.WARPED_APPLE_PRESS.get(), NetherObjectRegistry.CRIMSON_APPLE_PRESS.get()).build(null));
    public static final RegistrySupplier<BlockEntityType<AgingBarrelBlockEntity>> AGING_BARREL_ENTITY = create("aging_barrel", () -> BlockEntityType.Builder.of(AgingBarrelBlockEntity::new, NetherObjectRegistry.WARPED_FERMENTATION_BARREL.get(), NetherObjectRegistry.CRIMSON_FERMENTATION_BARREL.get()).build(null));


    private static <T extends BlockEntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
        return BLOCK_ENTITY_TYPES.register(new NetherVineryIdentifier(path), type);
    }

    public static void init() {

    }
}