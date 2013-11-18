package net.mnm.src.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.mnm.src.block.MNMBlock;
import net.mnm.src.block.OlympusCloud;
import net.mnm.src.block.OlympusFire;
import net.mnm.src.block.OlympusPortal;

public class MNMBlocks
{
	public static final OlympusFire olympusFire = (OlympusFire) new OlympusFire(Config.addBlock("Olympus Fire")).setUnlocalizedName(Util.MOD_ID + ":olympusFire");
	public static final OlympusPortal olympusPortal = (OlympusPortal) new OlympusPortal(Config.addBlock("Olympus Portal")).setUnlocalizedName(Util.MOD_ID + ":olympusPortal");
	public static final Block cloud1 = new OlympusCloud(Config.addBlock("Olympus Cloud"), Material.web).setUnlocalizedName("cloud1");
	
	public static final Block templeMosaicApollo = new MNMBlock(Config.addBlock("Temple Mosaic"), Material.rock).setUnlocalizedName("templeMosaicApollo");
	
	public static void addBlocks() {
		MNMRegistry.registerBlock(olympusFire, "Olympus Fire");
		MNMRegistry.registerBlock(olympusPortal, "Olympus Portal");
		MNMRegistry.registerBlock(cloud1, "Olympus Cloud");
		
		MNMRegistry.registerBlock(templeMosaicApollo, "Temple Mosaic");
	}
}