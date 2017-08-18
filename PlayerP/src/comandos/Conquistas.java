package comandos;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import playerpoint.Main;

public class Conquistas implements CommandExecutor {
	
	File f = new File(Main.getPlugin().getDataFolder(), "db.yml");
    FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
	    if ((sender instanceof Player))
	    {
	      Player p = (Player)sender;
	      if (cmd.getName().equalsIgnoreCase("conquistas"))
	      {
	        Inventory in = Bukkit.getServer().createInventory(p, 9, "Menu de Conquista");
	        
	        
	        if(p.hasPermission("achievements.1")){
	        	
	        	 ItemStack pontos = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
	        	 ItemMeta metapontos = pontos.getItemMeta();
	        	 ArrayList<String> pontosr = new ArrayList<String>();
	        	
	        	 pontosr.add(" ");
		         pontosr.add("§aRECOMPENSA PEGA");
	        	 
	        	 
		         metapontos.setLore(pontosr);
			     metapontos.setDisplayName("§aAlcançando a Fama");
			     metapontos.addEnchant(Enchantment.DURABILITY, 3, true);
			     pontos.setItemMeta(metapontos);
			     in.setItem(0, pontos);
			     
	        	
	        }else{
	        	
	        	if(cfg.getInt("Jogador." + p.getName().toString()  + ".Pontuacao") < 10){
		        	 ItemStack pontos20 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
		        	 ItemMeta metapontos20 = pontos20.getItemMeta();
		        	 ArrayList<String> infolo = new ArrayList<String>();
				        
		        	 if(cfg.getInt("Jogador." + p.getName().toString()  + ".Pontuacao") < 10){
		        		  
				        	infolo.add(" ");
				        	infolo.add("§fConsiga 10 estrelas");
				      
				        }else{
				        	infolo.add(" ");
				        	infolo.add("§fConsiga 10 estrelas");
				        	infolo.add(" ");
				        	infolo.add("§fStatus: §a§lPEGAR RECOMPENSA ");
				        	
				        	
				        	
				        	
				        	
				        	
				        	
				        }
				        
				        metapontos20.setLore(infolo);
				        metapontos20.setDisplayName("§cAlcançando a Fama");
				        pontos20.setItemMeta(metapontos20);
				        in.setItem(0, pontos20);
				        
		        }else{
		        
		        	ItemStack pontos20 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
		        	ItemMeta metapontos20 = pontos20.getItemMeta();
		        	
		        	
		        	 ArrayList<String> infol = new ArrayList<String>();
				        
		
		        	 if(cfg.getInt("Jogador." + p.getName().toString()  + ".Pontuacao") < 10){
		        		  
				        	infol.add(" ");
				        	infol.add("§fConsiga 10 estrelas");;
				      
				        }else{
				        	infol.add(" ");
				        	infol.add("§fConsiga 10 estrelas");;
				        	infol.add(" ");
				        	infol.add("§fStatus: §a§lPEGAR RECOMPENSA ");
				        }
				      
				        
				        
		        	 	metapontos20.setLore(infol);
		        	 	metapontos20.setDisplayName("§aAlcançando a Fama");
				        pontos20.setItemMeta(metapontos20);
				        in.setItem(0, pontos20);        		        
	        }
	        	
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        if(p.hasPermission("achievements.2")){
	        	
	        	 ItemStack pontos = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
	        	 ItemMeta metapontos = pontos.getItemMeta();
	        	 ArrayList<String> pontosr = new ArrayList<String>();
	        	
	        	 pontosr.add(" ");
		         pontosr.add("§aRECOMPENSA PEGA");
	        	 
	        	 
		         metapontos.setLore(pontosr);
			     metapontos.setDisplayName("§aO Popular");
			     metapontos.addEnchant(Enchantment.DURABILITY, 3, true);
			     pontos.setItemMeta(metapontos);
			     in.setItem(1, pontos);
			     
	        	
	        }else{
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
			        
			        
	        
		      //50 PONTOS 
		        
		        if(cfg.getInt("Jogador." + p.getName().toString()  + ".Pontuacao") < 20){
		        	 ItemStack pontos20 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
		        	 ItemMeta metapontos20 = pontos20.getItemMeta();
		        	 ArrayList<String> infolo = new ArrayList<String>();
				        
		        	 if(cfg.getInt("Jogador." + p.getUniqueId().toString()  + ".Pontuacao") < 10){
		        		  
				        	infolo.add(" ");
				        	infolo.add("§fConsiga 20 estrelas");;
				      
				        }else{
				        	infolo.add(" ");
				        	infolo.add("§fConsiga 20 estrelas");;
				        	infolo.add(" ");
				        	infolo.add("§fStatus: §a§lPEGAR RECOMPENSA ");
				        }
				        
				        metapontos20.setLore(infolo);
				        metapontos20.setDisplayName("§cO Popular");
				        pontos20.setItemMeta(metapontos20);
				        in.setItem(1, pontos20);
				        
		        }else{
		        
		        	ItemStack pontos20 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
		        	ItemMeta metapontos20 = pontos20.getItemMeta();
		        	
		        	
		        	 ArrayList<String> infol = new ArrayList<String>();
				        
		
		        	 if(cfg.getInt("Jogador." + p.getName().toString()  + ".Pontuacao") < 20){
		        		  
				        	infol.add(" ");
				        	infol.add("§fConsiga 20 estrelas");;
				      
				        }else{
				        	infol.add(" ");
				        	infol.add("§fConsiga 20 estrelas");;
				        	infol.add(" ");
				        	infol.add("§fStatus: §a§lPEGAR RECOMPENSA ");
				        }
				      
				        
				        
		        	 	metapontos20.setLore(infol);
		        	 	metapontos20.setDisplayName("§aO Popular");
				        pontos20.setItemMeta(metapontos20);
				        in.setItem(1, pontos20);  
			        
			        
			        
			        
			        
			        
		        }
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
	        }
	        
	    
	        
	        
	        
	        
	        
	       
	        
	        p.openInventory(in);
	
	      }
	      }
	    


		    	  
	    	
		  

		


		return false;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	
	
}


