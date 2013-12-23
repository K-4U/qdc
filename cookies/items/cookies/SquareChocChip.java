package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.CookieDough;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Square Choc Cip.
 * 
 * @author Ralle030583
 */
public class SquareChocChip extends AbstractCookieItem {

	public SquareChocChip(int itemId) {
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
				Cookies.cutterSquare, // to be replaced with the map  
				Cookies.cookieItems.get(ChocChip.class));
	}

}
