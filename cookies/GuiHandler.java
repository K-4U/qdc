package qdc.cookies;


import qdc.cookies.giftbox.GiftBoxContainer;
import qdc.cookies.giftbox.GiftBoxEntity;
import qdc.cookies.giftbox.GiftBoxGUI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {

	//public GuiHandler(){
	//NetworkRegistry.instance().registerGuiHandler(KbBase.instance,this);
	
	//}


	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		if (entity != null){
			
			switch (ID){
			
			case Cookies.guiGiftBox:
				
				if(entity instanceof GiftBoxEntity){
					return new GiftBoxContainer(player.inventory, (GiftBoxEntity) entity);
					
				}
				
	
				
				
				
			}
		}
			
		return null;
	}

	
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		if (entity != null){
			
			switch (ID){
			
			case Cookies.guiGiftBox:
				
				if(entity instanceof GiftBoxEntity){
					return new GiftBoxGUI(player.inventory, (GiftBoxEntity) entity);
					
				}

				
				
			}
		}
				
				
				
		
		return null;
	}

}
