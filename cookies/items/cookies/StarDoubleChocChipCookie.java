package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.ChocolatePowder;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterStar;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Star Chop Chip Cookie!
 * 
 * @author Ralle030583
 */
public class StarDoubleChocChipCookie extends AbstractCookieItem {

	public StarDoubleChocChipCookie(int itemId, int i) {
		super(itemId,i);
	}

	@Override
	protected String getCookieName() {
		return "double_choc_chip_cookie_star";
	}

	@Override
	protected String getIngameName() {
		return "Double Chocolate Chip Star Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this), 
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterStar.class), 
				Cookies.cookieItems.get(ChocChip.class), 
				Cookies.cookieItems.get(ChocolatePowder.class));
	}

}
