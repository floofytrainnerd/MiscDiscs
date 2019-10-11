package floofytrainnerd.miscdiscs;

import floofytrainnerd.miscdiscs.client.MiscDiscsTab;
import floofytrainnerd.miscdiscs.init.ModItems;
import floofytrainnerd.miscdiscs.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MiscDiscs.modId, name = MiscDiscs.name, version = MiscDiscs.version, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class MiscDiscs {

    public static final String modId = "miscdiscs";
    public static final String name = "MiscDiscs";
    public static final String version= "0.0.1";

    @SidedProxy(clientSide = "floofytrainnerd.miscdiscs.proxy.ClientProxy", serverSide = "floofytrainnerd.miscdiscs.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static final MiscDiscsTab creativeTab = new MiscDiscsTab();

	@Mod.Instance(modId)
	public static MiscDiscs instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is turning it up to 11!");
        proxy.preInit(event);
    }
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
        proxy.Init(event);
    }
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}