package net.mnm.src.packet;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.mnm.src.main.ExtendedPlayer;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler
{
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		if(packet.channel.equals("mnm")) {
			handlePlayerNBT(packet, player);
		}
	}
	
	private void handlePlayerNBT(Packet250CustomPayload packet, Player player) {
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
		ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) player);
		
		try {
			int amount = inputStream.readInt();
			props.addReputation(amount);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
}