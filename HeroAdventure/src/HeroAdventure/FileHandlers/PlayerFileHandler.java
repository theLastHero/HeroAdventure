package HeroAdventure.FileHandlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import HeroAdventure.HeroAdventure.HeroAdventure;


public class PlayerFileHandler {
	

		public static HeroAdventure plugin;

		// -------------------------------------------------------------------------------------
		// Constructor
		// -------------------------------------------------------------------------------------
		public PlayerFileHandler(HeroAdventure HeroAdventure) {
			plugin = HeroAdventure;
		}

		// -----------------------------------------------------
		// createPlayerDataFile
		// -----------------------------------------------------
		public static void createPlayerDataFile(UUID uuid) {
			File playerDataFile = new File(plugin.playerDataFolderPath + File.separator + uuid.toString());

			playerDataFile.getParentFile().mkdirs();
			copy(plugin.getResource("player_data_default"), playerDataFile);

		}

		// -----------------------------------------------------
		// checkPlayerDataFile
		// -----------------------------------------------------
		public static boolean checkPlayerDataFile(UUID uuid) {
			File playerDataFile = new File(plugin.playerDataFolderPath + File.separator + uuid.toString());

			// Check it exsists
			if (!playerDataFile.exists()) {
				return false;
			}

			return true;
		}

		// -------------------------------------------------------------------------------------
		// copy
		// -------------------------------------------------------------------------------------
		public static void copy(InputStream in, File file) {

			try {

				OutputStream out = new FileOutputStream(file);
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {

					out.write(buf, 0, len);

				}
				out.close();
				in.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

}
