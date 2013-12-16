package qdc.cookies.giftbox;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import qdc.cookies.Cookies;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class GiftBoxBlock extends BlockContainer {

	public GiftBoxBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(Cookies.cookieTab);
		//this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 0.3F, 0.6F);
		//this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.5F, 0.8F);
		
		
		
		
		//setTextureName("Cookies:giftbox");
		//setHardness(2.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return new GiftBoxEntity();
	}

	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		this.blockIcon = icon.registerIcon("cookies:gift_Box");
	}
	
	//public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityLiving){
		
//		int rotation = MathHelper.floor_double((double)((entityLiving.rotationYaw * 4F)/360F)+2.5D)&3;
	//}
}
