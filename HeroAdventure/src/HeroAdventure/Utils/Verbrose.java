package HeroAdventure.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import HeroAdventure.HeroAdventure.HeroAdventure;

public class Verbrose {
	
	static HeroAdventure plugin;

	public Verbrose(HeroAdventure verbrose) {
		plugin = verbrose;
	}

	private static Verbrose v = new Verbrose(plugin);

	// ------------------------------------------------------
	// getController
	// ------------------------------------------------------
	public static Verbrose verbrose() {
		return v;
	}
	
	
	public static void broadcastDebug(String message){
		if(plugin.DEBUG_MODE){
			Bukkit.broadcastMessage(ChatColor.YELLOW.toString() + message);
		}
	}

}
