package net.mnm.src.recipe;

import net.minecraft.item.ItemStack;
import net.mnm.src.main.MNMBlocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class MNMFunctions
{
	public static void addRecipes() {
		GameRegistry.addSmelting(MNMBlocks.ancientStoneOre.blockID, new ItemStack(MNMBlocks.ancientStone, 1), 0.2f);
	}
	
	public static void addEnchantments() {
		
	}
}