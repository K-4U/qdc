package qdc.cookies.giftbox;


import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import qdc.cookies.Cookies;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GiftBoxBlock extends BlockContainer {

	
	
	
	public GiftBoxBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(Cookies.cookieTab);
		//this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 0.3F, 0.6F);
		this.setBlockBounds(0.15F, 0.0F, 0.15F, 0.75F, 0.48F, 0.75F);
		
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
	
	
	//public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityLiving){
		
//		int rotation = MathHelper.floor_double((double)((entityLiving.rotationYaw * 4F)/360F)+2.5D)&3;
	//}
}
