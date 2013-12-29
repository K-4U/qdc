package qdc.cookies.items.tools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class CutterGBMan extends AbstractCutterItem {

	public CutterGBMan(int itemId) {
		super(itemId);
	}

	@Override
	protected String getName() {
		return "cookie_cutter_GBMan";
	}

	@Override
	protected String getIngameName() {
		return "Gingerbread Man Cutter";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addRecipe(new ItemStack(this), " x ",
				"xyx", " x ", 'x', Item.emerald, 'y', Block.wood);
	}
}
