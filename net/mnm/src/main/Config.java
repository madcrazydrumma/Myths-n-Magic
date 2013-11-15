package net.mnm.src.main;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	public static int blockID = 2000;
	public static int itemID = 5000;
	public static int biomeBlockID = 230;
	public static int enchantmentID = 100;
	public static int entityID = 10000;
	public static boolean snowyWorld;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		config.load();
	}

	public static int addItem(String name)
	{
		itemID++;

		return config.get("Items", name, itemID).getInt();
	}

	public static int addBlock(String name)
	{
		blockID++;

		return config.get("Blocks", name, blockID).getInt();
	}

	public static int addEntity(String name)
	{
		entityID++;

		return config.get("Entities", name, entityID).getInt() - 1;
	}
	
	public static void initPost()
	{
		config.save();
	}
}