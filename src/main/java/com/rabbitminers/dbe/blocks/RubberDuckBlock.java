package com.rabbitminers.dbe.blocks;

import com.rabbitminers.dbe.blocks.util.FacingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class RubberDuckBlock extends FacingBlock {
    public RubberDuckBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        return VoxelShapes.cuboid(0.3, 0.0f, 0.3f, 0.6f, 0.3f, 0.6f);
    }
}
