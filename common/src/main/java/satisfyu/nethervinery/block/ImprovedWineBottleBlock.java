package satisfyu.nethervinery.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import satisfyu.vinery.block.storage.WineBottleBlock;

public class ImprovedWineBottleBlock extends WineBottleBlock {
    private static final int TICKS_PER_SOUND = 25 * 20;
    private int tickCounter = 0;

    public ImprovedWineBottleBlock(Properties settings, int maxCount) {
        super(settings, maxCount);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        double d = (double) pos.getX() + 0.5;
        double e = pos.getY() + 0.7;
        double f = (double) pos.getZ() + 0.5;

        if (tickCounter >= TICKS_PER_SOUND) {
            for (BlockPos targetPos : BlockPos.betweenClosed(pos.offset(-3, -3, -3), pos.offset(3, 3, 3))) {
                if (world.random.nextDouble() < 0.3) {
                    double targetX = (double) targetPos.getX() + 0.5;
                    double targetY = targetPos.getY() + 0.7;
                    double targetZ = (double) targetPos.getZ() + 0.5;
                    world.playLocalSound(targetX, targetY, targetZ, SoundEvents.BREWING_STAND_BREW, SoundSource.BLOCKS, 0.1f, 0.1f, false);
                }
            }
            tickCounter = 0;
        } else {
            tickCounter++;
        }

        Direction direction = state.getValue(FACING);
        Direction.Axis axis = direction.getAxis();
        double h = random.nextDouble() * 0.6 - 0.3;
        double i = axis == Direction.Axis.X ? (double) direction.getStepX() * 0.0 : h;
        double j = random.nextDouble() * 9.0 / 16.0;
        double k = axis == Direction.Axis.Z ? (double) direction.getStepZ() * 0.0 : h;

        double particleSpeed = 0.01;
        world.addParticle(ParticleTypes.SMOKE, d + i, e + j, f + k, 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.ASH, d + i, e + j, f + k, 0.0, 0.0, 0.0);
    }
}
