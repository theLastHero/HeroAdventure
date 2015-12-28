package HeroAdventure.Managers;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;

import HeroAdventure.HeroAdventure.HeroAdventure;
import HeroAdventure.Objects.NpcObject;


public class NpcManager {

	
	static HeroAdventure plugin;

	public NpcManager(HeroAdventure theLastHero) {
		plugin = theLastHero;
	}

	private static NpcManager npcManager = new NpcManager(plugin);

	// ------------------------------------------------------
	// getController
	// ------------------------------------------------------
	public static NpcManager getNpcManager() {
		return npcManager;
	}

	// ------------------------------------------------------
	// createNpcObject
	// ------------------------------------------------------
	public static void createNpcObject(int npcID, String npcName, Location npcLocation, float npcPitch, float npcYaw, ChatColor npcNameColor, List<Integer> npcQuestList){
		
		new NpcObject(npcID, npcName, npcLocation, npcPitch, npcYaw, npcNameColor, npcQuestList);
		
	}
	
	public NpcObject getNpcObject(int npcEntityID){
		for (NpcObject n : NpcObject.npcObjects) {
			if (n.getNpcEntityID() == npcEntityID) {
				return n;
			}
		}
		return null;
		
	}
	
	public List<Integer> getNpcQuestList(int npcEntityID){
		for (NpcObject n : NpcObject.npcObjects) {
			if (n.getNpcEntityID() == npcEntityID) {
				return n.getNpcQuestList();
			}
		}
		return null;
	}
	

}
