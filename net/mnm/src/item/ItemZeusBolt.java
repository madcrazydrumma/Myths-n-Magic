package net.mnm.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.mnm.src.main.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemZeusBolt extends Item
{
	public ItemZeusBolt(int par1)
	{
		super(par1 - 256);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public void registerIcons(IconRegister i)
	{
		this.itemIcon = i.registerIcon(Util.MOD_ID + ":" + this.getName());
	}
	
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}
	
	public int getRenderPasses(int metadata) {
		metadata = 2;
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
    	return true;
    }
	
	public String getName()
	{
		return this.unlocalizedName;
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
}