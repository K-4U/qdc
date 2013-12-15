package qdc.cookies.plants;

import qdc.cookies.Cookies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class GingerBlock extends BlockCrops{
	
	
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	
	
	//public or private??
	public GingerBlock(int par1){
		super(par1);
	}
	
@SideOnly(Side.CLIENT)
public Icon getIcon(int par1, int par2){
	if (par2< 0 || par2 > 3){
		
		par2 = 3;
		
		
	}
	return this.iconArray[par2];
}
	

@SideOnly(Side.CLIENT)
public Icon getBlockTextyreFromSideandMetadata(int par1, int par2){
	
	if (par2 <7){
		
		if (par2 == 6){
			par2 = 5;
		
		}
		
		return this.iconArray[par2 >> 1];
				
	}
	
	else
		
	{
		return this.iconArray[3];
	}
	
}



protected int getCropItem(){
	return Cookies.ginger.itemID;
}

protected int getSeedItem(){
	return Cookies.ginger.itemID;
}


@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconregister){
	
	this.iconArray = new Icon[4];
	
	for (int i = 0; i < this.iconArray.length; i++){
		this.iconArray[i] = iconregister.registerIcon("cookies:ginger_stage_" + i);
		
		
	}
	
	
}




}
