package HeroAdventure.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import HeroAdventure.HeroAdventure.HeroAdventure;

public class MobListener implements Listener {

	public static HeroAdventure plugin;

	@EventHandler
	public void onMobSpawn(CreatureSpawnEvent event) {

		event.setCancelled(true);

	}

}
