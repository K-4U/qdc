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

		this.addSlotToContainer(new CookieSlot(entity, 0, 62, 19));
		this.addSlotToContainer(new CookieSlot(entity, 1, 95, 19));
		this.addSlotToContainer(new CookieSlot(entity, 2, 62, 52));
		this.addSlotToContainer(new CookieSlot(entity, 3, 95, 52));

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
	
	@Override
	public boolean func_94530_a(ItemStack par1ItemStack, Slot par2Slot) {
		return super.func_94530_a(par1ItemStack, par2Slot);
	}
	
	@Override
	public ItemStack slotClick(int par1, int par2, int par3,
			EntityPlayer par4EntityPlayer) {
		return super.slotClick(par1, par2, par3, par4EntityPlayer);
	}
	
	//copied method to deal with shift click, does not work but does prevent crash
	@Override

	    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	    {
	        ItemStack itemstack = null;
	        Slot slot = (Slot)this.inventorySlots.get(par2);

	        if (slot != null && slot.getHasStack())
	        {
	            ItemStack itemstack1 = slot.getStack();
	            itemstack = itemstack1.copy();

	            if (par2 < this.giftBoxEntity.getSizeInventory())
	            {
	                if (!this.mergeItemStack(itemstack1, this.giftBoxEntity.getSizeInventory(), this.inventorySlots.size(), true))
	                {
	                    return null;
	                }
	            }
	            else if (!this.mergeItemStack(itemstack1, 0, this.giftBoxEntity.getSizeInventory(), false))
	            {
	                return null;
	            }

	            if (itemstack1.stackSize == 0)
	            {
	                slot.putStack((ItemStack)null);
	            }
	            else
	            {
	                slot.onSlotChanged();
	            }
	        }

	        return itemstack;
	    }

}
