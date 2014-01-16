package qdc.cookies.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import qdc.cookies.CommonProxy;
import qdc.cookies.Cookies;
import qdc.cookies.giftbox.GiftBoxEntity;
import qdc.cookies.giftbox.GiftBoxRenderer;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderers(){
		ClientRegistry.bindTileEntitySpecialRenderer(GiftBoxEntity.class, new GiftBoxRenderer());

	}
	
	public void registerRenderThings(){
		
		//ClientRegistry.bindTileEntitySpecialRenderer(GiftBoxEntity.class, new GiftBoxRenderer());
	}
	
	public void registerCreativeTabName(){
		LanguageRegistry.instance().addStringLocalization(
				Cookies.cookieTab.getTranslatedTabLabel(), "Cookies!");
	}
	
}
