package com.rabbitminers.dbe.blocks.boilers;

import com.rabbitminers.dbe.DBE;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BoilerBlockRegistry {

    static ItemGroup group = ItemGroup.MISC;

    public static final Block CREATE_BOILER = registerBlock("create_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block COPPER_BOILER = registerBlock("copper_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block ZINC_BOILER = registerBlock("zinc_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block BRASS_BOILER = registerBlock("brass_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);


    public static final Block BLACK_BOILER = registerBlock("black_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block GRAY_BOILER = registerBlock("gray_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block LIGHT_GRAY_BOILER = registerBlock("light_gray_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block WHITE_BOILER = registerBlock("white_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block RED_BOILER = registerBlock("red_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block ORANGE_BOILER = registerBlock("orange_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block YELLOW_BOILER = registerBlock("yellow_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block LIME_BOILER = registerBlock("lime_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block GREEN_BOILER = registerBlock("green_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block CYAN_BOILER = registerBlock("cyan_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block LIGHT_BLUE_BOILER = registerBlock("light_blue_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block BLUE_BOILER = registerBlock("blue_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block MAGENTA_BOILER = registerBlock("magenta_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block PURPLE_BOILER = registerBlock("purple_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block PINK_BOILER = registerBlock("pink_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block BROWN_BOILER = registerBlock("brown_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);


    public static final Block BLACK_GILDED_BOILER = registerBlock("black_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block GRAY_GILDED_BOILER = registerBlock("gray_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block LIGHT_GRAY_GILDED_BOILER = registerBlock("light_gray_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block WHITE_GILDED_BOILER = registerBlock("white_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block RED_GILDED_BOILER = registerBlock("red_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block ORANGE_GILDED_BOILER = registerBlock("orange_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block YELLOW_GILDED_BOILER = registerBlock("yellow_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block LIME_GILDED_BOILER = registerBlock("lime_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block GREEN_GILDED_BOILER = registerBlock("green_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block CYAN_GILDED_BOILER = registerBlock("cyan_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block LIGHT_BLUE_GILDED_BOILER = registerBlock("light_blue_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block BLUE_GILDED_BOILER = registerBlock("blue_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block MAGENTA_GILDED_BOILER = registerBlock("magenta_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block PURPLE_GILDED_BOILER = registerBlock("purple_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block PINK_GILDED_BOILER = registerBlock("pink_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);

    public static final Block BROWN_GILDED_BOILER = registerBlock("brown_gilded_boiler",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), group);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DBE.MODID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(DBE.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        DBE.LOGGER.info("Registering Boilers for " + DBE.MODID);
    }
}
