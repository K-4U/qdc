package qdc.cookies.items;

import net.minecraft.client.renderer.texture.IconRegister;
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
public class ChocChip extends Item{

	public ChocChip(int par1) {
		super(par1);
		this.setUnlocalizedName("cookies:choc_chips");
		this.setCreativeTab(Cookies.cookieTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		this.itemIcon = iconregister.registerIcon("cookies:choc_chips");
	}

	/**
	 * Register and return yourself.
	 * @return
	 */
	public Item register() {
		GameRegistry.registerItem(this, "choc_chips");
		LanguageRegistry.addName(this,  "Chocolate Chips");
		return this; 
	}
}
