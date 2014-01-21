package qdc.cookies.trees;


import java.util.Random;

import qdc.cookies.Cookies;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class OrangeLeaves extends Block {

	public OrangeLeaves(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("OrangeLeaves");
		this.setCreativeTab(Cookies.cookieTab);
		this.setHardness(0.2F);
		this.setResistance(1.0F);
		this.setStepSound(soundGrassFootstep);
	}

	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public int idDropped(int par1, Random par2Random, int par3){
	return this.blockID;
	}
	public void registerIcons(IconRegister iconRegister){
		blockIcon = iconRegister.registerIcon("Cookies:orange_leaves");
	}
	
	
}
