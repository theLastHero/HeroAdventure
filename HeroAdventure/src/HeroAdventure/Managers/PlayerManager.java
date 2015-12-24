package HeroAdventure.Managers;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import HeroAdventure.HeroAdventure.HeroAdventure;
import HeroAdventure.Objects.PlayerObject;


public class PlayerManager {


	static HeroAdventure plugin;

	public PlayerManager(HeroAdventure HeroAdventure) {
		plugin = HeroAdventure;
	}

	private static PlayerManager pm = new PlayerManager(plugin);

	// ------------------------------------------------------
	// getController
	// ------------------------------------------------------
	public static PlayerManager playerManager() {
		return pm;
	}
	
	// ------------------------------------------------------
	// createPlayerObject
	// ------------------------------------------------------
	public static void createPlayerObject(UUID playerUUID) {

		File playerDataFile = new File(plugin.playerDataFolderPath, playerUUID.toString());

		// read from file
		FileConfiguration config = new YamlConfiguration();
		try {
			config.load(playerDataFile);
			//clanName = config.getString("playerClan");
			List<Integer> PlayerCompletedQuests = config.getIntegerList("PlayerCompletedQuests");
			List<Integer> PlayerCurrentQuests = config.getIntegerList("PlayerCurrentQuests");
			double PlayerMoney = config.getDouble("PlayerMoney");
			double PlayerLevel = config.getDouble("PlayerLevel");
			double PlayerXp = config.getDouble("PlayerXp");
			// config.save(playerDataFile);
			new PlayerObject(playerUUID, PlayerLevel, PlayerXp, PlayerMoney, PlayerCompletedQuests, PlayerCurrentQuests);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ------------------------------------------------------
	// createPlayerObject
	// ------------------------------------------------------
	public static void savePlayerObject(UUID playerUUID) {

		File playerDataFile = new File(plugin.playerDataFolderPath, playerUUID.toString());

		// read from file
		FileConfiguration config = new YamlConfiguration();
		try {
			config.load(playerDataFile);
			config.set("PlayerCompletedQuests", PlayerManager.getPlayers(playerUUID).getPlayerCompletedQuestList());
			config.set("PlayerCurrentQuests", PlayerManager.getPlayers(playerUUID).getPlayerCurrentQuestList());
			config.set("PlayerMoney", PlayerManager.getPlayers(playerUUID).getPlayerMoney());
			config.set("PlayerLevel", PlayerManager.getPlayers(playerUUID).getPlayerLevel());
			config.set("PlayerXp", PlayerManager.getPlayers(playerUUID).getPlayerXp());
			config.save(playerDataFile);
			//playerObject playerObj = new playerObject(playerUUID, questsCompleted);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		

		
	}

	// ------------------------------------------------------
	// removePlayerObject
	// ------------------------------------------------------
	public static void removePlayerObject(UUID playerUUID) {
		PlayerObject playerObj = PlayerManager.getPlayers(playerUUID);
		playerObj.removePlayersObject(playerUUID);
		playerObj = null;
	}
	
	// -----------------------------------------------------
	// getPlayer
	// -----------------------------------------------------
	public static PlayerObject getPlayers(UUID uuid) {
		for (PlayerObject a : PlayerObject.playerObjects) {
			if (a.getPlayerUUID().equals(uuid)) {
				return a;
			}
		}
		return null;
	}
	

}
