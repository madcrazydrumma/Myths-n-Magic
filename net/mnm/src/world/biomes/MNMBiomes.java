package net.mnm.src.world.biomes;

import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class MNMBiomes extends BiomeGenBase{
	
	public static final BiomeGenBase olympusBiome = new BiomeOlympus(50);

	public MNMBiomes(int par1) {
		super(par1);
	}
	
	//UN COMMENT THIS TO USE THE BIOMEDECORATOROLYMPUS FOR GENERATION IN THE OLYMPUS BIOME
	/**
	@Override
	public BiomeDecorator createBiomeDecorator() {
		return super.createBiomeDecorator();
	}
	
	@Override
	public BiomeDecorator getModdedBiomeDecorator(BiomeDecorator original) {
		return new BiomeDecoratorOlympus(this);
	}
	**/
}
