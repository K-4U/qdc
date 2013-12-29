package qdc.cookies.items.tools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class CutterRound extends AbstractCutterItem {

	public CutterRound(int itemId) {
		super(itemId);
	}

	@Override
	protected String getName() {
		return "cookie_cutter_circle";
	}

	@Override
	protected String getIngameName() {
		return "Round Cookie Cutter";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addRecipe(new ItemStack(this), " x ",
				"xyx", " x ", 'x', Item.ingotIron, 'y', Block.wood);
		super.registerReceipes();
	}
}
