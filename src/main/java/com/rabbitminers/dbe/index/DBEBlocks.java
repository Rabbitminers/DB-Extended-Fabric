package com.rabbitminers.dbe.index;

import com.rabbitminers.dbe.DBE;
import com.rabbitminers.dbe.blocks.boilers.BoilerBlock;
import com.rabbitminers.dbe.blocks.util.*;
import com.rabbitminers.dbe.blocks.util.FacingBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;

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
