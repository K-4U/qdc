package qdc.cookies.giftbox;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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

	

	
	
	

	
	
	
	
}
