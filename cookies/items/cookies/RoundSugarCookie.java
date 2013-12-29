package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterRound;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Ginger Bread Man Cookie!
 * 
 * @author Ralle030583
 */
public class RoundSugarCookie extends AbstractCookieItem {

	public RoundSugarCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "sugar_cookie";
	}

	@Override
	protected String getIngameName() {
		return "Sugar Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class), 
				Cookies.cookieItems.get(CutterRound.class), 
				Cookies.sugarPowder);// to be replaced with the map 
	}
}
