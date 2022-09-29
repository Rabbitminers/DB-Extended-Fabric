package com.rabbitminers.dbe;

import com.rabbitminers.dbe.blocks.boilers.BoilerBlockRegistry;
import com.rabbitminers.dbe.index.DBEBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class DBEClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_TOP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_TOP_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_BOTTOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PILE_BOTTOM_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DBEBlocks.LOG_PALISADE, RenderLayer.getCutout());


        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.CREATE_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.ZINC_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.COPPER_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BRASS_BOILER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BLACK_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.GRAY_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.LIGHT_GRAY_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.WHITE_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.RED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.ORANGE_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.YELLOW_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.LIME_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.GREEN_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.CYAN_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.LIGHT_BLUE_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BLUE_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.MAGENTA_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.PURPLE_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.PINK_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BROWN_BOILER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BLACK_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.GRAY_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.LIGHT_GRAY_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.WHITE_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.RED_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.ORANGE_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.YELLOW_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.LIME_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.GREEN_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.CYAN_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.LIGHT_BLUE_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BLUE_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.MAGENTA_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.PURPLE_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.PINK_GILDED_BOILER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BoilerBlockRegistry.BROWN_GILDED_BOILER, RenderLayer.getCutout());
    }
}
