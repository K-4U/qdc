package qdc.cookies.items.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class AbstractCutterItem extends Item {

	public AbstractCutterItem(int par1) {
		super(par1);
		this.setUnlocalizedName(this.getName());
		this.setCreativeTab(Cookies.cookieTab);
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister) {
		this.itemIcon = iconregister.registerIcon("cookies:" + this.getName());
	}
	
	protected abstract String getName();

	protected abstract String getIngameName();
	
	public AbstractCutterItem register(){
		GameRegistry.registerItem(this, this.getUnlocalizedName());
		LanguageRegistry.addName(this, this.getIngameName());
		this.registerReceipes();
		return this;
	}

	/**
	 * Hook Method for registering receipes during {@link #register()}.
	 */
	protected void registerReceipes(){	};
}
