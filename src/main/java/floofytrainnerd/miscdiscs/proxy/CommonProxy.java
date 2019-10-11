package floofytrainnerd.miscdiscs.proxy;

import floofytrainnerd.miscdiscs.MiscDiscs;
import floofytrainnerd.miscdiscs.init.ModItems;
import floofytrainnerd.miscdiscs.init.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
	

	public void registerItemRenderer(Item item, int meta, String id) {
	}
    

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {


		


		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
	
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}

    public void preInit(FMLPreInitializationEvent event) {
    	ModSounds.init();
    }
    
    public void Init(FMLInitializationEvent event) {
    
    }
    
    public void postInit(FMLPostInitializationEvent event) {
    	
    		
	}

}
    