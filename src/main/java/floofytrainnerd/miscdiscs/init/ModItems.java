package floofytrainnerd.miscdiscs.init;

import floofytrainnerd.miscdiscs.item.MiscDiscsItemRecord;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	//public static MiscDiscsItemRecord record_*name* = new MiscDiscsItemRecord("record_*name*", ModSounds.*name*, "*Artist* - *Name*", "*Album*");
	
	public static MiscDiscsItemRecord record_megalovania = new MiscDiscsItemRecord("record_megalovania", ModSounds.megalovania, "Toby Fox - Megalovania", "Undertale");
	public static MiscDiscsItemRecord record_pokemon_theme = new MiscDiscsItemRecord("record_pokemon_theme", ModSounds.pokemon_theme, "Jason Paige - Pokémon Theme", "Pokémon 2.B.A. Master");
	
	
	
	
    public static void register(IForgeRegistry<Item> registry) {
    	registry.registerAll(
    			
        record_megalovania,
        record_pokemon_theme

    	);
    	
    }
    
    public static void registerModels() {
    	
    	record_megalovania.registerItemModel();
    	record_pokemon_theme.registerItemModel();
    	
    }
    
}

