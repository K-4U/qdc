package qdc.cookies.giftbox;

import cpw.mods.fml.common.Mod.Item;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import qdc.cookies.Cookies;
import qdc.cookies.items.CookieGeneric;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
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
		this.blockIcon = icon.registerIcon("cookies:gift_box");
	}
	
	
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
            TileEntity tile = world.getBlockTileEntity(x, y, z);

            if (!(tile instanceof GiftBoxEntity))
                    return false;

            //ItemStack current = player.getCurrentEquippedItem();
           // Item equipped = (Item) (current != null ? current.getItem() : null);


           // if (current != null && (equipped instanceof CookieGeneric)) {
                //    if (!world.isRemote) {
               //             if (FluidUtils.handleRightClick((TileRefinery) tile, ForgeDirection.getOrientation(side), player, true, false))
              //                      return true;
             //       } else if (FluidContainerRegistry.isContainer(current)) {
            //                return true;
           //         }
          //  }

            if (!world.isRemote) {
            	//GiftBoxGUI myGui = new GiftBoxGUI(player.inventory, null);
                  // player.openGui(Cookies.instance, myGui. , world, x, y, z);
           //FMLNetworkHandler.openGui(player, Cookies.instance, Cookies.guiGiftBox, world, x, y, z);
            	  FMLNetworkHandler.openGui(player, Cookies.instance, 0, world, x, y, z);
            }

            return true;
    }
	
	
	//public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityLiving){
		
//		int rotation = MathHelper.floor_double((double)((entityLiving.rotationYaw * 4F)/360F)+2.5D)&3;
	//}
}
