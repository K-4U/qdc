package qdc.cookies.items.tools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class CutterSquare extends AbstractCutterItem {

	public CutterSquare(int itemId) {
		super(itemId);
	}

	@Override
	protected String getName() {
		return "cookie_cutter_square";
	}

	@Override
	protected String getIngameName() {
		return "Square Cookie Cutter";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addRecipe(new ItemStack(this), " x ",
				"xyx", " x ", 'x', Item.ingotGold, 'y', Block.wood);
	}
}
