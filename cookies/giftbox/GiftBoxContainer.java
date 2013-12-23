package qdc.cookies.giftbox;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GiftBoxContainer extends Container {

	private GiftBoxEntity giftBoxEntity;

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
	}

	public GiftBoxContainer(InventoryPlayer inventory, GiftBoxEntity entity) {
		this.giftBoxEntity = entity;

		this.addSlotToContainer(new Slot(entity, 0, 62, 19));
		this.addSlotToContainer(new Slot(entity, 1, 95, 19));
		this.addSlotToContainer(new Slot(entity, 2, 62, 52));
		this.addSlotToContainer(new Slot(entity, 3, 95, 52));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9,
						8 + j * 18, 84 + i * 18));
			}

		}

		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}

		inventory.openChest();

	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return this.giftBoxEntity.isUsableByPlayer(entityplayer);
	}
	
	
	//copied method to deal with shift click, does not work but does prevent crash
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
	  Slot slot = getSlot(i);

	  if(slot != null && slot.getHasStack()) {
	        ItemStack itemstack = slot.getStack();
	        ItemStack result = itemstack.copy();

	        if(i >= 36) {
	          if(!mergeItemStack(itemstack, 0, 36, false)) {
	                return null;
	          }
	        } else if(!mergeItemStack(itemstack, 36, 36 + giftBoxEntity.getSizeInventory(), false)) {
	          return null;
	        }

	        if(itemstack.stackSize == 0) {
	          slot.putStack(null);
	        } else {
	          slot.onSlotChanged();
	        }
	        slot.onPickupFromSlot(player, itemstack); 
	        return result;
	  }
	  return null;
	}

}
