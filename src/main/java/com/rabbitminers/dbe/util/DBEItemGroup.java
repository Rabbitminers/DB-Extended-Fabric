package com.rabbitminers.dbe.util;

import com.rabbitminers.dbe.DBE;
import com.rabbitminers.dbe.index.DBEBlocks;
import com.rabbitminers.dbe.index.DBEDyedBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DBEItemGroup {
    public static final ItemGroup DBEGROUP = FabricItemGroupBuilder.build(new Identifier(DBE.MODID),
        () -> new ItemStack(DBEBlocks.STRIPED_BLOCK));
}
