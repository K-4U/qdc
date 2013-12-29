package qdc.cookies;

import java.io.File;

import net.minecraftforge.common.Configuration;
import qdc.cookies.consts.CookieIDs;
import qdc.cookies.giftbox.GiftBoxBlock;
import qdc.cookies.items.*;
import qdc.cookies.items.cookies.*;
import qdc.cookies.items.tools.Grinder;
import qdc.cookies.plants.GingerBlock;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load(); 
		CookieIDs.gingerBlock_actual = config.getBlock(GingerBlock.class.getSimpleName(), CookieIDs.gingerBlock_default).getInt();
		 CookieIDs.ginger_actual = config.getBlock(XXX, CookieIDs.ginger_default).getInt();
		
		CookieIDs.gingerPowder_actual = config.getBlock(GingerPowder.class.getSimpleName(), CookieIDs.gingerPowder_default).getInt();
		CookieIDs.ChocChip_actual = config.getBlock(ChocChip.class.getSimpleName(), CookieIDs.ChocChip_default).getInt();
		
		CookieIDs.ChocPowder_actual = config.getBlock(ChocolatePowder.class.getSimpleName(), CookieIDs.ChocPowder_default).getInt();
		CookieIDs.sugarPowder_actual = config.getBlock(SugarPowder.class.getSimpleName(), CookieIDs.sugarPowder_default).getInt();
		
		CookieIDs.cookieDough_actual = config.getBlock(CookieDough.class.getSimpleName(), CookieIDs.cookieDough_default).getInt();

		CookieIDs.giftboxPlain_actual = config.getBlock(GiftboxPlain.class.getSimpleName(), CookieIDs.giftboxPlain_default).getInt();
		CookieIDs.ribbonYellow_actual = config.getBlock(RibbonYellow.class.getSimpleName(), CookieIDs.ribbonYellow_default).getInt();
		CookieIDs.giftBox_actual = config.getBlock(GiftBoxBlock.class.getSimpleName(), CookieIDs.giftBox_default).getInt();

		
		CookieIDs.grinder_actual = config.getBlock(Grinder.class.getSimpleName(), CookieIDs.grinder_default).getInt();
		CookieIDs.roundCutter_actual = config.getBlock(.class.getSimpleName(), CookieIDs.roundCutter_default).getInt();
		CookieIDs.squareCutter_actual = config.getBlock(.class.getSimpleName(), CookieIDs.squareCutter_default).getInt();
		CookieIDs.starCutter_actual = config.getBlock(.class.getSimpleName(), CookieIDs.starCutter_default).getInt();
		CookieIDs.gbmanCutter_actual = config.getBlock(.class.getSimpleName(), CookieIDs.gbmanCutter_default).getInt();
		CookieIDs.treeCutter_actual = config.getBlock(.class.getSimpleName(), CookieIDs.treeCutter_default).getInt();

		
		CookieIDs.roundPlain_actual = config.getBlock(RoundPlainCookie.class.getSimpleName(), CookieIDs.roundPlain_default).getInt();
		CookieIDs.squarePlain_actual = config.getBlock(SquarePlainCookie.class.getSimpleName(), CookieIDs.squarePlain_default).getInt();
		CookieIDs.starPlain_actual = config.getBlock(StarPlainCookie.class.getSimpleName(), CookieIDs.starPlain_default).getInt();

		CookieIDs.roundCC_actual = config.getBlock(RoundChocChipCookie.class.getSimpleName(), CookieIDs.roundCC_default).getInt();
		CookieIDs.squareCC_actual = config.getBlock(SquareChocChipCookie.class.getSimpleName(), CookieIDs.squareCC_default).getInt();
		CookieIDs.starCC_actual = config.getBlock(StarChocChipCookie.class.getSimpleName(), CookieIDs.starCC_default).getInt();

		CookieIDs.roundDCC_actual = config.getBlock(RoundDoubleChocChipCookie.class.getSimpleName(), CookieIDs.roundDCC_default).getInt();
		CookieIDs.squareDCC_actual = config.getBlock(SquareDoubleChocChipCookie.class.getSimpleName(), CookieIDs.squareDCC_default).getInt();
		CookieIDs.starDCC_actual = config.getBlock(StarDoubleChocChipCookie.class.getSimpleName(), CookieIDs.starDCC_default).getInt();

		CookieIDs.roundSugar_actual = config.getBlock(RoundSugarCookie.class.getSimpleName(), CookieIDs.roundSugar_default).getInt();
		CookieIDs.squareSugar_actual = config.getBlock(SquareSugarCookie.class.getSimpleName(), CookieIDs.squareSugar_default).getInt();
		CookieIDs.starSugar_actual = config.getBlock(StarSugarCookie.class.getSimpleName(), CookieIDs.starSugar_default).getInt();

		CookieIDs.gbman_actual = config.getBlock(GBManCookie.class.getSimpleName(), CookieIDs.gbman_default).getInt();
		CookieIDs.treeCookie_actual = config.getBlock(ChristmasTreeCookie.class.getSimpleName(), CookieIDs.treeCookie_default).getInt();

		
		
		config.save();
		


	}
}