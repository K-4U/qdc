package qdc.cookies.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import qdc.cookies.CommonProxy;
import qdc.cookies.giftbox.GiftBoxEntity;
import qdc.cookies.giftbox.GiftBoxRenderer;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderers(){
		
	}
	
	public void registerRenderThings(){
		ClientRegistry.bindTileEntitySpecialRenderer(GiftBoxEntity.class, new GiftBoxRenderer());
	}
	
	
}
