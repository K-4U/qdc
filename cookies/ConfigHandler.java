package qdc.cookies;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();

Ids.tutBlock_actual = config.getBlock(Names.tutBlock_name, Ids.tutBlock_default).getInt();

Ids.tutItem_actual = config.getItem(Names.tutItem_name, Ids.tutItem_default).getInt() - 256;
Ids.tutTool_actual = config.getItem(Names.tutTool_name, Ids.tutTool_default).getInt() - 256;

config.save();
}