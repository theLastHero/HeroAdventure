package HeroAdventure.Objects;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;

import de.inventivegames.npc.NPC;
import de.inventivegames.npc.NPCLib;

public class NpcObject {

	// Array to hold npc's
		public static ArrayList<NpcObject> npcObjects = new ArrayList<NpcObject>();


		private int npcID;
		private String npcName;
		private Location npcLocation;
		private NPC npc;
		private float npcPitch;
		private float npcYaw;
		private int npcEntityID;
		private List<Integer> npcQuestList;
	
		//-------------------------------------------
		//
		//-------------------------------------------
		public NpcObject() {
		}

		
		//-------------------------------------------
		//
		//-------------------------------------------
		/*
		 * 
		 * npcID int
		 * npcName String
		 * npcLocation Location
		 * npcYaw float
		 * npcPitch float
		 * npcNameColor ChatColor
		 * npcQuestList List<Integer>
		 * 
		 */
		
		public NpcObject(int npcID, String npcName, Location npcLocation, float npcYaw, float npcPitch, ChatColor npcNameColor, List<Integer> npcQuestList) {
			
			this.setNpcID(npcID);
			this.setNpcName(npcNameColor + npcName);
			this.setNpcLocation(npcLocation);

			this.setNpcPitch(npcPitch);
			this.setNpcYaw(npcYaw);
			

			this.npc = NPCLib.spawnPlayerNPC(this.getNpcLocation(), this.getNpcName());
			this.npc.setYaw(this.npcYaw);
			this.npc.setPitch(npcPitch);
			
			this.setNpcEntityID(npc.getEntityID());
			this.setNpcQuestList(npcQuestList);
			
			
			npcObjects.add(this);
			
		}


		/**
		 * @return the npcID
		 */
		public int getNpcID() {
			return npcID;
		}


		/**
		 * @param npcID the npcID to set
		 */
		public void setNpcID(int npcID) {
			this.npcID = npcID;
		}


		/**
		 * @return the npcLocation
		 */
		public Location getNpcLocation() {
			return npcLocation;
		}


		/**
		 * @param npcLocation the npcLocation to set
		 */
		public void setNpcLocation(Location npcLocation) {
			this.npcLocation = npcLocation;
		}


		/**
		 * @return the npcPitch
		 */
		public float getNpcPitch() {
			return npcPitch;
		}


		/**
		 * @param npcPitch the npcPitch to set
		 */
		public void setNpcPitch(float npcPitch) {
			this.npcPitch = npcPitch;
		}


		/**
		 * @return the npcYaw
		 */
		public float getNpcYaw() {
			return npcYaw;
		}


		/**
		 * @param npcYaw the npcYaw to set
		 */
		public void setNpcYaw(float npcYaw) {
			this.npcYaw = npcYaw;
		}


		/**
		 * @return the npcName
		 */
		public String getNpcName() {
			return npcName;
		}


		/**
		 * @param npcName the npcName to set
		 */
		public void setNpcName(String npcName) {
			this.npcName = npcName;
		}


		/**
		 * @return the npcObjects
		 */
		public static ArrayList<NpcObject> getNpcObjects() {
			return npcObjects;
		}


		/**
		 * @param npcObjects the npcObjects to set
		 */
		public static void setNpcObjects(ArrayList<NpcObject> npcObjects) {
			NpcObject.npcObjects = npcObjects;
		}


		/**
		 * @return the npc
		 */
		public NPC getNpc() {
			return npc;
		}


		/**
		 * @param npc the npc to set
		 */
		public void setNpc(NPC npc) {
			this.npc = npc;
		}


		/**
		 * @return the npcEntityID
		 */
		public int getNpcEntityID() {
			return npcEntityID;
		}


		/**
		 * @param npcEntityID the npcEntityID to set
		 */
		public void setNpcEntityID(int npcEntityID) {
			this.npcEntityID = npcEntityID;
		}


		/**
		 * @return the npcQuestList
		 */
		public List<Integer> getNpcQuestList() {
			return npcQuestList;
		}


		/**
		 * @param npcQuestList the npcQuestList to set
		 */
		public void setNpcQuestList(List<Integer> npcQuestList) {
			this.npcQuestList = npcQuestList;
		}
}
