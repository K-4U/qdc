package qdc.cookies.items;

import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RibbonYellow extends Item{

	public RibbonYellow(int par1) {
		super(par1);
		
		this.setCreativeTab(Cookies.cookieTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:ribbon_yellow");
		
		
		
	}
	
	
	
}
