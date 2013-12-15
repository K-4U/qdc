package qdc.cookies.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class CutterSquare extends Item {

	public CutterSquare(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:cookie_cutter_square");
		
		
		
	}

}
