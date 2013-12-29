package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.ChocolatePowder;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterRound;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Double Chocolate Chip Cookie!
 * 
 * @author Ralle030583
 */
public class RoundDoubleChocChipCookie extends AbstractCookieItem {

	public RoundDoubleChocChipCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "double_choc_chip_cookie";
	}

	@Override
	protected String getIngameName() {
		return "Double Chocolate Chip Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterRound.class),
				Cookies.cookieItems.get(ChocChip.class), 
				Cookies.cookieItems.get(ChocolatePowder.class));
	}

}
