package com.rabbitminers.dbe;

import com.rabbitminers.dbe.index.DBEBlocks;
import com.rabbitminers.dbe.index.DBEItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBE implements ModInitializer {
	public static final String MODID = "dbe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		DBEItems.registerModItems();
		DBEBlocks.registerModBlocks();
	}
}
