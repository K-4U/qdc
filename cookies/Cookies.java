package qdc.cookies;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import qdc.cookies.consts.CookieIDs;
import qdc.cookies.giftbox.GiftBoxBlock;
import qdc.cookies.giftbox.GiftBoxEntity;
import qdc.cookies.giftbox.GiftBoxRenderer;
import qdc.cookies.items.ChocChip;
import qdc.cookies.items.ChocolatePowder;
import qdc.cookies.items.CookieDough;
import qdc.cookies.items.GiftboxPlain;
import qdc.cookies.items.GingerPowder;
import qdc.cookies.items.ItemSeedFoodGinger;
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
import qdc.cookies.trees.OrangeLeaves;
import qdc.cookies.trees.OrangeLog;
import qdc.cookies.trees.OrangeSappling;
import qdc.cookies.worldgen.OrangeTreeWorldGeneration;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Cookies.modid, name = "Cookies!", version = "Aplha 0.0.10 ")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
/**
 * 
 * 
 * @author KentBen
 * 
 * @author Ralle030583 - Refactor Work
 */
public class Cookies {

	public static final String modid = "cookies";

	@Instance(value = "cookies")
	public static Cookies instance;

	@SidedProxy(clientSide = "qdc.cookies.client.ClientProxy", serverSide = "qdc.cookies.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs cookieTab;

	public static CookieWorldGen worldGen = new CookieWorldGen();
	public static OrangeTreeWorldGeneration orangeWorldGen = new OrangeTreeWorldGeneration(false);

	/**
	 * Map with all Registered items.
	 */
	public static HashMap<Class, Item> cookieItems = new HashMap<Class, Item>();
	
	public static Item sugarPowder;
	public static Item gingerPowder;

	public static Block gingerBlock;
	public static Item ginger;

	public static Block giftBox;
	public static Item giftboxPlain;
	public static Item yellowRibbon;
	
	public static GBManCookie gbManCookie = new GBManCookie(27000,8);

	public static final int guiGiftBox = 0;

	public static Block orangeLeaves;
	public static Block orangeLog;
	public static Block orangeSappling;
	
	
	@EventHandler
	public static void preInit ( FMLPreInitializationEvent event ) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent e) {
		
		// Creative Tab
		String tabName = "cookietab";
		
		cookieTab = new CreativeTabs(tabName) {
			@Override
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex() {
				return gbManCookie.itemID;
			}
		};
		gbManCookie.setCreativeTab(Cookies.cookieTab); // GbMan addind afterwards to tab.. yeah cause its the icon xD
		
		proxy.registerCreativeTabName();
		//LanguageRegistry.instance().addStringLocalization(
		//		cookieTab.getTranslatedTabLabel(), "Cookies!");

		// register damage handler
		GameRegistry.registerCraftingHandler(new CookieCraftingHandler());

		// Register Worldgen
		GameRegistry.registerWorldGenerator(worldGen);
		GameRegistry.registerWorldGenerator(orangeWorldGen);

		// Register Guis?
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());

		
		
		// Registering Items
		this.registerItems();

		// Registering Tiles
		this.registerTiles();

		// Register all Receipes
		this.registerReceipes();

	}


		
	

	private void registerItems() {
		
		//Giftbox Accessories
		
		yellowRibbon = new RibbonYellow(CookieIDs.ribbonYellow_actual).setUnlocalizedName("cookies:ribbon_yellow");
		this.registerItem(yellowRibbon, "Yellow Ribbon");
		giftboxPlain  = new GiftboxPlain(CookieIDs.giftboxPlain_actual).setUnlocalizedName("cookies:plain_box");
		this.registerItem(giftboxPlain, "Plain Box");
		


		// Register Ginger Plant
		gingerBlock = new GingerBlock(CookieIDs.gingerBlock_actual).setUnlocalizedName("gingerPlant");
		this.registerBlock(gingerBlock, "Ginger Plant");
		ginger = new ItemSeedFoodGinger(CookieIDs.ginger_actual, 4, 0.3F, CookieIDs.gingerBlock_actual,
				Block.tilledField.blockID).setUnlocalizedName("cookies:ginger")
				.setCreativeTab(Cookies.cookieTab);
		this.registerItem(ginger, "Ginger");
		
		orangeLeaves = new OrangeLeaves(CookieIDs.orangeLeaves_actual, Material.leaves);
		registerBlock(orangeLeaves, "Orange Leaves");
		
		orangeLog = new OrangeLog(CookieIDs.orangeLog_actual, Material.wood);
		registerBlock(orangeLog, "Orange Wood");

		orangeSappling = new OrangeSappling(CookieIDs.orangeSappling_actual, 0);
		registerBlock(orangeSappling, "Orange Sappling");
		// Tools
		

		cookieItems.put(CutterRound.class, new CutterRound(CookieIDs.roundCutter_actual).register());
		cookieItems.put(CutterSquare.class, new CutterSquare(CookieIDs.squareCutter_actual).register());
		cookieItems.put(CutterStar.class, new CutterStar(CookieIDs.starCutter_actual).register());
		cookieItems.put(CutterGBMan.class, new CutterGBMan(CookieIDs.gbmanCutter_actual).register());
		cookieItems.put(CutterXmasTree.class, new CutterXmasTree(CookieIDs.treeCutter_actual).register());
			cookieItems.put(Grinder.class, new Grinder(CookieIDs.grinder_actual).register());	
		
		
		
		// Adding reagents
		cookieItems.put(CookieDough.class, new CookieDough(CookieIDs.cookieDough_actual).register());
		cookieItems.put(ChocChip.class, new ChocChip(CookieIDs.ChocChip_actual).register());
		cookieItems.put(ChocolatePowder.class,new ChocolatePowder(CookieIDs.ChocPowder_actual).register());
		
		
		
		// Sugar Powder
		sugarPowder = new SugarPowder(CookieIDs.sugarPowder_default)
				.setUnlocalizedName("cookies:sugar_powder");
		this.registerItem(sugarPowder, "Sugar Powder");

		// Ginger Powder
		gingerPowder = new GingerPowder(CookieIDs.gingerPowder_actual).setUnlocalizedName(
				"cookies:grated_ginger").setCreativeTab(Cookies.cookieTab);
		this.registerItem(gingerPowder, "Ginger Powder");
		
		
		
		// Adding Cookies!
		cookieItems.put(RoundChocChipCookie.class, new RoundChocChipCookie(CookieIDs.roundCC_actual,3).register());
		cookieItems.put(SquareChocChipCookie.class, new SquareChocChipCookie(CookieIDs.squareCC_actual,4).register());
		cookieItems.put(StarChocChipCookie.class, new StarChocChipCookie(CookieIDs.starCC_actual,5).register());
		cookieItems.put(RoundDoubleChocChipCookie.class, new RoundDoubleChocChipCookie(CookieIDs.roundDCC_actual,4).register());
		cookieItems.put(SquareDoubleChocChipCookie.class, new SquareDoubleChocChipCookie(CookieIDs.squareDCC_actual,6).register());
		cookieItems.put(StarDoubleChocChipCookie.class, new StarDoubleChocChipCookie(CookieIDs.starDCC_actual,8).register());
		cookieItems.put(SquareSugarCookie.class, new SquareSugarCookie(CookieIDs.squareSugar_actual,4).register());
		cookieItems.put(StarSugarCookie.class, new StarSugarCookie(CookieIDs.starSugar_actual,5).register());
		cookieItems.put(RoundSugarCookie.class, new RoundSugarCookie(CookieIDs.roundSugar_actual,3).register());
		cookieItems.put(RoundPlainCookie.class, new RoundPlainCookie(CookieIDs.roundPlain_actual,2).register());
		cookieItems.put(SquarePlainCookie.class, new SquarePlainCookie(CookieIDs.squarePlain_actual,3).register());
		cookieItems.put(StarPlainCookie.class, new StarPlainCookie(CookieIDs.starPlain_actual,4).register());
		cookieItems.put(ChristmasTreeCookie.class, new ChristmasTreeCookie(CookieIDs.treeCookie_actual,20).register());
		cookieItems.put(GBManCookie.class, gbManCookie.register());
		
		
		

	}

	private void registerTiles() {
		// Tile Entities

		 proxy.registerRenderers();

		GameRegistry.registerTileEntity(GiftBoxEntity.class, "giftbox");

		
		//ClientRegistry.bindTileEntitySpecialRenderer(GiftBoxEntity.class,
		//		new GiftBoxRenderer());

		giftBox = new GiftBoxBlock(1400, Material.wood);
		this.registerBlock(giftBox, "Gift Box");
	}

	private void registerReceipes() {
		// Ground Items
		ItemStack tempGrinder = new ItemStack(Cookies.cookieItems.get(Grinder.class), 1,
				OreDictionary.WILDCARD_VALUE);

		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.gingerPowder, 2),
				tempGrinder, Cookies.ginger);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.sugarPowder, 2),
				tempGrinder, Item.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(cookieItems.get(ChocolatePowder.class), 2),
				tempGrinder, cookieItems.get(ChocChip.class));

		// cookie dough
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.cookieItems.get(CookieDough.class), 2),
				Item.wheat, Item.sugar, Item.bucketMilk);

		// Cookies
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.cookieItems.get(ChocChip.class), 2), // TODO
				tempGrinder, new ItemStack(Item.dyePowder, 1, 3));

		//GiftBox
		GameRegistry.addRecipe(new ItemStack(Cookies.yellowRibbon),"s  "," sy"," ys",'s',Item.silk,'y',new ItemStack(Item.dyePowder, 1, 11));
		GameRegistry.addRecipe(new ItemStack(Cookies.giftboxPlain), "ppp","p p","ppp",'p',Item.paper);
		GameRegistry.addShapelessRecipe(new ItemStack(Cookies.giftBox), Cookies.giftboxPlain,Cookies.yellowRibbon);
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
