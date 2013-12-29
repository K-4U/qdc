package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterSquare;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Square Choc Cip.
 * 
 * @author Ralle030583
 */
public class SquareChocChipCookie extends AbstractCookieItem {

	public SquareChocChipCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "choc_chip_cookie_square";
	}

	@Override
	protected String getIngameName() {
		return "Chocolate Chip Square Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterSquare.class),
				Cookies.cookieItems.get(ChocChip.class));
	}

}
