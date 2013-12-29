package qdc.cookies.items.cookies;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.tools.CutterXmasTree;
import cpw.mods.fml.common.registry.GameRegistry;



/**
 * Christmas Tree Cookie!
 * 
 * @author Ralle030583
 */
public class ChristmasTreeCookie extends AbstractCookieItem {

	public ChristmasTreeCookie(int itemId) {
		super(itemId);
	}

	@Override
	protected String getCookieName() {
		return "stream_xmas_tree";
	}

	@Override
	protected String getIngameName() {
		return "Stream Christmas Cookie";
	}

	@Override
	protected void applyEffects() {
		super.applyEffects();
		this.setPotionEffect(Potion.wither.id, 20, 2, 1F);
	}
	
	@Override
	protected void registerReceipes() {
		GameRegistry.addRecipe(new ItemStack(this), 
				" g ",
				"ybr", 
				"dsc", 
				'g', new ItemStack(Item.dyePowder, 1, 2), 
				'y', new ItemStack(Item.dyePowder, 1, 11), 
				'b', new ItemStack(Item.dyePowder, 1, 4),
				'r', new ItemStack(Item.dyePowder, 1, 1), 
				'c', Cookies.cookieItems.get(CutterXmasTree.class), 
				'd', Cookies.cookieItems.get(CookieDough.class), 
				's', Cookies.sugarPowder);
	}

}
