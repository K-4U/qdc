package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterStar;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Star Cookie!
 * 
 * @author Ralle030583
 */
public class StarPlainCookie extends AbstractCookieItem {

	public StarPlainCookie(int itemId, int i) {
		super(itemId,i);
	}

	@Override
	protected String getCookieName() {
		return "plain_cookie_star";
	}

	@Override
	protected String getIngameName() {
		return "Star Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterStar.class));
	}

}
