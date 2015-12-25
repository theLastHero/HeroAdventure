package HeroAdventure.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import HeroAdventure.FileHandlers.PlayerFileHandler;
import HeroAdventure.HeroAdventure.HeroAdventure;
import HeroAdventure.Managers.PlayerManager;
import HeroAdventure.Utils.Verbrose;


public class PlayerListener implements Listener{
	
	public static HeroAdventure plugin;

	// -------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------
	public PlayerListener(HeroAdventure HeroAdventure) {
		plugin = HeroAdventure;
	}
	
	
	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {

		Verbrose.broadcastDebug("* Player Joined Server");
		Player player = e.getPlayer();
		
		if(!e.getPlayer().hasPlayedBefore()) {
			  //p.teleport(new Location(Bukkit.getWorld("world_arotha"), 6, 12, -22, (float) -94.7, (float) -0.9));
			player.teleport(new Location(Bukkit.getWorld("world_arotha"), 6, 12, -22, (float) -94.7, (float) -0.9));
		  }

		if (!PlayerFileHandler.checkPlayerDataFile(player.getUniqueId())) {
			PlayerFileHandler.createPlayerDataFile(player.getUniqueId());
		}

		PlayerManager.createPlayerObject(player.getUniqueId());

	}
	
	// -------------------------------------------------------------------------------------
	// onPlayerQuit
	// -------------------------------------------------------------------------------------
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerQuit(PlayerQuitEvent event) {
		
		Player player = event.getPlayer();

		if (PlayerManager.getPlayers(player.getUniqueId()) != null) {
			PlayerManager.savePlayerObject(player.getUniqueId());

			PlayerManager.removePlayerObject(player.getUniqueId());
		}
	}


}
