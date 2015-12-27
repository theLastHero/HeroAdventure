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
		
		//temp
		//PlayerManager.playerManager().getPlayers(UUID.fromString("1c5895a2-a35d-4ec8-8f72-1e7a3e16e3bd")).setPlayerMoney(PlayerManager.playerManager().getPlayers(UUID.fromString("1c5895a2-a35d-4ec8-8f72-1e7a3e16e3bd")).getPlayerMoney()+1);
		//PlayerManager.playerManager().getPlayers(UUID.fromString("1c5895a2-a35d-4ec8-8f72-1e7a3e16e3bd")).updateScoreboard();
       
	}

}
