package qdc.cookies.items;

import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class CookieGeneric extends ItemFood{

	private String cookieType;
	public CookieGeneric(int id, int hunger, float saturation, boolean wolffood, String cookieName) {
		super(id, hunger, saturation, wolffood);
		cookieType = cookieName;
		this.setAlwaysEdible();
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setCreativeTab(Cookies.cookieTab);
		this.setUnlocalizedName("cookies:" + cookieName);
		this.applyEffects(cookieName);
	}

	
	private void applyEffects(String cookieName) {
		if(cookieType == "GBMan"){
			this.setPotionEffect(Potion.moveSpeed.id, 10, 2, 1F);
		}
		if(cookieType == "stream_xmas_tree"){
			this.setPotionEffect(Potion.wither.id, 20, 2, 1F);
		}
	}


	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		this.itemIcon = iconregister.registerIcon("cookies:" + cookieType);
	}
			
	
	
}
