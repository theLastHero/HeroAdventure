package HeroAdventure.HeroAdventure;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class HeroAdventure extends JavaPlugin {


	public static HeroAdventure instance;
	private HeroAdventure plugin;
	
	/**
	 * getInstance
	 */
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
		instance = this;
		
		
	}


	/**
	 * @return the plugin
	 */
	public HeroAdventure getPlugin() {
		return plugin;
	}


	/**
	 * @param plugin the plugin to set
	 */
	public void setPlugin(HeroAdventure plugin) {
		this.plugin = plugin;
	}

}
