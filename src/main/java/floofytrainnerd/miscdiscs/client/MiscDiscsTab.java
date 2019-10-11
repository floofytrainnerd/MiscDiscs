package floofytrainnerd.miscdiscs.client;

import floofytrainnerd.miscdiscs.MiscDiscs;
import floofytrainnerd.miscdiscs.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MiscDiscsTab extends CreativeTabs {

	public MiscDiscsTab() {
		super(MiscDiscs.modId);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.record_megalovania);
	}

}