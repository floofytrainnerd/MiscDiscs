package floofytrainnerd.miscdiscs.init;

import floofytrainnerd.miscdiscs.MiscDiscs;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {
	
	public static final ObjectSet<String> TICKABLE_SOUNDS = new ObjectOpenHashSet<>();
	
	public static SoundEvent megalovania;
	public static SoundEvent pokemon_theme;
	
	public static void init() {
		
		megalovania = register("music.miscdiscs.megalovania");
		pokemon_theme = register("music.miscdiscs.pokemon_theme");
		
	}
	
	private static SoundEvent register(String name) {
		return register(name, false);
	}
	
	private static SoundEvent register(String name, boolean tickable) {
		ResourceLocation location = new ResourceLocation(MiscDiscs.modId, name);
		if (tickable) {
			TICKABLE_SOUNDS.add(location.toString());
		}
		SoundEvent event = new SoundEvent(location);
		
		ForgeRegistries.SOUND_EVENTS.register(event.setRegistryName(location));
		return event;
	}
}