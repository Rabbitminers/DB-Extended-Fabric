package com.rabbitminers.dbe.index;

import com.rabbitminers.dbe.DBE;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DBEItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DBE.MODID, name), item);
    }
    public static void registerModItems() {
        DBE.LOGGER.info("Registering items for " + DBE.MODID);
    }

}
