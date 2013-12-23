package qdc.cookies.items.cookies;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import cpw.mods.fml.common.registry.GameRegistry;


/**
 * 
 * Ginger Bread Man Cookie!
 * 
 * @author Ralle030583
 */
public class GBManCookie extends AbstractCookieItem {

	public GBManCookie(int itemId) {
		super(itemId, 6);
	}
	
	@Override
	protected String getCookieName() {
		return "GBMan";
	}

	@Override
	protected String getIngameName() {
		return "Gingerbread Man";
	}

	@Override
	protected void applyEffects() {
		super.applyEffects();
		this.setPotionEffect(Potion.moveSpeed.id, 10, 2, 1F);
	}
	
	@Override
	protected void registerReceipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this),
				Cookies.cookieItems.get(CookieDough.class),   
				Cookies.cutterGBMan, // to be replaced with the map 
				Cookies.gingerPowder);// to be replaced with the map 
	}
	
}
