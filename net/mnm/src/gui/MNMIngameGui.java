package net.mnm.src.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.mnm.src.main.ExtendedPlayer;
import net.mnm.src.main.Util;

import org.lwjgl.opengl.GL11;

public class MNMIngameGui extends Gui
{
	private Minecraft mc = Minecraft.getMinecraft();
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void renderGameOverlay(RenderGameOverlayEvent event) {
		
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		ExtendedPlayer props = ExtendedPlayer.get(this.mc.thePlayer);
		
		if(props == null) {
			return;
		}
		
		int rep = props.getReputation();
		
		if(rep >= 10000)
			rep = 10000;
		if(rep <= -10000)
			rep = -10000;
		
		if(rep == 0)
			drawCenteredString(fontrenderer, "Neutral", width / 2 + 2, 32, 0xffffff);
		else if(rep >= 1 && rep <= 499)
			drawCenteredString(fontrenderer, "Liked", width / 2 + 2, 32, 0xffffff);
		else if(rep >= 500 && rep <= 999)
			drawCenteredString(fontrenderer, "Favoured", width / 2 + 2, 32, 0xffffff);
		else if(rep >= 1000 && rep <= 2499)
			drawCenteredString(fontrenderer, "Hero", width / 2 + 2, 32, 0xffffff);
		else if(rep >= 2500 && rep <= 4999)
			drawCenteredString(fontrenderer, "Chosen", width / 2 + 2, 32, 0xffffff);
		else if(rep >= 5000 && rep <= 9999)
			drawCenteredString(fontrenderer, "Saviour", width / 2 + 2, 32, 0xffffff);
		else if(rep == 10000)
			drawCenteredString(fontrenderer, "\u00a76Godlike\u00a7f", width / 2 + 2, 32, 0xffffff);
		
		ResourceLocation icons = new ResourceLocation(Util.MOD_ID, "textures/gui/icons.png");
		mc.renderEngine.bindTexture(icons);
		GL11.glPushMatrix();
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			drawTexturedModalRect(width / 2 - 125, 10, 0, 0, 250, 17);
			drawTexturedModalRect(width / 2 - 3, 10, 0, 19, 9, 20);
		GL11.glPopMatrix();
    }
}