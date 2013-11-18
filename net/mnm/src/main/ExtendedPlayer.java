package net.mnm.src.main;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "MythsNMagic";
	
	private EntityPlayer player;
	
	public static int reputation;
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer());
	}
	
	public static final ExtendedPlayer get(EntityPlayer player)
	{
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound props = new NBTTagCompound();
		props.setInteger("reputation", reputation);
		compound.setTag(EXT_PROP_NAME, props);
	}
	
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound props = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);
		this.reputation = props.getInteger("reputation");
	}
	
	public final void sync()
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream(1);
		DataOutputStream outputStream = new DataOutputStream(bos);
		
		try {
			outputStream.writeInt(this.getReputation());
			outputStream.close();
			bos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		Packet250CustomPayload packet = new Packet250CustomPayload("mnm", bos.toByteArray());
		
		if (this.player.worldObj.isRemote) {
			EntityClientPlayerMP player1 = (EntityClientPlayerMP) player;
			player1.sendQueue.addToSendQueue(packet);
		}
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void addReputation(int amount) {
		reputation = reputation + amount;
		this.sync();
	}
	
	@Override
	public void init(Entity entity, World world) {
		this.player = (EntityPlayer) entity;
	}
}