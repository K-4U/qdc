package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterRound;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Plain Cookie.
 * 
 * @author Ralle030583
 */
public class RoundPlainCookie extends AbstractCookieItem {

	public RoundPlainCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "plain_cookie";
	}

	@Override
	protected String getIngameName() {
		return "Plain Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterRound.class));
	}

}
