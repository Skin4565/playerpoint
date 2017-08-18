package ChatEvent;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import playerpoint.Main;

public class ChatHandler implements Listener {
	
	  @SuppressWarnings("deprecation")
	@EventHandler
	  public void onChat(PlayerChatEvent e){
		  
		  Player p = e.getPlayer();
		  
		  File f = new File(Main.getPlugin().getDataFolder(), "db.yml");
		  FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
		  
		  String Chat = "[§a" + cfg.getInt("Jogador." + p.getName().toString() + ".Pontuacao" ) + "§f] ";
		  
		  
		  
		  
		  
		 e.setFormat(Chat + e.getFormat());
	  }
	
	

}
