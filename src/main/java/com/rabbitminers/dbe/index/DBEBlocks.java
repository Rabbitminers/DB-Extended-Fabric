package com.rabbitminers.dbe.index;

import com.rabbitminers.dbe.DBE;
import com.rabbitminers.dbe.blocks.TrackEndBlock;
import com.rabbitminers.dbe.blocks.util.*;
import com.rabbitminers.dbe.blocks.util.FacingBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DBEBlocks {
    /*
    'Natural' Blocks
     */

    public static final Block BALLAST = registerBlock("ballast",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);

    public static final Block BALLAST_SLAB = registerBlock("ballast_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);

    public static final Block GRAVEL_SLAB = registerBlock("gravel_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(3f, 6f)), ItemGroup.MISC);

    public static final Block ROCKY_DIRT = registerBlock("rocky_dirt",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);

    public static final Block ROCKY_DIRT_SLAB = registerBlock("rocky_dirt_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(3f, 6f)), ItemGroup.MISC);

    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(3f, 6f)), ItemGroup.MISC);

    /*
    Lumber Blocks
     */

    public static final Block HALF_LUMBER_BORDER = registerBlock("half_lumber_border",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_VERTICAL = registerBlock("half_lumber_vertical",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_HORIZONTAL = registerBlock("half_lumber_horizontal",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_DIAGONAL_LEFT = registerBlock("half_lumber_diagonal_left",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_DIAGONAL_RIGHT = registerBlock("half_lumber_diagonal_right",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_BRICK_BORDER = registerBlock("half_lumber_brick_border",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_BRICK_VERTICAL = registerBlock("half_lumber_brick_vertical",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_BRICK_HORIZONTAL = registerBlock("half_lumber_brick_horizontal",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_BRICK_DIAGONAL_LEFT = registerBlock("half_lumber_brick_diagonal_left",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    public static final Block HALF_LUMBER_BRICK_DIAGONAL_RIGHT = registerBlock("half_lumber_brick_diagonal_right",
            new FacingBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 6f)), ItemGroup.MISC);


    /*
    Log piles
     */
    public static final Block FULL_LOG_PILE = registerBlock("full_log_pile",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f, 6f)), ItemGroup.MISC);
    public static final Block LOG_PALISADE = registerBlock("log_palisade",
            new PalisadeBlock(FabricBlockSettings.of(Material.WOOD).strength(3f, 6f).nonOpaque()), ItemGroup.MISC);
    public static final Block LOG_PILE_TOP = registerBlock("log_pile_1_top",
            new UpperSlab(FabricBlockSettings.of(Material.WOOD).strength(3f, 6f).nonOpaque()), ItemGroup.MISC);
    public static final Block LOG_PILE_TOP_2 = registerBlock("log_pile_2_top",
            new UpperSlab(FabricBlockSettings.of(Material.WOOD).strength(3f, 6f).nonOpaque()), ItemGroup.MISC);
    public static final Block LOG_PILE_BOTTOM = registerBlock("log_pile_1_bottom",
            new BottomSlab(FabricBlockSettings.of(Material.WOOD).strength(3f, 6f).nonOpaque()), ItemGroup.MISC);
    public static final Block LOG_PILE_BOTTOM_2 = registerBlock("log_pile_2_bottom",
            new BottomSlab(FabricBlockSettings.of(Material.WOOD).strength(3f, 6f).nonOpaque()), ItemGroup.MISC);

    /*
    Steel Blocks
     */

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_carbite",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_PLATING = registerBlock("steel_plating",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_PILLAR = registerBlock("steel_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block SEEMLESS_STEEL = registerBlock("steel_seemless",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);
    public static final Block CUT_STEEL = registerBlock("steel_tiles",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block POLISHED_STEEL_PLATING = registerBlock("polished_steel_plating",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new DBEStairs(DBEBlocks.CUT_STEEL.getDefaultState(), FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);
    public static final Block STEEL_FRAME = registerBlock("steel_frame",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).nonOpaque().requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_WALL = registerBlock("steel_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_COLOUMN = registerBlock("steel_coloumn",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_GIRDER = registerBlock("steel_girder",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new DoorBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STEEL_MESH_TRAPDOOR = registerBlock("steel_mesh_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool().nonOpaque()), ItemGroup.MISC);

    public static final Block VENT_STRAIGHT = registerBlock("vent_straight",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).nonOpaque().requiresTool()), ItemGroup.MISC);

    public static final Block VENT_L_PIECE = registerBlock("vent_l",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).nonOpaque().requiresTool()), ItemGroup.MISC);

    public static final Block VENT_L_PIECE_UP = registerBlock("vent_l_up",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).nonOpaque().requiresTool()), ItemGroup.MISC);

    public static final Block VENT_L_PIECE_DOWN = registerBlock("vent_l_down",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).nonOpaque().requiresTool()), ItemGroup.MISC);


    /*
    Striped Blocks
     */
    public static final Block STRIPED_BLOCK = registerBlock("stripedblock",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STRIPEDBLOCK_HORIZONTAL = registerBlock("strippedblock_horizontal",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block STRIPED_BLOCK_MIDDLE = registerBlock("stripedblock_middle",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LEFT_YELLOW_ARROW = registerBlock("yellow_arrow_left",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block RIGHT_YELLOW_ARROW = registerBlock("yellow_arrow_right",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block ALARM_BLOCK = registerBlock("alarm_block",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block RADIATION_BLOCK = registerBlock("radiation_block",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block BIOHAZARD_BLOCK = registerBlock("biohazard_block",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block TOXIC_BLOCK = registerBlock("death_block",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);
    /*
    Lab Blocks
     */
    public static final Block PILLAR_BLOCK = registerBlock("copper_coil",
            new PillarBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block COMPUTER = registerBlock("pc_setup",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).nonOpaque().requiresTool()), ItemGroup.MISC);

    public static final Block SERVER_RACK = registerBlock("server_rack",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block COMPUTER_TERMINAL_STEEL = registerBlock("computer_terminal_steel",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block COMPUTER_TERMINAL = registerBlock("computer_terminal",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);


    public static final Block LABORATORY_BLOCK = registerBlock("laboratory_block",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block CUT_LABORATORY_BLOCK = registerBlock("cut_laboratory_block",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_VENT = registerBlock("laboratory_vent",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_TECHNICAL_PANEL = registerBlock("laboratory_panel",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_STRIPE = registerBlock("laboratory_stripe",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_ROMAN_1 = registerBlock("laboratory_roman_1",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_LEFT_ARROW = registerBlock("laboratory_left_arrow",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_RIGHT_ARROW = registerBlock("laboratory_right_arrow",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_ROMAN_5 = registerBlock("laboratory_roman_5",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    public static final Block LABORATORY_ROMAN_10 = registerBlock("laboratory_roman_10",
            new FacingBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool()), ItemGroup.MISC);

    /*
    Misc
     */

    public static final Block TRACK_END = registerBlock("track_end",
            new TrackEndBlock(FabricBlockSettings.of(Material.METAL).strength(3f, 6f).requiresTool().nonOpaque()), ItemGroup.MISC);

    public static final Block BOOKS_1 = registerBlock("book_1",
            new TrackEndBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f, 0.8f).nonOpaque()), ItemGroup.MISC);

    public static final Block BOOKS_2 = registerBlock("book_2",
            new TrackEndBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f, 0.8f).nonOpaque()), ItemGroup.MISC);

    public static final Block SKELETON_1 = registerBlock("skeleton_1",
            new TrackEndBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block SKELETON_2 = registerBlock("skeleton_2",
            new TrackEndBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block SKELETON_3 = registerBlock("skeleton_3",
            new TrackEndBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block SKELETON_4 = registerBlock("skeleton_4",
            new TrackEndBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block SKELETON_5 = registerBlock("skeleton_5",
            new TrackEndBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block SKELETON_6 = registerBlock("skeleton_6",
            new TrackEndBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);


    public static final Block REINFORCED_GLASS = registerBlock("reinforced_glass",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(15f, 1200f).nonOpaque()), ItemGroup.MISC);
    public static final Block ONEWAY_STONE = registerBlock("oneway_stone",
            new FacingBlock(FabricBlockSettings.of(Material.GLASS).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block ONEWAY_LAB_STONE = registerBlock("oneway_laboratory_block",
            new FacingBlock(FabricBlockSettings.of(Material.GLASS).strength(3f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block VANTA_BLACK = registerBlock("vanta_black",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block GREEN_SCREEN = registerBlock("green_screen",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block BLUE_SCREEN = registerBlock("blue_screen",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f, 3f).nonOpaque()), ItemGroup.MISC);

    public static final Block RUBBER_DUCK = registerBlock("rubber_duck",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(2f, 3f).nonOpaque()), ItemGroup.MISC);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DBE.MODID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(DBE.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        DBE.LOGGER.info("Registering Blocks for " + DBE.MODID);
    }
}
