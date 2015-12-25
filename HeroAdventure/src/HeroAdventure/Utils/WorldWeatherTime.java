package HeroAdventure.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class WorldWeatherTime {
		
		public static void setWeatherTime(World w, int time, boolean storm)
		{
			Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("HeroAdventure"), new Runnable() {

				@Override
				public void run() {
					{
						w.setTime(time);
						w.setStorm(storm);
					}
				}
			}, 0L, 1L);

		}	

		}