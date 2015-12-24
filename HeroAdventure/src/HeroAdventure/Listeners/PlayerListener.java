package HeroAdventure.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import HeroAdventure.FileHandlers.PlayerFileHandler;
import HeroAdventure.HeroAdventure.HeroAdventure;


public class PlayerListener implements Listener{
	
	HeroAdventure pl;
	
	public PlayerListener() {
		// TODO Auto-generated constructor stub
	}
	
	public PlayerListener(HeroAdventure pl){
		this.pl = pl;
	}
	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		if(!e.getPlayer().hasPlayedBefore()) {
			  p.teleport(new Location(Bukkit.getWorld("world_arotha"), 6, 12, -22, (float) -94.7, (float) -0.9));
		  }

		if (!PlayerFileHandler.checkPlayerDataFile(p.getUniqueId())) {
			PlayerFileHandler.createPlayerDataFile(p.getUniqueId());
		}

		//	playerManager.createPlayerObject(player.getUniqueId());
		

	}


}
