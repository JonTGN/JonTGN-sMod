package jon.mod.tabs;

import jon.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ChristmasKing extends CreativeTabs 
{
	public ChristmasKing(String label)
	{
		super("christmasking");
		//this.setBackgroundImageName("christmasking.png");
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SWORD_DARKSTEEL);
	}
}
