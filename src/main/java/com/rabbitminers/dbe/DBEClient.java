package com.rabbitminers.dbe;

import com.rabbitminers.dbe.blocks.boilers.BoilerBlockRegistry;
import com.rabbitminers.dbe.index.DBEBlocks;
import com.rabbitminers.dbe.index.DBEDyedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class DBEClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (Block block: DBEDyedBlocks.excludeFromCull) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.TRACK_END, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_TOP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_TOP_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_BOTTOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_BOTTOM_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PALISADE, RenderLayer.getCutout());

    }
}
