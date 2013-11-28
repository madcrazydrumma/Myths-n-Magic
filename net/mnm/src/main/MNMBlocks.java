package net.mnm.src.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.mnm.src.block.MNMBlock;
import net.mnm.src.block.OlympusCloud;
import net.mnm.src.block.OlympusFire;
import net.mnm.src.block.OlympusPortal;
import net.mnm.src.block.TempleBlock;

public class MNMBlocks
{
	public static final OlympusFire olympusFire = (OlympusFire) new OlympusFire(Config.addBlock("Olympus Fire")).setUnlocalizedName(Util.MOD_ID + ":olympusFire");
	public static final OlympusPortal olympusPortal = (OlympusPortal) new OlympusPortal(Config.addBlock("Olympus Portal")).setUnlocalizedName(Util.MOD_ID + ":olympusPortal");
	public static final Block cloud1 = new OlympusCloud(Config.addBlock("Olympus Cloud"), Material.web).setUnlocalizedName("cloud1");
	
	public static final Block templeMosaicApollo = new TempleBlock(Config.addBlock("Temple Mosaic"), Material.rock).setUnlocalizedName("templeMosaicApollo");
	
	public static final Block templeBrick = new MNMBlock(Config.addBlock("Temple Brick"), Material.rock).setUnlocalizedName("templeBrick");
	
	public static final Block darkTempleBrick = new MNMBlock(Config.addBlock("Dark Temple Brick"), Material.rock).setUnlocalizedName("darkTempleBrick");
	public static final Block darkTempleBrickCarved = new MNMBlock(Config.addBlock("Dark Temple Brick Carved"), Material.rock).setUnlocalizedName("darkTempleBrickCarved");
	public static final Block darkTempleBrickCracked = new MNMBlock(Config.addBlock("Dark Temple Brick Cracked"), Material.rock).setUnlocalizedName("darkTempleBrickCracked");
	public static final Block darkTempleBrickMossy = new MNMBlock(Config.addBlock("Dark Temple Brick Mossy"), Material.rock).setUnlocalizedName("darkTempleBrickMossy");
	
	public static final Block ancientDivinityStone = new MNMBlock(Config.addBlock("Ancient Divinity Stone"), Material.rock).setUnlocalizedName("ancientDivinityStone");
	public static final Block ancientStone = new MNMBlock(Config.addBlock("Ancient Stone"), Material.rock).setUnlocalizedName("ancientStone");
	public static final Block ancientStoneOre = new MNMBlock(Config.addBlock("Ancient Stone Ore"), Material.rock).setUnlocalizedName("ancientStoneOre");
	
	public static void addBlocks() {
		MNMRegistry.registerBlock(olympusFire, "Olympus Fire");
		MNMRegistry.registerBlock(olympusPortal, "Olympus Portal");
		MNMRegistry.registerBlock(cloud1, "Olympus Cloud");
		
		MNMRegistry.registerBlock(templeMosaicApollo, "Temple Mosaic");
		
		MNMRegistry.registerBlock(templeBrick, "Temple Brick");
		
		MNMRegistry.registerBlock(darkTempleBrick, "Dark Temple Brick");
		MNMRegistry.registerBlock(darkTempleBrickCarved, "Dark Temple Brick Carved");
		MNMRegistry.registerBlock(darkTempleBrickCracked, "Dark Temple Brick Cracked");
		MNMRegistry.registerBlock(darkTempleBrickMossy, "Dark Temple Brick Mossy");
		
		MNMRegistry.registerBlock(ancientDivinityStone, "Ancient Divinity Stone");
		MNMRegistry.registerBlock(ancientStone, "Ancient Stone");
		MNMRegistry.registerBlock(ancientStoneOre, "Ancient Stone Ore");
	}
}