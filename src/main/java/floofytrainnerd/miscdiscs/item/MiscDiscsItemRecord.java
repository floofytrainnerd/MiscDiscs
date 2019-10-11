package floofytrainnerd.miscdiscs.item;

import java.util.List;

import javax.annotation.Nullable;

import floofytrainnerd.miscdiscs.MiscDiscs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class MiscDiscsItemRecord extends ItemRecord {
	
	private final String name;
	private final String artist;
	private final String album;
	
	public MiscDiscsItemRecord(String nameIn, SoundEvent soundIn, String artistIn, String albumIn) {
		super(nameIn, soundIn);
		name = nameIn;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(MiscDiscs.creativeTab);
		this.artist = artistIn;
		this.album = albumIn;
	}
	
	public void registerItemModel() {
		MiscDiscs.proxy.registerItemRenderer(this, 0, name);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre("record", this);
	}
	
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(this.artist);
        tooltip.add(this.album);
    }
    
}
