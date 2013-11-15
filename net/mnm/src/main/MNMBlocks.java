package net.mnm.src.main;

import net.mnm.src.block.OlympusPortal;

public class MNMBlocks
{
	public static final OlympusPortal olympusPortal = (OlympusPortal) new OlympusPortal(Config.addBlock("Olympus Portal")).setUnlocalizedName(Util.MOD_ID + ":olympusPortal");
	
	public static void addBlocks() {
		MNMRegistry.registerBlock(olympusPortal, "Olympus Portal");
	}
}