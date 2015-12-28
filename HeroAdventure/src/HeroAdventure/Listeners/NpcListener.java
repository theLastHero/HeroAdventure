package HeroAdventure.Listeners;

import java.util.List;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import HeroAdventure.Managers.NpcManager;
import HeroAdventure.Managers.PlayerManager;
import HeroAdventure.Utils.Verbrose;
import de.inventivegames.npc.event.NPCInteractEvent;

public class NpcListener implements Listener{
	
	@SuppressWarnings("unused")
	@EventHandler
	public void onNPCInteractEvent(NPCInteractEvent p) {
		
		Verbrose.broadcastDebug("NPCInteract with: " + p.getNPC().getName().toString());

		int npcEntityID = p.getNPC().getEntityID();
		UUID playerUUID = p.getPlayer().getUniqueId();
		int firstAvailQuest = 0;
		
		List<Integer> npcQuestList = NpcManager.getNpcManager().getNpcQuestList(npcEntityID);
		List<Integer> playerCompletedQuests = PlayerManager.getPlayers(playerUUID).getPlayerCompletedQuestList();
		List<Integer> PlayerCurrentQuests = PlayerManager.getPlayers(playerUUID).getPlayerCurrentQuestList();
		
		for (int x = 0; x < npcQuestList.size(); x++) {

			if (!playerCompletedQuests.contains(npcQuestList.get(x))) {
				firstAvailQuest = npcQuestList.get(x);
				p.getPlayer().sendMessage("FAQ: " + firstAvailQuest);
				break;
			}
		}
		
		
		}

}
