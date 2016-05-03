package HeroAdventure.Managers;

import HeroAdventure.HeroAdventure.HeroAdventure;


public class QuestManager {
	
	static HeroAdventure plugin;

	public QuestManager(HeroAdventure theLastHero) {
		plugin = theLastHero;
	}

	private static QuestManager questManager = new QuestManager(plugin);

	// ------------------------------------------------------
	// getController
	// ------------------------------------------------------
	public static QuestManager getQuestManager() {
		return questManager;
	}
	
	
	



}
