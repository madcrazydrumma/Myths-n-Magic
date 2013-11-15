package net.mnm.src.main;

import net.minecraft.item.Item;
import net.mnm.src.item.ItemOlympusPortalPlacer;
import net.mnm.src.item.MNMItem;

public class MNMItems
{
	public static final Item poseidonsTrident = new MNMItem(Config.addItem("Poseidon's Trident")).setUnlocalizedName("poseidonsTrident");
	public static final Item rubyAmethystPick = new MNMItem(Config.addItem("Precious Stone Pickaxe")).setUnlocalizedName("preciousStonePick");
	public static final Item ironGalive = new MNMItem(Config.addItem("Iron Galive")).setUnlocalizedName("ironGalive");
	public static final Item velvetHammer = new MNMItem(Config.addItem("Velvet Hammer")).setUnlocalizedName("velvetHammer");
	
	public static final Item olympusPortalPlacer = new ItemOlympusPortalPlacer(Config.addItem("Olympus Portal Placer")).setUnlocalizedName("olympusPortalPlacer");
	
	public static void addItems() {
		MNMRegistry.registerItem(poseidonsTrident, "Poseidon's Trident");
		MNMRegistry.registerItem(rubyAmethystPick, "Precious Stone Pickaxe");
		MNMRegistry.registerItem(ironGalive, "Iron Galive");
		MNMRegistry.registerItem(velvetHammer, "Velvet Hammer");
		
		MNMRegistry.registerItem(olympusPortalPlacer, "Olympus Portal Placer");
	}
}