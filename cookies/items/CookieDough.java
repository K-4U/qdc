package qdc.cookies.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * @author KentBen
 */
public class CookieDough extends Item {

	public CookieDough(int id) {
		super(id);
		this.setUnlocalizedName("cookies:cookie_dough");
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setCreativeTab(Cookies.cookieTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		this.itemIcon = iconregister.registerIcon("cookies:cookie_dough");
	}
	 
	public CookieDough register(){
		GameRegistry.registerItem(this, this.getUnlocalizedName());
		LanguageRegistry.addName(this, "Cookie Dough");
		return this;
	}
	
}
