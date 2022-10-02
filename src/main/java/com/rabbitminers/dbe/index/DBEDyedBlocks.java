package com.rabbitminers.dbe.index;

import com.rabbitminers.dbe.DBE;
import com.rabbitminers.dbe.blocks.boilers.BoilerBlock;
import com.rabbitminers.dbe.blocks.util.BottomSlab;
import com.rabbitminers.dbe.blocks.util.DBEStairs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DBEDyedBlocks {

    static ItemGroup group = ItemGroup.MISC;
    public static List<Block> excludeFromCull = new ArrayList<Block>();
    public static String[] colours = {"black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink", "brown"};
    public static String[] materials = {"create", "copper", "zinc", "brass"};

    public static void boilerFactory() {
        for (String material: materials) {
            excludeFromCull.add(registerBlock(material+"_boiler",
                    new BoilerBlock(FabricBlockSettings.of(Material.METAL)
                            .strength(5.0f, 6f)
                            .nonOpaque()
                            .requiresTool()), group));
        }

        for (String colour: colours) {
            excludeFromCull.add(registerBlock(colour+"_boiler",
                    new BoilerBlock(FabricBlockSettings.of(Material.METAL)
                            .strength(5.0f, 6f)
                            .nonOpaque()
                            .requiresTool()), group));

            if (Objects.equals(colour, "black") || Objects.equals(colour, "red")) {
                excludeFromCull.add(registerBlock(colour + "_guilded_boiler",
                        new BoilerBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group));

                registerBlock(colour + "_steel_tank",
                        new PillarBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);
                if (Objects.equals(colour, "black")) {
                    registerBlock(colour + "_guilder_steel_tank",
                            new PillarBlock(FabricBlockSettings.of(Material.METAL)
                                    .strength(5.0f, 6f)
                                    .nonOpaque()
                                    .requiresTool()), group);
                } else {
                    registerBlock(colour + "_guilded_steel_tank",
                            new PillarBlock(FabricBlockSettings.of(Material.METAL)
                                    .strength(5.0f, 6f)
                                    .nonOpaque()
                                    .requiresTool()), group);
                }

                Block LAST_USED = registerBlock(colour + "_steel_plating",
                        new Block(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_stairs",
                        new DBEStairs(LAST_USED.getDefaultState(), FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_slab",
                        new SlabBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_trapdoor",
                        new TrapdoorBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_wall",
                        new WallBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);
            } else {
                excludeFromCull.add(registerBlock(colour+"_gilded_boiler",
                        new BoilerBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group));

                registerBlock(colour + "_steel_tank",
                        new PillarBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_gilded_steel_tank",
                        new PillarBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                Block LAST_USED = registerBlock(colour + "_steel_plating",
                        new Block(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_stairs",
                        new DBEStairs(LAST_USED.getDefaultState(), FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_slab",
                        new SlabBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_trapdoor",
                        new TrapdoorBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);

                registerBlock(colour + "_steel_wall",
                        new WallBlock(FabricBlockSettings.of(Material.METAL)
                                .strength(5.0f, 6f)
                                .nonOpaque()
                                .requiresTool()), group);
            }
        }
    }
    public static void quiltedWoolFactory() {
        for (String colour: colours) {
            registerBlock(colour+"_quilted_wool",
                    new PillarBlock(FabricBlockSettings.of(Material.WOOL)
                            .strength(0.8f, 0.8f)), group);
        }
    }

    public static void woolChairFactory() {
        for (String colour: colours) {
            excludeFromCull.add(registerBlock(colour+"_chair",
                    new BottomSlab(FabricBlockSettings.of(Material.WOOL)
                            .strength(0.8f, 0.8f)
                            .nonOpaque()), group));
        }
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DBE.MODID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(DBE.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        DBE.LOGGER.info("Registering Wool Blocks for " + DBE.MODID);

        quiltedWoolFactory();
        woolChairFactory();
        boilerFactory();
    }
}
