package qdc.cookies.giftbox;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class GiftBoxContainer extends Container{

	private GiftBoxEntity giftBoxEntity;
	
	
	public void detectAndSendChanges(){
		
		super.detectAndSendChanges();
	}
	
	
	public GiftBoxContainer(InventoryPlayer inventory, GiftBoxEntity entity) {
		this.giftBoxEntity = entity;
		
		
		this.addSlotToContainer(new Slot( entity, 0,56,17));
		this.addSlotToContainer(new Slot(entity, 1,56,53));


	for(int i = 0; i < 3; i++){
		for (int j = 0; j<9; j++){
			this.addSlotToContainer(new Slot(inventory, j+ i*9 + 9, 8 + j * 18,84 + i * 18));
		}
		
	}
		
	for(int i =0; i<9; i++){
		this.addSlotToContainer(new Slot(inventory, i, 8+i*18,142));
	}
	
   
   
    inventory.openChest();
	
	}


	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return this.giftBoxEntity.isUsableByPlayer(entityplayer);
	}
	
	

}
