package net.mnm.src.world.biomes;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDecoratorOlympus extends BiomeDecorator {

	public BiomeDecoratorOlympus(BiomeGenBase par1BiomeGenBase) {
		super(par1BiomeGenBase);
	}
	
	@Override
	protected void decorate() {
		super.decorate();
		System.out.println("Decorate : No Prams");
	}

	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4) {
		super.decorate(par1World, par2Random, par3, par4);
		System.out.println("Decorate : With Prams");
		//TADO: all  biome gen done here, all ores can gen here aswell.
	}
}