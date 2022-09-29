package com.rabbitminers.dbe.blocks.signs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class SignBlock extends HorizontalFacingBlock {
    public SignBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            default:
                return VoxelShapes.cuboid(0, 0, 0, 16, 16, 1);
            case NORTH:
                return VoxelShapes.cuboid(0, 0, 15, 16, 16, 16);
            case EAST:
                return VoxelShapes.cuboid(0, 0, 0, 1, 16, 16);
            case WEST:
                return VoxelShapes.cuboid(15, 0, 0, 16, 16, 16);
        }
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }


}
