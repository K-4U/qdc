package qdc.cookies.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeedFood;

public class ItemSeedFoodGinger extends ItemSeedFood{

	public ItemSeedFoodGinger(int par1, int par2, float par3, int par4, int par5) {
		super(par1, par2, par3, par4, par5);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:ginger");
		
		
		
	}

}
