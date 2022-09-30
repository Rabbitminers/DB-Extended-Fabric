package com.rabbitminers.dbe.index;

import com.rabbitminers.dbe.DBE;
import com.rabbitminers.dbe.blocks.util.BottomSlab;
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

import java.util.ArrayList;
import java.util.List;

public class DBEDyedBlocks {

    static ItemGroup group = ItemGroup.MISC;
    public static List<Block> excludeFromCull = new ArrayList<Block>();
    public static String[] colours = {"black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink", "brown"};

    public static void boilerFactory() {
        excludeFromCull.add(registerBlock("create_boiler",
                new PillarBlock(FabricBlockSettings.of(Material.METAL)
                        .strength(3f, 6f)
                        .requiresTool()), group));

        excludeFromCull.add(registerBlock("copper_boiler",
                new PillarBlock(FabricBlockSettings.of(Material.METAL)
                        .strength(3f, 6f)
                        .requiresTool()), group));

        excludeFromCull.add(registerBlock("zinc_boiler",
                new PillarBlock(FabricBlockSettings.of(Material.METAL)
                        .strength(3f, 6f)
                        .requiresTool()), group));

        excludeFromCull.add(registerBlock("brass_boiler",
                new PillarBlock(FabricBlockSettings.of(Material.METAL)
                        .strength(3f, 6f)
                        .requiresTool()), group));

        for (String colour: colours) {
            excludeFromCull.add(registerBlock(colour+"_boiler",
                    new PillarBlock(FabricBlockSettings.of(Material.METAL)
                            .strength(3f, 6f)
                            .requiresTool()), group));

            excludeFromCull.add(registerBlock(colour+"_gilded_boiler",
                    new PillarBlock(FabricBlockSettings.of(Material.METAL)
                            .strength(3f, 6f)
                            .requiresTool()), group));
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
