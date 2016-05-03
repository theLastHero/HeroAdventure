package HeroAdventure.Objects;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;


public class QuestObject {


	// Array to hold npc's
	public static ArrayList<QuestObject> questObjects = new ArrayList<QuestObject>();
	private int questID;
	private String questTitle;
	private ItemStack questBook;
	private BookMeta bm;
	private String questPage;
	private ItemStack questReward;
	private Material questItemNeeded;
	private int questItemNeededAmount;
	private int questMoneyReward;
	
	
	
	public QuestObject() {
	}

	
	//-------------------------------------------
	//
	//-------------------------------------------
	/*
	 * 
	 * questID int
	 * questTitle String
	 * questPage String
	 * questReward ItemStack
	 * questItemNeeded Material
	 * questItemNeededAmount int
	 * questMoneyReward int
	 * 
	 */
	
	public QuestObject(int questID, String questTitle, String questPage, ItemStack questReward, Material questItemNeeded, int questItemNeededAmount, int questMoneyReward) {

		this.setQuestID(questID);
		this.setQuestTitle(questTitle);
		this.setQuestPage(questPage);
		
		this.setQuestBook(new ItemStack(Material.WRITTEN_BOOK));
		this.bm = (BookMeta)questBook.getItemMeta();
		this.bm.setAuthor("SERVER");
		this.bm.setTitle(this.getQuestTitle());
		this.bm.addPage(this.getQuestPage());
		this.questBook.setItemMeta(this.bm);
		
		this.setQuestReward(questReward);
		this.setQuestItemNeeded(questItemNeeded);
		this.setQuestItemNeededAmount(questItemNeededAmount);
		this.setQuestMoneyReward(questMoneyReward);
		
		questObjects.add(this);		
	}


	/**
	 * @return the questObjects
	 */
	public static ArrayList<QuestObject> getQuestObjects() {
		return questObjects;
	}


	/**
	 * @param questObjects the questObjects to set
	 */
	public static void setQuestObjects(ArrayList<QuestObject> questObjects) {
		QuestObject.questObjects = questObjects;
	}


	/**
	 * @return the bm
	 */
	public BookMeta getBm() {
		return bm;
	}


	/**
	 * @param bm the bm to set
	 */
	public void setBm(BookMeta bm) {
		this.bm = bm;
	}


	/**
	 * @return the questPage
	 */
	public String getQuestPage() {
		return questPage;
	}


	/**
	 * @param questPage the questPage to set
	 */
	public void setQuestPage(String questPage) {
		this.questPage = questPage;
	}


	/**
	 * @return the questID
	 */
	public int getQuestID() {
		return questID;
	}


	/**
	 * @param questID the questID to set
	 */
	public void setQuestID(int questID) {
		this.questID = questID;
	}


	/**
	 * @return the questTitle
	 */
	public String getQuestTitle() {
		return questTitle;
	}


	/**
	 * @param questTitle the questTitle to set
	 */
	public void setQuestTitle(String questTitle) {
		this.questTitle = questTitle;
	}


	/**
	 * @return the questBook
	 */
	public ItemStack getQuestBook() {
		return questBook;
	}


	/**
	 * @param questBook the questBook to set
	 */
	public void setQuestBook(ItemStack questBook) {
		this.questBook = questBook;
	}


	/**
	 * @return the questReward
	 */
	public ItemStack getQuestReward() {
		return questReward;
	}


	/**
	 * @param questReward the questReward to set
	 */
	public void setQuestReward(ItemStack questReward) {
		this.questReward = questReward;
	}


	/**
	 * @return the questItemNeeded
	 */
	public Material getQuestItemNeeded() {
		return questItemNeeded;
	}


	/**
	 * @param questItemNeeded the questItemNeeded to set
	 */
	public void setQuestItemNeeded(Material questItemNeeded) {
		this.questItemNeeded = questItemNeeded;
	}


	/**
	 * @return the questItemNeededAmount
	 */
	public int getQuestItemNeededAmount() {
		return questItemNeededAmount;
	}


	/**
	 * @param questItemNeededAmount the questItemNeededAmount to set
	 */
	public void setQuestItemNeededAmount(int questItemNeededAmount) {
		this.questItemNeededAmount = questItemNeededAmount;
	}


	/**
	 * @return the questMoneyReward
	 */
	public int getQuestMoneyReward() {
		return questMoneyReward;
	}


	/**
	 * @param questMoneyReward the questMoneyReward to set
	 */
	public void setQuestMoneyReward(int questMoneyReward) {
		this.questMoneyReward = questMoneyReward;
	}
	
}