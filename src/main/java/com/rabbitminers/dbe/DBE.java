package com.rabbitminers.dbe;

import com.rabbitminers.dbe.index.DBEBlocks;
import com.rabbitminers.dbe.index.DBEItems;
import com.rabbitminers.dbe.index.DBEDyedBlocks;
import com.rabbitminers.dbe.util.DBETags;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBE implements ModInitializer {
	public static final String MODID = "dbe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static final TagKey<Item> STEEL_INGOT = DBETags.Items.STEEL_INGOT;

	@Override
	public void onInitialize() {
		DBEItems.registerModItems();
		DBEBlocks.registerModBlocks();
		DBEDyedBlocks.registerModBlocks();
	}
}
