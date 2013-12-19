package qdc.cookies.items;

import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class CookieGeneric extends ItemFood{

	private String cookieType;
	public CookieGeneric(int id, int hunger, float saturation, boolean wolffood, String cookieTexture) {
		super(id, hunger, saturation, wolffood);
		cookieType = cookieTexture;
		this.setAlwaysEdible();
		if(cookieType == "GBMan"){
			this.setPotionEffect(Potion.moveSpeed.id, 10, 2, 1F);
		}
		
		if(cookieType == "stream_xmas_tree"){
			this.setPotionEffect(Potion.wither.id, 20, 2, 1F);
		}
		
		this.setCreativeTab(Cookies.cookieTab);
	}

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:" + cookieType);
		
		
		
	}
			
			
			
	
	
	
	
}
