package net.mnm.src.event;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.mnm.src.main.ExtendedPlayer;

public class MNMEventsHandler
{
	public Minecraft mc = Minecraft.getMinecraft();
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null) {
			ExtendedPlayer.register((EntityPlayer) event.entity);
		}
	}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void onKillEntity(LivingDeathEvent event) {
		ExtendedPlayer props = ExtendedPlayer.get(mc.thePlayer);
		
		if(props == null) {
			return;
		}
		
		if(event.source.getEntity() instanceof EntityPlayer) {
			if(event.entityLiving instanceof EntityAnimal) {
				props.addReputation(-1);
			} else if(event.entityLiving instanceof EntityMob) {
				props.addReputation(1);
			}
		}
		System.out.println(props.getReputation());
	}
}