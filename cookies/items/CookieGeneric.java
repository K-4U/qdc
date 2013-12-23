package qdc.cookies.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Deprecated
public class CookieGeneric extends ItemFood{

	private String cookieType;
	public CookieGeneric(int id, int hunger, float saturation, boolean wolffood, String cookieName) {
		super(id, hunger, saturation, wolffood);
		this.cookieType = cookieName;
		this.setAlwaysEdible();
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setCreativeTab(Cookies.cookieTab);
		this.setUnlocalizedName("cookies:" + cookieName);
		this.applyEffects(cookieName);
	}

	
	private void applyEffects(String cookieName) {
	}


	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		this.itemIcon = iconregister.registerIcon("cookies:" + this.cookieType);
	}
			
	
	
}
