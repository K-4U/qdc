package qdc.cookies.items.tools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class CutterXmasTree extends AbstractCutterItem {

	public CutterXmasTree(int itemId) {
		super(itemId);
	}

	@Override
	protected String getName() {
		return "xmas_tree_cutter";
	}

	@Override
	protected String getIngameName() {
		return "Christmas Tree Cutter";
	}

	@Override
	protected void registerReceipes() {
		GameRegistry.addRecipe(new ItemStack(this), " x ", "xyx",
				" x ", 'x', new ItemStack(Item.dyePowder, 1, 4), 'y',
				Block.wood);
	}
}
