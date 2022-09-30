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
