package satisfyu.nethervinery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import satisfyu.nethervinery.NetherVinery;
import satisfyu.nethervinery.NetherVineryIdentifier;
import satisfyu.nethervinery.block.entity.ApplePressBlockEntity;
import satisfyu.vinery.block.entity.FermentationBarrelBlockEntity;

import java.util.function.Supplier;

public class NetherBlockEntityTypes {

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(NetherVinery.MODID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<BlockEntityType<ApplePressBlockEntity>> APPLE_PRESS_BLOCK_ENTITY = create("apple_press", () -> BlockEntityType.Builder.of(ApplePressBlockEntity::new, NetherObjectRegistry.WARPED_APPLE_PRESS.get(), NetherObjectRegistry.CRIMSON_APPLE_PRESS.get()).build(null));
    public static final RegistrySupplier<BlockEntityType<FermentationBarrelBlockEntity>> FERMENTATION_BARREL_ENTITY = create("fermentation_barrel", () -> BlockEntityType.Builder.of(FermentationBarrelBlockEntity::new, NetherObjectRegistry.WARPED_FERMENTATION_BARREL.get(), NetherObjectRegistry.CRIMSON_FERMENTATION_BARREL.get()).build(null));

    private static <T extends BlockEntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
        return BLOCK_ENTITY_TYPES.register(new NetherVineryIdentifier(path), type);
    }

    public static void init() {
    }
}
