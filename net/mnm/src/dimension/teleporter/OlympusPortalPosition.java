package net.mnm.src.dimension.teleporter;

import net.minecraft.util.ChunkCoordinates;

public class OlympusPortalPosition extends ChunkCoordinates
{
	public long field_85087_d;
	final OlympusTeleporter field_85088_e;

	public OlympusPortalPosition(OlympusTeleporter olympusTeleporter, int par2, int par3, int par4, long par5) {
		super(par2, par3, par4);
		this.field_85088_e = olympusTeleporter;
		this.field_85087_d = par5;
	}
}
