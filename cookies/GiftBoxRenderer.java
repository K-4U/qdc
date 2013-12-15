package qdc.cookies;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GiftBoxRenderer extends TileEntitySpecialRenderer{

	
	private static final ResourceLocation GiftBoxLocation = new ResourceLocation("cookies:/textures/blocks/giftbox.png");
	
	private final ModelGiftbox model = new ModelGiftbox();


	public void renderAModelAt(GiftBoxEntity par1GiftBoxEntity, double par2, double par4, double par6, float par8 ){
		
		int metadata = par1GiftBoxEntity.getBlockMetadata();
		int rotationAngle = 0;
		
		if(metadata%4 == 0){
			rotationAngle = 0;
		}
		if(metadata % 4 == 1){
			rotationAngle = 270;
		}
		if(metadata % 4 == 2){
			rotationAngle = 180;
		}
		if(metadata % 4 == 3){
			rotationAngle = 90;
		}
		
		GL11.glPushMatrix();
		GL11.glTranslated((float) par2 + 0.5F, (float)par4 + 1.5F , (float)par6 + 0.5F);
		GL11.glScalef(1.0F, -1F, -1F);
		GL11.glRotatef(rotationAngle * 90 , 0.0F, 1.0F, 0.0F);
		this.bindTexture(GiftBoxLocation);
		this.model.renderAll();
		GL11.glPopMatrix();
		
		
	}
	
	
	
	

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4	,	double par6, float par8) {
			
		this.renderAModelAt((GiftBoxEntity)par1TileEntity, par2, par4, par6, par8);
	}
	
	
	
	
	
			//private void adjustRotatePivotViaMeta(World world, int x, int y, int z){
	//	int meta = world.getBlockMetadata(x, y, z);
	//	GL11.glPushMatrix();
	//	GL11.glRotatef(meta * (-90),  0.0F,  0.0F,  1.0F);
////		GL11.glPopMatrix();
		
		
//	}
	
	
	//@Override
//	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float scale) {
	
	//			GL11.glPushMatrix();
	//			GL11.glTranslatef((float) x + 0.5F, (float) y + 0.5F, (float) z + 0.5F) ;
	//			ResourceLocation textures = (new ResourceLocation("cookies:textures/blocks/giftbox.png"));
		
				
	//			Minecraft.getMinecraft().renderEngine.bindTexture(textures);
				
	//			GL11.glPushMatrix();
	//			GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	//			this.model.render((Entity)null, 0.0F,0.0F,-0.1F,0.0F,0.0F, 0.625F);
	//			GL11.glPopMatrix();
	//			GL11.glPopMatrix();
	//			
//	}

	
	
	//private void adjustLightFixture(World world, int i, int j, int k, Block block){
		
	//	Tessellator tess = Tessellator.instance;
	//	float brightness = block.getBlockBrightness(world, i, j, k);
	//	int skyLight = world.getLightBrightnessForSkyBlocks( i, j, k, 0);
	//	int modulousModifier = skyLight % 65536;
	//	int divModifer = skyLight / 65536;
		
	//	tess.setColorOpaque_F(brightness, brightness, brightness);
		
	//	OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) modulousModifier,  divModifer);
		
		
		
//	}
	
	
	
	
	
}
