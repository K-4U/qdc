package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterStar;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Star Sugar Cookie!
 * 
 * @author Ralle030583
 */
public class StarSugarCookie extends AbstractCookieItem {

	public StarSugarCookie(int itemId, int i) {
		super(itemId,i);
	}

	@Override
	protected String getCookieName() {
		return "sugar_cookie_star";
	}

	@Override
	protected String getIngameName() {
		return "Star Sugar Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class), 
				Cookies.cookieItems.get(CutterStar.class),
				Cookies.sugarPowder);
	}

}
