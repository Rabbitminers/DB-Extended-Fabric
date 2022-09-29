package com.rabbitminers.dbe.blocks.util;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PalisadeBlock extends FacingBlock {
    public PalisadeBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.3125f, 1.0f, 1.0f, 0.6875f);
            case SOUTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.3125f, 1.0f, 1.0f, 0.6875f);
            case EAST:
                return VoxelShapes.cuboid(0.3125f, 0.0f, 0.0f, 0.6875f, 1.0f, 1.0f);
            case WEST:
                return VoxelShapes.cuboid(0.3125f, 0.0f, 0.0f, 0.6875f, 1.0f, 1.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }
}
