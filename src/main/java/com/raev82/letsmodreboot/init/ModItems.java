package com.raev82.letsmodreboot.init;

import com.raev82.letsmodreboot.item.ItemLMRB;
import com.raev82.letsmodreboot.item.ItemMapleLeaf;
import com.raev82.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
