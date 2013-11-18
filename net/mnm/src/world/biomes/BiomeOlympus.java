package net.mnm.src.world.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeOlympus extends BiomeGenBase {

	public BiomeOlympus(int par1) {
		super(par1);
		this.setBiomeName("Olympus");
		this.topBlock = (byte)Block.blockGold.blockID;
		this.fillerBlock = (byte)Block.blockClay.blockID;
	}
}
