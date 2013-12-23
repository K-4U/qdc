package qdc.cookies.giftbox;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GiftBoxGUI extends GuiContainer {

	
	public static final ResourceLocation texture = new ResourceLocation("cookies", "textures/gui/giftBox.png");
	public GiftBoxEntity giftbox;
	



	public GiftBoxGUI(InventoryPlayer inventory, GiftBoxEntity entity) {
		super(new GiftBoxContainer(inventory, entity));
		this.giftbox = entity;
		this.xSize = 175;
		this.ySize = 166;
		
	}


	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		//Minecraft.getMinecraft().func_110434_K().func_110577_a(texture)
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		this.drawTexturedModalRect(this.guiLeft,this.guiTop,0,0, this.xSize, this.ySize);
	}
	
	
	
}