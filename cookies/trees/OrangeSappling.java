package qdc.cookies.trees;

import java.util.Random;

import qdc.cookies.Cookies;
import qdc.cookies.worldgen.OrangeTreeWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.TerrainGen;

public class OrangeSappling extends BlockFlower {

	
	public static final String[] WOOD_TYPES = new String[] {"Orange"};
	
	public OrangeSappling(int par1, int par2Material) {
		super(par1);
		float var3 = 0.4F;
		this.setBlockBounds(0.5F - var3, 0.5F, 0.5F - var3, 0.5F, var3 * 2.0F, 0.5F + var3);
		this.setUnlocalizedName("OrangeSappling");
		this.setCreativeTab(Cookies.cookieTab);
		MinecraftForge.EVENT_BUS.register(new OrangeSapplingEventClass());
		
	}

	
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if(!par1World.isRemote) {
                super.updateTick(par1World, par2, par3, par4, par5Random);
                if(par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0) {
                        this.func_96477_c(par1World, par2, par3, par4, par5Random);
                }
        }
    }
       
        public void func_96477_c(World par1World, int par2, int par3, int par4, Random par5Random) {
            int l = par1World.getBlockMetadata(par2, par3, par4);
            if ((l & 7) == Block.grass.blockID);
            
    }
        
        public void growTree(World par1World, int par2, int par3, int par4, Random par5Random) {
            if(!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
            int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
            Object object = null;
            int i1 = 0;
            int j1 = 0;
            boolean flag = false;
            if(l == 2) {
                    object = new WorldGenTaiga2(true);
            } else if (l == 2) {
                    object = new WorldGenForest(true);
            }
            else if (l == 3) {
                    for(i1 = 0; i1 >= -i1; --i1) {
                            for(j1 = 0; j1 >= -j1; --j1) {
                                    if(this.isSameSapling(par1World, par2 + i1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.isSameSapling
                                                    (par1World, par2 + i1, par3, par4, par4 + j1 + 1) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3)) {
                                           
                                            object = new OrangeTreeWorldGeneration(true, 10 + par5Random.nextInt(20), 3, 3, false);
                                            flag = true;
                                            break;
                                           
                                    }
                                           
                            }
                            if(object != null) {
                                    break;
                            }
                    }
                    if(object == null) {
                            j1 = 0;
                            i1 = 0;
                            object = new OrangeTreeWorldGeneration(true, 4 + par5Random.nextInt(7), 3, 3, false);
                    }
            }
            else {
                    object = new OrangeTreeWorldGeneration(true);
                    if(par5Random.nextInt(10) == 0) {
                            object = new WorldGenBigTree(true);
                    }
            }
            if(flag) {
                    par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
                    par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
                    par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
                    par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
            }
            else {
                    par1World.setBlock(par2, par3, par4, 0, 0, 4);
            }
            if(!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1)) {
                    if(flag) {
                           
                            par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, 1, 4);
                            par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, 1, 4);
                            par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, 1, 4);
                            par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, 1, 4);
                           
                           
                           
                    }
                    else {
                            par1World.setBlock(par2, par3, par4, this.blockID, 1, 4);
                    }
              }
      }
     
      public boolean isSameSapling(World  par1World, int par2, int par3, int par4, int par5) {
              return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
      }
protected boolean canThisPlantGrowOnThisBlockID(int par1) {
      return par1 == Block.grass.blockID || par1 == Block.grass.blockID;
}

public void registerIcons(IconRegister iconRegister) {
      blockIcon = iconRegister.registerIcon("Cookies:sapling_orange");
}
     
     
     
     
     

        
        
        
        
        
        
}
	
	
	

