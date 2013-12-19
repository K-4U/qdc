package qdc.cookies;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import qdc.cookies.giftbox.GiftBoxEntity;
import qdc.cookies.giftbox.GiftBoxBlock;
import qdc.cookies.giftbox.GiftBoxRenderer;
import qdc.cookies.items.*;
import qdc.cookies.plants.GingerBlock;

@Mod(modid = Cookies.modid, name = "Cookies!", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class Cookies {

	public static final String modid = "cookies";

	@Instance(value = "cookies")
	public static Cookies instance;

	@SidedProxy(clientSide = "qdc.cookies.client.ClientProxy", serverSide = "qdc.cookies.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs cookieTab;

	public static CookieWorldGen worldGen = new CookieWorldGen();

	public static Item gbMan;
	public static Item roundChocChip;
	public static Item squareChocChip;
	public static Item starChocChip;
	public static Item roundDoubleChocChip;
	public static Item squareDoubleChocChip;
	public static Item starDoubleChocChip;
	public static Item roundSugarCookie;
	public static Item squareSugarCookie;
	public static Item starSugarCookie;
	public static Item roundPlainCookie;
	public static Item squarePlainCookie;
	public static Item starPlainCookie;
	public static Item christmasCookie;

	public static Item cutterCircle;
	public static Item cutterSquare;
	public static Item cutterStar;
	public static Item cutterGBMan;
	public static Item cutterXmas;

	public static Item grinder;

	public static Item cookieDough;
	public static Item sugarPowder;
	public static Item chocPowder;
	public static Item gingerPowder;
	public static Item chocChips;

	public static Block gingerBlock;
	public static Item ginger;

	public static Block giftBox;

	public static final int guiGiftBox = 0;

	@EventHandler
	public void load(FMLInitializationEvent e) {

		// Creative Tab
		String tabName = "cookietab";
		cookieTab = new CreativeTabs(tabName) {
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex() {
				return Cookies.gbMan.itemID;
			}
		};
		LanguageRegistry.instance().addStringLocalization(
				cookieTab.getTranslatedTabLabel(), "All the Cookies!");

		// register damage handler
		GameRegistry.registerCraftingHandler(new CookieCraftingHandler());

		// Register Worldgen
		GameRegistry.registerWorldGenerator(worldGen);

		// Register Guis?
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());

		// Register Cookies
		registerCookies();

		// Registering Items
		registerItems();

		// Registering Tiles
		registerTiles();

		// Register all Receipes
		registerReceipes();

	}

	private void registerItems() {
		roundChocChip = new CookieGeneric(1001, 6, 0.5F, false, "choc_chip_cookie");
		registerItem(roundChocChip, "Chocolate Chip Cookie");

		squareChocChip = new CookieGeneric(1002, 6, 0.5F, false, "choc_chip_cookie_square");
		registerItem(squareChocChip, "Chocolate Chip Square Cookie");

		starChocChip = new CookieGeneric(1003, 6, 0.5F, false, "choc_chip_cookie_star");
		registerItem(starChocChip, "Chocolate Chip Star Cookie");
		
		roundDoubleChocChip = new CookieGeneric(1011, 6, 0.5F, false, "double_choc_chip_cookie");
		registerItem(roundDoubleChocChip, "Double Chocolate Chip Cookie");
		squareDoubleChocChip = new CookieGeneric(1012, 6, 0.5F, false, "double_choc_chip_cookie_square");
		registerItem(squareDoubleChocChip, "Double Chocolate Chip Square Cookie");
		starDoubleChocChip = new CookieGeneric(1013, 6, 0.5F, false, "double_choc_chip_cookie_star");
		registerItem(starDoubleChocChip, "Double Chocolate Chip Star Cookie");
		roundSugarCookie = new CookieGeneric(1024, 6, 0.5F, false, "sugar_cookie");
		registerItem(roundSugarCookie, "Sugar Cookie");
		squareSugarCookie = new CookieGeneric(1022, 6, 0.5F, false, "sugar_cookie_square");
		registerItem(squareSugarCookie, "Square Sugar Cookie");
		starSugarCookie = new CookieGeneric(1023, 6, 0.5F, false, "sugar_cookie_star");
		registerItem(starSugarCookie, "Star Sugar Cookie");
		roundPlainCookie = new CookieGeneric(1031, 6, 0.5F, false, "plain_cookie");
		registerItem(roundPlainCookie, "Plain Cookie");
		squarePlainCookie = new CookieGeneric(1032, 6, 0.5F, false, "plain_cookie_square");
		registerItem(squarePlainCookie, "Square Cookie");
		starPlainCookie = new CookieGeneric(1033, 6, 0.5F, false, "plain_cookie_star");
		registerItem(starPlainCookie, "Star Cookie");
		gbMan = new CookieGeneric(1041, 12, 0.5F, false, "GBMan");
		registerItem(gbMan, "Gingerbread Man");
		christmasCookie = new CookieGeneric(1042, 12, 0.5F, false, "stream_xmas_tree");
		registerItem(christmasCookie, "Stream Christmas Cookie");

		// cookie dough
		cookieDough = new CookieDough(1101).setUnlocalizedName("cookies:cookie_dough");
		registerItem(cookieDough, "Cookie Dough");

		// Sugar Powder
		sugarPowder = new SugarPowder(1102)
				.setUnlocalizedName("cookies:sugar_powder");
		registerItem(sugarPowder, "Sugar Powder");

		// choc Powder
		chocPowder = new ChocolatePowder(1103).setUnlocalizedName(
				"cookies:chocolate_powder").setCreativeTab(Cookies.cookieTab);
		registerItem(chocPowder, "Chocolate Powder");

		// Ginger Powder
		gingerPowder = new GingerPowder(1104).setUnlocalizedName(
				"cookies:grated_ginger").setCreativeTab(Cookies.cookieTab);
		registerItem(gingerPowder, "Ginger Powder");

		// choc chips
		chocChips = new ChocChip(1105).setUnlocalizedName("cookies:choc_chips")
				.setCreativeTab(Cookies.cookieTab);
		registerItem(chocChips, "Chocolate Chips");

		// Register Ginger Plant
		gingerBlock = new GingerBlock(1201).setUnlocalizedName("Ginger");
		registerBlock(gingerBlock, "Ginger");
		ginger = new ItemSeedFoodGinger(1202, 4, 0.3F, gingerBlock.blockID,
				Block.tilledField.blockID).setUnlocalizedName("cookies:ginger")
				.setCreativeTab(Cookies.cookieTab);
		registerItem(ginger, "Ginger");

		// Cutters
		cutterCircle = new CutterGeneric(1301, "cookie_cutter_circle");
		cutterSquare = new CutterGeneric(1302, "cookie_cutter_square");
		cutterStar   = new CutterGeneric(1304, "cookie_cutter_star");
		cutterGBMan  = new CutterGeneric(1305, "cookie_cutter_gingerbread_man");
		cutterXmas   = new CutterGeneric(1306, "xmas_tree_cutter");
		
		registerItem(cutterCircle, "Round Cookie Cutter");
		registerItem(cutterSquare, "Square Cookie Cutter");
		registerItem(cutterStar, "Star Cookie Cutter");
		registerItem(cutterGBMan, "Gingerbread Man Cutter");
		registerItem(cutterXmas, "Christmas Tree Cutter");

		// Grinder
		grinder = new Grinder(1320).setUnlocalizedName("cookies:hand_grinder");
		registerItem(grinder, "Hand Grinder");
	}

	private void registerTiles() {
		// Tile Entities

		// proxy.registerRenderers();

		GameRegistry.registerTileEntity(GiftBoxEntity.class, "giftbox");

		ClientRegistry.bindTileEntitySpecialRenderer(GiftBoxEntity.class,
				new GiftBoxRenderer());

		giftBox = new GiftBoxBlock(1400, Material.wood);
		registerBlock(giftBox, "Gift Box");
	}

	private void registerReceipes() {
		// Ground Items
		ItemStack tempGrinder = new ItemStack(Cookies.grinder, 1,
				OreDictionary.WILDCARD_VALUE);

		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.gingerPowder, 2),
				tempGrinder, Cookies.ginger);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.sugarPowder, 2),
				tempGrinder, Item.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.chocPowder, 2),
				tempGrinder, Cookies.chocChips);

		// cookie dough
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.cookieDough, 2),
				Item.wheat, Item.sugar, Item.bucketMilk);

		// Tools
		GameRegistry.addRecipe(new ItemStack(Cookies.cutterCircle), " x ",
				"xyx", " x ", 'x', Item.ingotIron, 'y', Block.wood);
		GameRegistry.addRecipe(new ItemStack(Cookies.cutterSquare), " x ",
				"xyx", " x ", 'x', Item.ingotGold, 'y', Block.wood);
		GameRegistry.addRecipe(new ItemStack(Cookies.cutterStar), " x ", "xyx",
				" x ", 'x', Item.diamond, 'y', Block.wood);
		GameRegistry.addRecipe(new ItemStack(Cookies.cutterGBMan), " x ",
				"xyx", " x ", 'x', Item.emerald, 'y', Block.wood);
		GameRegistry.addRecipe(new ItemStack(Cookies.cutterXmas), " x ", "xyx",
				" x ", 'x', new ItemStack(Item.dyePowder, 1, 4), 'y',
				Block.wood);

		GameRegistry.addRecipe(new ItemStack(Cookies.grinder), " s ", "wcw",
				"ooo", 'w', Block.wood, 'c', Cookies.cutterCircle, 'o',
				Block.cobblestone, 's', Item.stick);
		GameRegistry.addRecipe(new ItemStack(Cookies.christmasCookie), " g ",
				"ybr", "dsc", 'g', new ItemStack(Item.dyePowder, 1, 2), 'y',
				new ItemStack(Item.dyePowder, 1, 11), 'b', new ItemStack(
						Item.dyePowder, 1, 4), 'r', new ItemStack(
						Item.dyePowder, 1, 1), 'c', Cookies.cutterXmas, 'd',
				Cookies.cookieDough, 's', Cookies.sugarPowder);

		// Cookies
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.chocChips, 2),
				tempGrinder, new ItemStack(Item.dyePowder, 1, 3));
		GameRegistry.addShapelessRecipe(
				new ItemStack(Cookies.roundPlainCookie), Cookies.cookieDough,
				Cookies.cutterCircle);
		GameRegistry.addShapelessRecipe(
				new ItemStack(Cookies.squarePlainCookie), Cookies.cookieDough,
				Cookies.cutterSquare);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.starPlainCookie),
				Cookies.cookieDough, Cookies.cutterStar);

		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.roundChocChip),
				Cookies.cookieDough, Cookies.cutterCircle, Cookies.chocChips);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.squareChocChip),
				Cookies.cookieDough, Cookies.cutterSquare, Cookies.chocChips);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.starChocChip),
				Cookies.cookieDough, Cookies.cutterStar, Cookies.chocChips);

		GameRegistry.addShapelessRecipe(new ItemStack(
				Cookies.roundDoubleChocChip), Cookies.cookieDough,
				Cookies.cutterCircle, Cookies.chocChips, Cookies.chocPowder);
		GameRegistry.addShapelessRecipe(new ItemStack(
				Cookies.squareDoubleChocChip), Cookies.cookieDough,
				Cookies.cutterSquare, Cookies.chocChips, Cookies.chocPowder);
		GameRegistry.addShapelessRecipe(new ItemStack(
				Cookies.starDoubleChocChip), Cookies.cookieDough,
				Cookies.cutterStar, Cookies.chocChips, Cookies.chocPowder);

		GameRegistry.addShapelessRecipe(
				new ItemStack(Cookies.roundSugarCookie), Cookies.cookieDough,
				Cookies.cutterCircle, Cookies.sugarPowder);
		GameRegistry.addShapelessRecipe(
				new ItemStack(Cookies.squareSugarCookie), Cookies.cookieDough,
				Cookies.cutterSquare, Cookies.sugarPowder);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.starSugarCookie),
				Cookies.cookieDough, Cookies.cutterStar, Cookies.sugarPowder);

		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.gbMan),
				Cookies.cookieDough, Cookies.cutterGBMan, Cookies.gingerPowder);
	}

	private void registerCookies() {

	}

	public void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName());
		LanguageRegistry.addName(block, name);

	}

	public void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		LanguageRegistry.addName(item, name);

	}

}
