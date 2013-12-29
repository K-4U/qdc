package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterSquare;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Square Sugar Cookie!
 * 
 * @author Ralle030583
 */
public class SquareSugarCookie extends AbstractCookieItem {

	public SquareSugarCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "sugar_cookie_square";
	}

	@Override
	protected String getIngameName() {
		return "Square Sugar Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this), 
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterSquare.class),
				Cookies.sugarPowder);
	}

}
