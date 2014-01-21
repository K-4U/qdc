package qdc.cookies.trees;

import java.util.List;
import java.util.Random;

import qdc.cookies.Cookies;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class OrangeLog extends Block {

	public static final String[] woodType = new String[] {"Orange"};
	private Icon iconLogTop;
	private Icon iconLogBottom;

	
	public OrangeLog(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("OrangeLog");
		this.setCreativeTab(Cookies.cookieTab);
		this.setHardness(5.0F);
		this.setResistance(1.0F);
		
	}
	
	public int onBlockPlaced(World par1world, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9){
		
		int jl = par9 & 3;
		byte b0 = 0;
		
		switch(par5){
		case 0:
		case 1:
			b0 = 0;
		break;
		case 2:
		case 3:
			b0 = 8;
		break;
		case 4:
		case 5:
			b0 = 4;
		}
		
		return jl | b0;
	}
	
public int idDropped(int par1, Random par2random, int par3){
	return this.blockID;
}

public Icon getIcon(int par1, int par2){
	return par1 == 1 ? this.iconLogTop : (par1 == 0 ? this.iconLogBottom : this.blockIcon);
}


public void registerIcons (IconRegister par1IconRegister){
	this.blockIcon = par1IconRegister.registerIcon("Cookies:orange_log");
	this.iconLogBottom = par1IconRegister.registerIcon(("Cookies:orange_log_top"));
	this.iconLogTop = par1IconRegister.registerIcon(("Cookies:orange_log_top"));

}


public boolean isWood(World world, int x, int y, int z){
	return true;
}

public boolean canSustainLeaves(World world, int x, int y, int z){
	return true;
}

public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List){
par3List.add((new ItemStack(par1, 1,0)));	
}







}