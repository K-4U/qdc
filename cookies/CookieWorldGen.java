package qdc.cookies;

import java.util.Random;






import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public  class CookieWorldGen implements IWorldGenerator {

        @Override
        public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                
        	
        	BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
            //   if(b.biomeName.equalsIgnoreCase("forest")) {
        	if(b == BiomeGenBase.forest) {
          
            	   int x = chunkX*16 + random.nextInt(16);
            	   int y = 0;
            	   int z = chunkZ*16 + random.nextInt(16);
            	   
            	   for (int i=0; i<150; i++){
            		   int bID = world.getBlockId(x, i, z);
            		   if(bID == Block.grass.blockID){
                    	 //  world.setBlock(x, i+1, z, Cookies.gingerBlock.blockID);
            			   world.setBlock(x, i+1, z, Cookies.gingerBlock.blockID);
            			  // world.setBlock(x+2, i+1, z, Block.obsidian.blockID);

            			   break;
            		   }
            	   

            	   }
               }
        
                
                
        }
}
