package net.mnm.src.main;

import net.minecraft.item.Item;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MNMRegistry
{
public static int id = 500;
	
	public static void register()
	{
		//NetworkRegistry.instance().registerGuiHandler(SkyrimcraftII.instance, new GuiHandler());
	}

	public static void registerItem(Item item, String name)
	{
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}

	public static void registerBlock(Block block, String name)
	{
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
}