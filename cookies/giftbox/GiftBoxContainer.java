package qdc.cookies.giftbox;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class GiftBoxContainer extends Container{

	private GiftBoxEntity giftBoxEntity;
	
	

	
	
	public GiftBoxContainer(InventoryPlayer inventory, GiftBoxEntity entity) {
		this.giftBoxEntity = entity;
	}


	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return this.giftBoxEntity.isUsableByPlayer(entityplayer);
	}
	
	

}
