package satisfyu.nethervinery.block.grape;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import satisfyu.vinery.block.grape.GrapeBush;
import satisfyu.vinery.block.grape.GrapeType;
import satisfyu.vinery.block.grape.GrapeVineBlock;
import satisfyu.vinery.util.GrapevineType;

public class WarpedGrapeBush extends GrapeVineBlock {


    public WarpedGrapeBush(Properties settings, GrapeType type) {
        super(settings, type);
    }

    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockState.is(Blocks.WARPED_NYLIUM);
    }

}
