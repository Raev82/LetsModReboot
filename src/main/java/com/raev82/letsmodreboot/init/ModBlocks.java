package com.raev82.letsmodreboot.init;

import com.raev82.letsmodreboot.block.BlockFlag;
import com.raev82.letsmodreboot.block.BlockLMRB;
import com.raev82.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
