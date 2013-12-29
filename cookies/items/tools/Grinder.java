package qdc.cookies.items.tools;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Grinder extends Item {

	public Grinder(int par1) {
		super(par1);
		this.maxStackSize = 1;
		this.setMaxDamage(32);
		this.setCreativeTab(Cookies.cookieTab);
		this.setUnlocalizedName("cookies:hand_grinder");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		
		this.itemIcon = iconregister.registerIcon("cookies:hand_grinder");
	}
	
	
	/**
	 * Register an Item and return itself.
	 * @return this
	 */
	public Grinder register(){
		GameRegistry.registerItem(this, this.getUnlocalizedName());
		LanguageRegistry.addName(this, "Hand Grinder");
		
		GameRegistry.addRecipe(new ItemStack(this),
				" s ", 
				"wcw", 
				"ooo", 
				'w', Block.wood, 
				'c', Cookies.cookieItems.get(CutterRound.class), 
				'o', Block.cobblestone, 
				's', Item.stick);
		
		return this;
	}
	
	
}
