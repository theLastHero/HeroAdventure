package HeroAdventure.HeroAdventure;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import HeroAdventure.FileHandlers.PlayerFileHandler;
import HeroAdventure.Listeners.MobListener;
import HeroAdventure.Listeners.PlayerListener;
import HeroAdventure.Managers.PlayerManager;
import HeroAdventure.Utils.Verbrose;
import HeroAdventure.Utils.WorldWeatherTime;


public class HeroAdventure extends JavaPlugin {


	public String playerDataFolderPath = this.getDataFolder() + File.separator + "player_data";  //where player data is stored


	public PlayerFileHandler PlayerFileHandler;
	public Verbrose Verbrose;
	
	// CONSTANTS
	public Location FIRST_JOIN_LOCATION = new Location(Bukkit.getWorld("world_arotha"), 6, 12, -22, (float) -94.7, (float) -0.9);
	public boolean DEBUG_MODE = true;
	

	public static  HeroAdventure instance;
	public HeroAdventure plugin;


	// -------------------------------------------------------------------------------------
		// getInstance
		// -------------------------------------------------------------------------------------
		public static Plugin getInstance() {
			return instance;
		}

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
		instance = this;
		 
		this.setPlayerFileHandler(new PlayerFileHandler(this));
		new PlayerManager(this);
		new WorldWeatherTime();
		this.setVerbrose(new Verbrose(this));

		//this.getServer().getPluginManager().RegisterEvents(event, this);
		
		
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListener(plugin), this);
		Bukkit.getServer().getPluginManager().registerEvents(new MobListener(), this);
		
		//FIRST_JOIN_LOCATION = 
		
		//set world times
		WorldWeatherTime.setWeatherTime(Bukkit.getServer().getWorld("world_arotha"), 18000, false);
	}



	/**
	 * @return the playerDataFolderPath
	 */
	public String getPlayerDataFolderPath() {
		return playerDataFolderPath;
	}

	/**
	 * @param playerDataFolderPath the playerDataFolderPath to set
	 */
	public void setPlayerDataFolderPath(String playerDataFolderPath) {
		this.playerDataFolderPath = playerDataFolderPath;
	}

	/**
	 * @return the verbrose
	 */
	public Verbrose getVerbrose() {
		return Verbrose;
	}

	/**
	 * @param verbrose the verbrose to set
	 */
	public void setVerbrose(Verbrose verbrose) {
		Verbrose = verbrose;
	}

	/**
	 * @return the fIRST_JOIN_LOCATION
	 */
	public Location getFIRST_JOIN_LOCATION() {
		return FIRST_JOIN_LOCATION;
	}

	/**
	 * @param fIRST_JOIN_LOCATION the fIRST_JOIN_LOCATION to set
	 */
	public void setFIRST_JOIN_LOCATION(Location fIRST_JOIN_LOCATION) {
		FIRST_JOIN_LOCATION = fIRST_JOIN_LOCATION;
	}

	/**
	 * @return the dEBUG_MODE
	 */
	public boolean isDEBUG_MODE() {
		return DEBUG_MODE;
	}

	/**
	 * @param dEBUG_MODE the dEBUG_MODE to set
	 */
	public void setDEBUG_MODE(boolean dEBUG_MODE) {
		DEBUG_MODE = dEBUG_MODE;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(HeroAdventure instance) {
		HeroAdventure.instance = instance;
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
