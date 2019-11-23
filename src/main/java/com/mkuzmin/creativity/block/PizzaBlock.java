package com.mkuzmin.creativity.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.entity.EntityContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PizzaBlock extends CakeBlock {
    protected static final VoxelShape[] BITES_TO_SHAPE;

    static {
        BITES_TO_SHAPE = new VoxelShape[]{
                Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D),
                Block.createCuboidShape(3.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D),
                Block.createCuboidShape(5.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D),
                Block.createCuboidShape(7.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D),
                Block.createCuboidShape(9.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D),
                Block.createCuboidShape(11.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D),
                Block.createCuboidShape(13.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D)
        };
    }

    public PizzaBlock(Settings settings) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ePos) {
        return BITES_TO_SHAPE[(Integer) state.get(BITES)];
    }
}
