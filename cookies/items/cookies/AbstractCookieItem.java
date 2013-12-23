package qdc.cookies.items.cookies;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieGeneric;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Abstraction of an Cookie.
 * @author orginal source {@link CookieGeneric}  KentBen 
 * @author refactor: Ralle030583
 */
public abstract class AbstractCookieItem extends ItemFood {

	/** 
	 * Constructor. 
	 * @param itemId
	 * @param hunger
	 * @param saturationModifier
	 */
	public AbstractCookieItem(int itemId, int hunger, float saturationModifier) {
		super(itemId, hunger, saturationModifier, false);
		this.initDefaultCookieValues();
	}

	/** 
	 * Constructor with ItemId & Hunger and Default Saturation. 
	 * @param itemId
	 * @param hunger
	 */
	public AbstractCookieItem(int itemId, int hunger) {
		this(itemId, hunger, 0.5F);
	}
	
	/**
	 * Constructor for a Default Cookie
	 * @param itemId
	 * @param healAmount
	 */
	public AbstractCookieItem(int itemId) {
		this(itemId, 6, 0.5F);
	}

	/**
	 * Init. of Default Values for all Cookies
	 */
	private void initDefaultCookieValues() {
		this.setAlwaysEdible();
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setCreativeTab(Cookies.cookieTab);
		this.setUnlocalizedName("cookies:" + this.getCookieName());
		this.applyEffects();
	}
	
	/**
	 * Item/Texture Name.
	 * @return
	 */
	protected abstract String getCookieName();
	
	/**
	 * Default Name shown ingame.
	 * @return a name.. what else 
	 */
	protected abstract String getIngameName();

	/**
	 * Apply Potion effects to the Cookie here.
	 */
	protected void applyEffects(){
		// No effect on Default Cookies.
	};

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		this.itemIcon = iconregister.registerIcon("cookies:" + this.getCookieName());
	}
	
	/**
	 * Register yourself lazy cookie!
	 * @return this
	 */
	public AbstractCookieItem register(){
		GameRegistry.registerItem(this, this.getUnlocalizedName());
		LanguageRegistry.addName(this, this.getIngameName());
		this.registerReceipes();
		return this;
	}
	
	/**
	 * Register the Receipes. 
	 */
	protected abstract void registerReceipes();
}
