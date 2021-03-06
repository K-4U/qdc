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
public class SquarePlainCookie extends AbstractCookieItem {

	public SquarePlainCookie(int itemId, int i) {
		super(itemId,i);
	}

	@Override
	protected String getCookieName() {
		return "plain_cookie_square";
	}

	@Override
	protected String getIngameName() {
		return "Square Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this), 
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterSquare.class));
	}

}
