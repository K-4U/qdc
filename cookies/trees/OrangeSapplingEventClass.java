package qdc.cookies.trees;

import qdc.cookies.Cookies;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import qdc.cookies.trees.OrangeSappling;
public class OrangeSapplingEventClass {

	private int BlockID;
	
	@ForgeSubscribe
	public void bonemealUsed(BonemealEvent event){
		if(event.world.getBlockId(event.X, event.Y, event.Z) == Cookies.orangeSappling.blockID){
			//((OrangeSappling)Cookies.OrangeSappling.growTree(event.world, event.X,event.Y,event.Z, event.world.rand);
			((OrangeSappling)Cookies.orangeSappling).growTree(event.world, event.X,event.Y,event.Z, event.world.rand);
		}
	}
}
