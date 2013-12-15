package qdc.cookies.items;

import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class Grinder extends Item {

	public Grinder(int par1) {
		super(par1);
		maxStackSize = 1;
		this.setMaxDamage(32);
		this.setCreativeTab(Cookies.cookieTab);
	}
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:hand_grinder");
		
		
		
	}
}
