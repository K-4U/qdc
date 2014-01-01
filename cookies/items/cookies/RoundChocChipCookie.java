package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterRound;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Ginger Bread Man Cookie!
 * 
 * @author Ralle030583
 */
public class RoundChocChipCookie extends AbstractCookieItem {

	public RoundChocChipCookie(int itemId, int hunger) {
		super(itemId, hunger);
	}

	@Override
	protected String getCookieName() {
		return "choc_chip_cookie";
	}

	@Override
	protected String getIngameName() {
		return "Chocolate Chip Cookie";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),
				Cookies.cookieItems.get(CutterRound.class), 
				Cookies.cookieItems.get(ChocChip.class));
	}

}
