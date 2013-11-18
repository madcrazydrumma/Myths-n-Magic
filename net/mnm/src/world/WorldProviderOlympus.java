package net.mnm.src.world;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;
import net.mnm.src.chunk.ChunkProviderOlympus;
import net.mnm.src.main.Util;

public class WorldProviderOlympus extends WorldProvider
{
	@Override
	public void registerWorldChunkManager()
	{
		/** tells Minecraft to use our new WorldChunkManager **/
		this.worldChunkMgr = new WorldChunkManagerOlympus(worldObj.getSeed(), terrainType);
		this.hasNoSky = false;
	}

	@Override
	/** Dimension Name **/
	public String getDimensionName()
	{
		return "Olympus";
	}

	/** Get Provider for dimension **/
	public static WorldProvider getProviderForDimension(int id)
	{
		return DimensionManager.createProviderFor(Util.olympusID);
	}

	/** What chunk provider to use **/
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderOlympus(worldObj, worldObj.getSeed());
	}

	/** Can player re-spawn here **/
	@Override
	public boolean canRespawnHere()
	{
		return false;
	}

	/** Determines the dimension the player will be respawned in **/
	@Override
	public int getRespawnDimension(EntityPlayerMP player)
	{
		return 0;
	}

	/** Dimension Movement speed **/
	@Override
	public double getMovementFactor()
	{
		return 1.0;
	}

	/** Dimension avarage ground level **/
	@Override
	public int getAverageGroundLevel()
	{
		//return this.terrainType.getMinimumSpawnHeight(this.worldObj);
		return 64;
	}

	@Override
	public ChunkCoordinates getRandomizedSpawnPoint()
	{
		ChunkCoordinates chunkcoordinates = new ChunkCoordinates(this.worldObj.getSpawnPoint());

		boolean isAdventure = worldObj.getWorldInfo().getGameType() == EnumGameType.ADVENTURE;
		int spawnFuzz = terrainType.getSpawnFuzz();
		int spawnFuzzHalf = spawnFuzz / 2;

		if (!hasNoSky && !isAdventure)
		{
			chunkcoordinates.posX = 50;//+= this.worldObj.rand.nextInt(spawnFuzz) - spawnFuzzHalf;
			chunkcoordinates.posZ = 50;//+= this.worldObj.rand.nextInt(spawnFuzz) - spawnFuzzHalf;
			chunkcoordinates.posY = this.worldObj.getTopSolidOrLiquidBlock(chunkcoordinates.posX, chunkcoordinates.posZ);
		}
		else
		{
			return this.getEntrancePortalLocation();
		}
		return chunkcoordinates;
	}

	@Override
	public ChunkCoordinates getEntrancePortalLocation()
	{
		return new ChunkCoordinates(0, 64, 0);
	}

	@Override
	protected void generateLightBrightnessTable()
	{
		float f = 0.0F;

		for (int i = 0; i <= 15; ++i)
		{
			float f1 = 1.0F - (float)i / 15.0F;
			this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
		}
	}
}