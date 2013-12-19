package qdc.cookies.items;

import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class CutterGeneric extends Item {

	private String cutterType;

	public CutterGeneric(int par1, String cutterName) {
		super(par1);
		cutterType = cutterName;
		this.setCreativeTab(Cookies.cookieTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister) {

		this.itemIcon = iconregister.registerIcon("cookies:" + cutterType);

	}

}
