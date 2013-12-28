package qdc.cookies.giftbox;


import java.util.ArrayList;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GiftBoxBlock extends BlockContainer {

	GiftBoxEntity tempTile;

	public GiftBoxBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setCreativeTab(Cookies.cookieTab);
		
		this.setBlockBounds(0.15F, 0.0F, 0.15F, 0.75F, 0.48F, 0.75F);
		
		
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
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		this.blockIcon = icon.registerIcon("cookies:gift_box");
	}
	
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
            TileEntity tile = world.getBlockTileEntity(x, y, z);

            if (!(tile instanceof GiftBoxEntity)) {
				return false;
			}


            if (!world.isRemote) {

            	  FMLNetworkHandler.openGui(player, Cookies.instance, 0, world, x, y, z);
            }

            return true;
    }
	@Override
	
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
		tempTile = (GiftBoxEntity) par1World.getBlockTileEntity(par2, par3, par4);
		int a = 1;
        if (hasTileEntity(par6) && !(this instanceof BlockContainer))
        {
            par1World.removeBlockTileEntity(par2, par3, par4);
        }
    }
	
 
	

	
	
	
	@Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
		//create new giftbox to be dropped
		ItemStack temp = new ItemStack(Cookies.giftBox,1);
		
		
		//retrive the entity
        GiftBoxEntity tile = (GiftBoxEntity) world.getBlockTileEntity(x, y, z);

		//need to pull nbtdata from existing tile and write to item nbt
        NBTTagCompound par1NBTTagCompound = new NBTTagCompound();
        
        
        
        
        //get and set nbt data?
       
        tempTile.writeToNBT(par1NBTTagCompound);
        temp.readFromNBT(par1NBTTagCompound);
        //   temp.setTagCompound(par1NBTTagCompound);
        
        //returns the items to be dropped
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(temp);
        return ret;
		
		//ItemStack temp = new ItemStack(Cookies.giftBox,1);
//		int[] boxIds = { 1, 7, 2, 3 };
//		int[] boxQTY = { 1, 2, 3, 4 };
//		
//		temp.setTagCompound( new NBTTagCompound( ));
//		temp.stackTagCompound.setIntArray( "slotIds", boxIds );
//		temp.stackTagCompound.setIntArray( "slotContent", boxQTY );
//        
		
	    //ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		//ret.add(temp);
		//return ret;
    }
	
	
    @Override
    public void onBlockPlacedBy(World par1World, int x, int y, int z, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
    	//get tile at location
        GiftBoxEntity tile = (GiftBoxEntity) par1World.getBlockTileEntity(x, y, z);
        //set item nbt data
        if (par6ItemStack.getTagCompound() != null){
        	tile.readFromNBT(par6ItemStack.getTagCompound());
        }
        
        
    
    }

}

