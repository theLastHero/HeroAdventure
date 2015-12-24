package HeroAdventure.HeroAdventure;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import HeroAdventure.FileHandlers.PlayerFileHandler;
import HeroAdventure.Listeners.MobListener;
import HeroAdventure.Listeners.PlayerListener;


public class HeroAdventure extends JavaPlugin {


	public String playerDataFolderPath = this.getDataFolder() + File.separator + "player_data";  //where player data is stored


	public PlayerFileHandler PlayerFileHandler;
	
	// CONSTANTS
	public Location FIRST_JOIN_LOCATION;
	


	/**
	 * onDisable
	 */
	@Override
	public void onDisable() {
	}


	/**
	 * onEnable
	 */
	@Override
	public void onEnable() {
		
		
		// Registers
		 
		this.setPlayerFileHandler(new PlayerFileHandler(this));
		//this.getServer().getPluginManager().RegisterEvents(event, this);
		
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new MobListener(), this);
		
		//FIRST_JOIN_LOCATION = 
	}



	/**
	 * @return the playerFileHandler
	 */
	public PlayerFileHandler getPlayerFileHandler() {
		return PlayerFileHandler;
	}


	/**
	 * @param playerFileHandler the playerFileHandler to set
	 */
	public void setPlayerFileHandler(PlayerFileHandler playerFileHandler) {
		PlayerFileHandler = playerFileHandler;
	}

}
