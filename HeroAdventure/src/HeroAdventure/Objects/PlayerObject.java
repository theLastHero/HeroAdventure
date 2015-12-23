package HeroAdventure.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class PlayerObject {
	
	public static ArrayList<PlayerObject> PlayerObjects = new ArrayList<PlayerObject>(); //ArrayLis of PlayerObjects
	
	private UUID playerUUID;					//This objects playerUUID
	private List<Integer> playerCompletedQuestList;	//List of quests that have been completed
	private List<Integer> playerCurrentQuestList;	//List of quest that are current
	private double playerMoney;						//Holds players money value
	private double playerLevel;						//Holds players current level
	private double playerXp;							//Holds players xp
	
	
	/**
	 *
	 */
	public PlayerObject(){}
	
	/**
	 * constructor
	 */
	public PlayerObject(UUID playerUUID, double playerLevel, double playerXp, double playerMoney,  List<Integer> playerCompletedQuestList, List<Integer> playerCurrentQuestList){
	
		this.setPlayerUUID(playerUUID);						//Set this objects playerUUID
		this.setPlayerMoney(playerMoney);									//Set players money
		this.setPlayerCompletedQuestList(playerCompletedQuestList);	//Set this objects list of completed quests
		this.setPlayerCurrentQuestList(playerCurrentQuestList);		//Set this objects list of current quests
		this.setPlayerLevel(playerLevel);
		this.setPlayerXp(playerXp);
		
		PlayerObjects.add(this);		//Add this object to the arraylist of PlayerObjects
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
	public void setPlayerLevel(double playerLevel) {
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
	public void setPlayerXp(double playerXp) {
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
