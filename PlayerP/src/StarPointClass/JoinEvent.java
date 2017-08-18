package StarPointClass;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import playerpoint.Main;

public class JoinEvent implements Listener{
	
	
	 
	  @EventHandler
	  private void aoEntrarNoServidor(PlayerLoginEvent e)
	  {
	    Player p = e.getPlayer();
	     File f = new File(Main.getPlugin().getDataFolder(), "db.yml");
	     
	     File pl = new File(Main.getPlugin().getDataFolder(), "jogadores/"+ p.getName() + ".yml");
	     FileConfiguration plg = YamlConfiguration.loadConfiguration(pl);
	     
	     
	     FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	      
	     File d = new File(Main.getPlugin().getDataFolder(), "denuncia.yml");
		 FileConfiguration den = YamlConfiguration.loadConfiguration(d);
	      
	      cfg.isSet("Jogador." + p.getName() + ".Pontuacao");
	      
	      den.isSet("Jogador." + p.getName() + ".Denuncias" + ".Data");
	      
	      den.isSet("Jogador." + p.getName() +  ".Total-De-Denuncia");
	      
	      plg.isSet("Jogador." + p.getName() +  ".Total-De-Denuncia");
	      try
	      {
	        cfg.save(f);
	      }
	      catch (IOException e1)
	      {
	        Bukkit.getConsoleSender().sendMessage("cErro ao executar update CFG! " + e1);
	      }
	      
	      try {
			den.save(d);
		} catch (Exception e2) {
			Bukkit.getConsoleSender().sendMessage("cErro ao executar update DENUNCIAS! " + e2);
		}
	      
	      
	      
	      
	      
	      
	      
	    }
	  
	
	
	
	
	
	
	
	
	
	

	
}
