package qdc.cookies.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class CookieGeneric extends ItemFood{

	private String CookieType;
	public CookieGeneric(int id, int hunger, float saturation, boolean wolffood, String cookieTexture) {
		super(id, hunger, saturation, wolffood);
		CookieType = cookieTexture;
		// TODO Auto-generated constructor stub
	}

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:" + CookieType);
		
		
		
	}
			
			
			
	
	
	
	
}
