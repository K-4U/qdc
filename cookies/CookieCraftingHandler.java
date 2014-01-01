package qdc.cookies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import qdc.cookies.items.tools.CutterGBMan;
import qdc.cookies.items.tools.CutterRound;
import qdc.cookies.items.tools.CutterSquare;
import qdc.cookies.items.tools.CutterStar;
import qdc.cookies.items.tools.CutterXmasTree;
import qdc.cookies.items.tools.Grinder;
import cpw.mods.fml.common.ICraftingHandler;

public class CookieCraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {

		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) {

			if (craftMatrix.getStackInSlot(i) != null) {
				ItemStack stack = craftMatrix.getStackInSlot(i);

				if (stack.getItem() != null
						&& stack.getItem() == Cookies.cookieItems
								.get(Grinder.class)) {

					ItemStack newStack = new ItemStack(
							Cookies.cookieItems.get(Grinder.class), 2,
							(stack.getItemDamage() + 1));
					if (newStack.getItemDamage() >= newStack.getMaxDamage()) {
						newStack.stackSize--;
					}

					craftMatrix.setInventorySlotContents(i, newStack);

				}

				if (stack.getItem() != null
						&& stack.getItem() == Cookies.cookieItems
								.get(CutterRound.class)) {

					ItemStack newStack2 = new ItemStack(
							Cookies.cookieItems.get(CutterRound.class), 2);

					craftMatrix.setInventorySlotContents(i, newStack2);

				}
				if (stack.getItem() != null
						&& stack.getItem() == Cookies.cookieItems
								.get(CutterSquare.class)) {

					ItemStack newStack2 = new ItemStack(
							Cookies.cookieItems.get(CutterSquare.class), 2);

					craftMatrix.setInventorySlotContents(i, newStack2);

				}
				if (stack.getItem() != null
						&& stack.getItem() == Cookies.cookieItems
								.get(CutterStar.class)) {

					ItemStack newStack2 = new ItemStack(
							Cookies.cookieItems.get(CutterStar.class), 2);

					craftMatrix.setInventorySlotContents(i, newStack2);

				}
				if (stack.getItem() != null
						&& stack.getItem() == Cookies.cookieItems
								.get(CutterGBMan.class)) {

					ItemStack newStack2 = new ItemStack(
							Cookies.cookieItems.get(CutterGBMan.class), 2);

					craftMatrix.setInventorySlotContents(i, newStack2);

				}
				if (stack.getItem() != null
						&& stack.getItem() == Cookies.cookieItems
								.get(CutterXmasTree.class)) {

					ItemStack newStack2 = new ItemStack(
							Cookies.cookieItems.get(CutterXmasTree.class), 2);

					craftMatrix.setInventorySlotContents(i, newStack2);

				}

			}

		}

	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub

	}

}
