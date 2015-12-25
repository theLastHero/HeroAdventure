package HeroAdventure.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import HeroAdventure.HeroAdventure.HeroAdventure;


public class PlayerObject {
	
	public static HeroAdventure plugin;

	// -------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------
	public PlayerObject(HeroAdventure HeroAdventure) {
		plugin = HeroAdventure;
	}
	
	
	public static ArrayList<PlayerObject> playerObjects = new ArrayList<PlayerObject>(); //ArrayLis of PlayerObjects
	
	private UUID playerUUID;					//This objects playerUUID
	private List<Integer> playerCompletedQuestList;	//List of quests that have been completed
	private List<Integer> playerCurrentQuestList;	//List of quest that are current
	private double playerMoney;						//Holds players money value
	private int playerLevel;						//Holds players current level
	private int playerXp;							//Holds players xp
	
	

	/**
	 * constructor
	 */
	public PlayerObject(UUID playerUUID, int playerLevel, int playerXp, double playerMoney,  List<Integer> playerCompletedQuestList, List<Integer> playerCurrentQuestList){
	
		this.setPlayerUUID(playerUUID);								//Set this objects playerUUID
		this.setPlayerMoney(playerMoney);							//Set players money
		this.setPlayerCompletedQuestList(playerCompletedQuestList);	//Set this objects list of completed quests
		this.setPlayerCurrentQuestList(playerCurrentQuestList);		//Set this objects list of current quests
		this.setPlayerLevel(playerLevel);							//Set players level
		this.setPlayerXp(playerXp);									//Set players XP
		
		
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();

		Objective objective = board.registerNewObjective("test", "dummy");
		
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName("[ theLastHero ]");
		
		playerObjects.add(this);		//Add this object to the arraylist of PlayerObjects


	    Score line1 = objective.getScore(ChatColor.RED.toString()); 
	    line1.setScore(10);
	    
	    Score line2 = objective.getScore(ChatColor.YELLOW +""+ ChatColor.BOLD + "LEVEL:  "); 
	    line2.setScore(9);
	    
	    Score line3 = objective.getScore(""+ChatColor.GREEN + getPlayerLevel()); 
	    line3.setScore(8);

	    Score line5 = objective.getScore(ChatColor.YELLOW +""+ ChatColor.BOLD + "XP:  "); 
	    line5.setScore(6);
	    
	    Score line6 = objective.getScore(""+ChatColor.GREEN + getPlayerXp() + "/10000"); 
	    line6.setScore(5);
	    Bukkit.getPlayer(playerUUID).setScoreboard(board);
	    

	    Score line8 = objective.getScore(ChatColor.YELLOW +""+ ChatColor.BOLD + "MONEY:  "); 
	    line8.setScore(3);
	    
	    Score line9 = objective.getScore(""+ChatColor.GREEN + getPlayerMoney()); 
	    line9.setScore(2);
	    Bukkit.getPlayer(playerUUID).setScoreboard(board);
	}


	/**
	 * @return removePlayerObject
	 */
	public void removePlayersObject(UUID playerUUID){
		playerObjects.remove(this);
	}

	/**
	 * @return the playerCompletedQuestList
	 */
	public List<Integer> getPlayerCompletedQuestList() {
		return playerCompletedQuestList;
	}

	/**
	 * @param playerCompletedQuestList the playerCompletedQuestList to set
	 */
	public void setPlayerCompletedQuestList(List<Integer> playerCompletedQuestList) {
		this.playerCompletedQuestList = playerCompletedQuestList;
	}

	/**
	 * @return the playerCurrentQuestList
	 */
	public List<Integer> getPlayerCurrentQuestList() {
		return playerCurrentQuestList;
	}

	/**
	 * @param playerCurrentQuestList the playerCurrentQuestList to set
	 */
	public void setPlayerCurrentQuestList(List<Integer> playerCurrentQuestList) {
		this.playerCurrentQuestList = playerCurrentQuestList;
	}

	/**
	 * @return the playerMoney
	 */
	public double getPlayerMoney() {
		return playerMoney;
	}

	/**
	 * @param playerMoney the playerMoney to set
	 */
	public void setPlayerMoney(double playerMoney) {
		this.playerMoney = playerMoney;
	}

	/**
	 * @return the playerLevel
	 */
	public double getPlayerLevel() {
		return playerLevel;
	}

	/**
	 * @param playerLevel the playerLevel to set
	 */
	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	/**
	 * @return the playerXp
	 */
	public double getPlayerXp() {
		return playerXp;
	}

	/**
	 * @param playerXp the playerXp to set
	 */
	public void setPlayerXp(int playerXp) {
		this.playerXp = playerXp;
	}

	/**
	 * @return the playerUUID
	 */
	public UUID getPlayerUUID() {
		return playerUUID;
	}

	/**
	 * @param playerUUID the playerUUID to set
	 */
	public void setPlayerUUID(UUID playerUUID) {
		this.playerUUID = playerUUID;
	}


	
}
