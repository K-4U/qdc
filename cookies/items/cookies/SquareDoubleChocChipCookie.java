package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.ChocolatePowder;
import qdc.cookies.items.CookieDough;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Double Chocolate Chip Square Cookie!
 * 
 * @author Ralle030583
 */
public class SquareDoubleChocChipCookie extends AbstractCookieItem {

	public SquareDoubleChocChipCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "double_choc_chip_cookie_square";
	}

	@Override
	protected String getIngameName() {
		return "Double Chocolate Chip Square Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cutterSquare, 
				Cookies.cookieItems.get(ChocChip.class), 
				Cookies.cookieItems.get(ChocolatePowder.class));
	}

}
