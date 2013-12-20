package qdc.cookies.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChocolatePowder extends Item{

	public ChocolatePowder(int par1) {
		super(par1);
		this.setUnlocalizedName("cookies:chocolate_powder");
		this.setCreativeTab(Cookies.cookieTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		this.itemIcon = iconregister.registerIcon("cookies:chocolate_powder");
	}
	
	public ChocolatePowder register(){
		GameRegistry.registerItem(this, this.getUnlocalizedName());
		LanguageRegistry.addName(this, "Chocolate Powder");
		return this;
	}
}
