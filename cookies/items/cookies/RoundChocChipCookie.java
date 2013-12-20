package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Ginger Bread Man Cookie!
 * 
 * @author Ralle030583
 */
public class RoundChocChipCookie extends AbstractCookieItem {

	public RoundChocChipCookie(int itemId) {
		super(itemId);
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
				Cookies.cookieDough, Cookies.cutterCircle, Cookies.chocChips);
	}

}
