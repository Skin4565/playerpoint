package comandos;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import playerpoint.Main;

public class PontosComando implements CommandExecutor {
	
	File f = new File(Main.getPlugin().getDataFolder(), "db.yml");
    FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
	    if ((sender instanceof Player))
	    {
	    	
	      if (cmd.getName().equalsIgnoreCase("pontos"))
	      {
	              if (!(sender instanceof Player)) {
	                  sender.sendMessage("This command can only be run by a player.");
	                  return true;
	              }
	              
	              if (args.length == 0) {
	                  sender.sendMessage("Pontos: " + cfg.getInt("Jogador." + sender.getName() + ".Pontuacao"));
	                  
	                  try {
	                	  cfg.save(f);
	                	  
					} catch (Exception e) {
						Bukkit.getConsoleSender().sendMessage("Erro ao atualizar a config de jogador!");
					}
	                  
	                  
	                  
	                  
	                  
	                  
	                  
	                  
	                  
	                  return true;
	              }
	              
	             
		            	  
		            	  
		            	  
		            	 
		            	  
		            	  
	                      
	                  }
	                  
	                  
	                  
	                  
	                  
	                  
	           
	              }
	              
	              
	              
	              
	              
	              
	              
	              
	              
	              
	    
	          
	  

		return false;
	  }
}
