package qdc.cookies.giftbox;

import org.lwjgl.opengl.GL11;

import qdc.cookies.Cookies;
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

	
	private ModelGiftbox model;
	
	//private static final ResourceLocation texture = new ResourceLocation(Cookies.modid, "textures/model/giftbox.png");
private static final ResourceLocation texture = new ResourceLocation("cookies:textures/model/giftbox.png");
	
	public GiftBoxRenderer() {
		this.model = new ModelGiftbox();
	}
	
	
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y,
			double z, float f) {
		
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F ,(float)z +0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
		
		model.renderModel(0.0625F);
		
		GL11.glPopMatrix();

		GL11.glPopMatrix();
		
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