package qdc.cookies;

import java.io.File;

import net.minecraftforge.common.Configuration;
import qdc.cookies.consts.CookieIDs;
import qdc.cookies.giftbox.GiftBoxBlock;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.ChocolatePowder;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.GiftboxPlain;
import qdc.cookies.items.GingerPowder;
import qdc.cookies.items.RibbonYellow;
import qdc.cookies.items.SugarPowder;
import qdc.cookies.items.cookies.ChristmasTreeCookie;
import qdc.cookies.items.cookies.GBManCookie;
import qdc.cookies.items.cookies.RoundChocChipCookie;
import qdc.cookies.items.cookies.RoundDoubleChocChipCookie;
import qdc.cookies.items.cookies.RoundPlainCookie;
import qdc.cookies.items.cookies.RoundSugarCookie;
import qdc.cookies.items.cookies.SquareChocChipCookie;
import qdc.cookies.items.cookies.SquareDoubleChocChipCookie;
import qdc.cookies.items.cookies.SquarePlainCookie;
import qdc.cookies.items.cookies.SquareSugarCookie;
import qdc.cookies.items.cookies.StarChocChipCookie;
import qdc.cookies.items.cookies.StarDoubleChocChipCookie;
import qdc.cookies.items.cookies.StarPlainCookie;
import qdc.cookies.items.cookies.StarSugarCookie;
import qdc.cookies.items.tools.CutterGBMan;
import qdc.cookies.items.tools.CutterRound;
import qdc.cookies.items.tools.CutterSquare;
import qdc.cookies.items.tools.CutterStar;
import qdc.cookies.items.tools.CutterXmasTree;
import qdc.cookies.items.tools.Grinder;
import qdc.cookies.plants.GingerBlock;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load(); 
		CookieIDs.gingerBlock_actual = config.getBlock(GingerBlock.class.getSimpleName(), CookieIDs.gingerBlock_default).getInt();
		CookieIDs.ginger_actual = config.getItem(GingerBlock.class.getSimpleName(), CookieIDs.ginger_default).getInt();
		
		CookieIDs.gingerPowder_actual = config.getItem(GingerPowder.class.getSimpleName(), CookieIDs.gingerPowder_default).getInt();
		CookieIDs.ChocChip_actual = config.getItem(ChocChip.class.getSimpleName(), CookieIDs.ChocChip_default).getInt();
		
		CookieIDs.ChocPowder_actual = config.getItem(ChocolatePowder.class.getSimpleName(), CookieIDs.ChocPowder_default).getInt();
		CookieIDs.sugarPowder_actual = config.getItem(SugarPowder.class.getSimpleName(), CookieIDs.sugarPowder_default).getInt();
		
		CookieIDs.cookieDough_actual = config.getItem(CookieDough.class.getSimpleName(), CookieIDs.cookieDough_default).getInt();

		CookieIDs.giftboxPlain_actual = config.getItem(GiftboxPlain.class.getSimpleName(), CookieIDs.giftboxPlain_default).getInt();
		CookieIDs.ribbonYellow_actual = config.getItem(RibbonYellow.class.getSimpleName(), CookieIDs.ribbonYellow_default).getInt();
		CookieIDs.giftBox_actual = config.getItem(GiftBoxBlock.class.getSimpleName(), CookieIDs.giftBox_default).getInt();
		
		CookieIDs.grinder_actual = config.getItem(Grinder.class.getSimpleName(), CookieIDs.grinder_default).getInt();
		CookieIDs.roundCutter_actual = config.getItem(CutterRound.class.getSimpleName(), CookieIDs.roundCutter_default).getInt();
		CookieIDs.squareCutter_actual = config.getItem(CutterSquare.class.getSimpleName(), CookieIDs.squareCutter_default).getInt();
		CookieIDs.starCutter_actual = config.getItem(CutterStar.class.getSimpleName(), CookieIDs.starCutter_default).getInt();
		CookieIDs.gbmanCutter_actual = config.getItem(CutterGBMan.class.getSimpleName(), CookieIDs.gbmanCutter_default).getInt();
		CookieIDs.treeCutter_actual = config.getItem(CutterXmasTree.class.getSimpleName(), CookieIDs.treeCutter_default).getInt();

		
		CookieIDs.roundPlain_actual = config.getItem(RoundPlainCookie.class.getSimpleName(), CookieIDs.roundPlain_default).getInt();
		CookieIDs.squarePlain_actual = config.getItem(SquarePlainCookie.class.getSimpleName(), CookieIDs.squarePlain_default).getInt();
		CookieIDs.starPlain_actual = config.getItem(StarPlainCookie.class.getSimpleName(), CookieIDs.starPlain_default).getInt();

		CookieIDs.roundCC_actual = config.getItem(RoundChocChipCookie.class.getSimpleName(), CookieIDs.roundCC_default).getInt();
		CookieIDs.squareCC_actual = config.getItem(SquareChocChipCookie.class.getSimpleName(), CookieIDs.squareCC_default).getInt();
		CookieIDs.starCC_actual = config.getItem(StarChocChipCookie.class.getSimpleName(), CookieIDs.starCC_default).getInt();

		CookieIDs.roundDCC_actual = config.getItem(RoundDoubleChocChipCookie.class.getSimpleName(), CookieIDs.roundDCC_default).getInt();
		CookieIDs.squareDCC_actual = config.getItem(SquareDoubleChocChipCookie.class.getSimpleName(), CookieIDs.squareDCC_default).getInt();
		CookieIDs.starDCC_actual = config.getItem(StarDoubleChocChipCookie.class.getSimpleName(), CookieIDs.starDCC_default).getInt();

		CookieIDs.roundSugar_actual = config.getItem(RoundSugarCookie.class.getSimpleName(), CookieIDs.roundSugar_default).getInt();
		CookieIDs.squareSugar_actual = config.getItem(SquareSugarCookie.class.getSimpleName(), CookieIDs.squareSugar_default).getInt();
		CookieIDs.starSugar_actual = config.getItem(StarSugarCookie.class.getSimpleName(), CookieIDs.starSugar_default).getInt();

		CookieIDs.gbman_actual = config.getItem(GBManCookie.class.getSimpleName(), CookieIDs.gbman_default).getInt();
		CookieIDs.treeCookie_actual = config.getItem(ChristmasTreeCookie.class.getSimpleName(), CookieIDs.treeCookie_default).getInt();

		config.save();
		
	}
}