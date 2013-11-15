package net.mnm.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.mnm.src.main.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MNMItem extends Item
{
	public MNMItem(int par1)
	{
		super(par1 - 256);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public void registerIcons(IconRegister i)
	{
		this.itemIcon = i.registerIcon(Util.MOD_ID + ":" + this.getName());
	}
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
    	return true;
    }
	
	public String getName()
	{
		return this.unlocalizedName;
	}
}