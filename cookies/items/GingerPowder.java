package qdc.cookies.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class GingerPowder extends Item{

	public GingerPowder(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:grated_ginger");
		
		
		
	}
	
	
	
	
}
