package qdc.cookies;

import java.io.File;

import net.minecraftforge.common.Configuration;
import qdc.cookies.consts.CookieIDs;
import qdc.cookies.plants.GingerBlock;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load(); 
		CookieIDs.gingerBlock_actual = config.getBlock(GingerBlock.class.getSimpleName(), CookieIDs.gingerBlock_default).getInt();
		// CookieIDs.tutItem_actual = config.getItem(Names.tutItem_name,
		// CookieIDs.tutItem_default).getInt() - 256;
		// CookieIDs.tutTool_actual = config.getItem(Names.tutTool_name,
		// CookieIDs.tutTool_default).getInt() - 256;
		config.save();
	}
}