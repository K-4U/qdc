package qdc.cookies.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import qdc.cookies.CommonProxy;
import qdc.cookies.GiftBoxEntity;
import qdc.cookies.GiftBoxRenderer;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderers(){
		
	}
	
	public void registerRenderThings(){
		ClientRegistry.bindTileEntitySpecialRenderer(GiftBoxEntity.class, new GiftBoxRenderer());
	}
	
	
}
