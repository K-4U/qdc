package qdc.cookies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import qdc.cookies.items.tools.Grinder;
import cpw.mods.fml.common.ICraftingHandler;

public class CookieCraftingHandler implements ICraftingHandler {

		@Override
		public void onCrafting(EntityPlayer player, ItemStack item,
				IInventory craftMatrix) {
			
			for(int i = 0; i < craftMatrix.getSizeInventory(); i++){
				
				if(craftMatrix.getStackInSlot(i) != null){
					ItemStack stack = craftMatrix.getStackInSlot(i);
					
					if(stack.getItem() != null && stack.getItem() == Cookies.cookieItems.get(Grinder.class)){
				
							ItemStack newStack = new ItemStack(Cookies.cookieItems.get(Grinder.class), 2,(stack.getItemDamage()+1));
							if(newStack.getItemDamage() >= newStack.getMaxDamage()){
								newStack.stackSize--;
							}
							
							craftMatrix.setInventorySlotContents(i, newStack);
							
							
						}
				
				
				if(stack.getItem() != null && stack.getItem() == Cookies.cutterCircle){
					
					ItemStack newStack2 = new ItemStack(Cookies.cutterCircle,2);
					
					craftMatrix.setInventorySlotContents(i, newStack2);
					
					
				}
					if(stack.getItem() != null && stack.getItem() == Cookies.cutterSquare){
										
										ItemStack newStack2 = new ItemStack(Cookies.cutterSquare,2);
										
										craftMatrix.setInventorySlotContents(i, newStack2);
										
										
									}
					if(stack.getItem() != null && stack.getItem() == Cookies.cutterStar){
						
						ItemStack newStack2 = new ItemStack(Cookies.cutterStar,2);
						
						craftMatrix.setInventorySlotContents(i, newStack2);
						
						
					}
					if(stack.getItem() != null && stack.getItem() == Cookies.cutterGBMan){
						
						ItemStack newStack2 = new ItemStack(Cookies.cutterGBMan,2);
						
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
