package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
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
				new ItemStack(Cookies.roundSugarCookie), Cookies.cookieDough,
				Cookies.cutterCircle, Cookies.sugarPowder);
	}

}
