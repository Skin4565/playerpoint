package StarPointClass;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import playerpoint.Main;


public class AvaliarHandler implements Listener{
	
	
	@EventHandler
	 private void aoClicarNoGUI(InventoryClickEvent e){
		 
		Player click = GuiMatrix.clicke.get(GuiMatrix.clicke.size() -1);
		 File f = new File(Main.getPlugin().getDataFolder(), "db.yml");
	     FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	     
		 
		   Player player = (Player) e.getWhoClicked();
		   
		  
			   if (e.getInventory().getTitle().equalsIgnoreCase("Avaliação"))
			    {
			
				   e.setCancelled(true);
				      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
				        return;
				      }
				      
		      
					


	    	  
	    	  if(e.getSlot() == 0 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c1"))){
	    	  if(player.hasPermission("voted." + click.getName())){
	    		  
	    		  player.sendMessage("§cVocê já avaliou esse jogador!");
	    		  player.closeInventory();
	    		  

	    		  
	    		  
	    	  }else{
			 

	      	  
	      	  @SuppressWarnings("unused")
			String click4 = click.getName();
	      	  
	      	  click.sendMessage("§cVocê recebeu §e1x Estrela §cde " + player.getName());
			 
	      	  player.sendMessage("§aVocê avaliou " + click.getName());
	      	  
	      	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " add voted." + click.getName());
			 
		          
		          
		          cfg.set("Jogador." + click.getName() + ".Pontuacao", Integer.valueOf(cfg.getInt("Jogador." + click.getName() + ".Pontuacao") + 1));
		          try
		          {
		            cfg.save(f);
		          }
		          catch (IOException e1)
		          {
		            Bukkit.getConsoleSender().sendMessage("Erro ao atualizar pontuacao de jogador! " + e1);
		          }
		          
		          
		          
		          e.setCancelled(true);
		          return;
	    	  }
	    	  }
		          
		          
		          
		 //2 ESTRELA PONTUAÇÃO
		          
		          if(e.getSlot() == 1 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c2"))){
			    	  if(player.hasPermission("voted." + click.getName())){
			    		  
			    		  player.sendMessage("§cVocê já avaliou esse jogador!");
			    		  player.closeInventory();
			    		  
			    		  e.setCancelled(true);
			    		  
			    		  
			    	  }else{
					 
	
			      	  
			    	
			    	
			    	
			      	  @SuppressWarnings("unused")
					String click4 = click.getName();
			      	  
			      	  click.sendMessage("§cVocê recebeu §e2x Estrela §cde " + player.getName());
					 
			      	  player.sendMessage("§aVocê avaliou " + click.getName());
			      	  
			      	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " add voted." + click.getName());
					 
				          
				          
				          cfg.set("Jogador." + click.getName() + ".Pontuacao", Integer.valueOf(cfg.getInt("Jogador." + click.getName() + ".Pontuacao") + 2));
				          try
				          {
				            cfg.save(f);
				          }
				          catch (IOException e1)
				          {
				            Bukkit.getConsoleSender().sendMessage("Erro ao atualizar pontuacao de jogador! " + e1);
				          }
				          
				          
				          
				          e.setCancelled(true);  
				          return;
			    	  
		          }
		          }
		          
		          
		          
		          
		          
		          
		          
		 //3 ESTRELA PONTUAÇÃO
		          
		          if(e.getSlot() == 2 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§63"))){
			    	  if(player.hasPermission("voted." + click.getName())){
			    		  
			    		  player.sendMessage("§cVocê já avaliou esse jogador!");
			    		  player.closeInventory();
			    		  
			    		  e.setCancelled(true);
			    		  
			    		  
			    	  }else{

			      	  @SuppressWarnings("unused")
					String click4 = click.getName();
			      	  
			      	  click.sendMessage("§cVocê recebeu §e3x Estrela §cde " + player.getName());
					 
			      	  player.sendMessage("§aVocê avaliou " + click.getName());
			      	  
			      	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " add voted." + click.getName());
					 
				          
				          
				          cfg.set("Jogador." + click.getName() + ".Pontuacao", Integer.valueOf(cfg.getInt("Jogador." + click.getName() + ".Pontuacao") + 3));
				          try
				          {
				            cfg.save(f);
				          }
				          catch (IOException e1)
				          {
				            Bukkit.getConsoleSender().sendMessage("Erro ao atualizar pontuacao de jogador! " + e1);
				          }
				          
				          
				          
				          e.setCancelled(true);  
		    	 
				          return;
		          }
		          }
			    	  
			    //4 ESTRELAS
			    	  
			    	  if(e.getSlot() == 3 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§64"))){
				    	  if(player.hasPermission("voted." + click.getName())){
				    		  
				    		  player.sendMessage("§cVocê já avaliou esse jogador!");
				    		  player.closeInventory();
				    		  
				    		  e.setCancelled(true);
				    		  
				    		  
				    	  }else{
						 
						 
			
				      	  @SuppressWarnings("unused")
						String click4 = click.getName();
				      	  
				      	  click.sendMessage("§cVocê recebeu §e4x Estrela §cde " + player.getName());
						 
				      	  player.sendMessage("§aVocê avaliou " + click.getName());
				      	  
				      	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " add voted." + click.getName());
						 
					          
					          
					          cfg.set("Jogador." + click.getName() + ".Pontuacao", Integer.valueOf(cfg.getInt("Jogador." + click.getName() + ".Pontuacao") + 4));
					          try
					          {
					            cfg.save(f);
					          }
					          catch (IOException e1)
					          {
					            Bukkit.getConsoleSender().sendMessage("Erro ao atualizar pontuacao de jogador! " + e1);
					          }
					          
					          
					          
					          e.setCancelled(true);  
					          return;
				    	  
			          }
			    	  }
				    	  
				   //5 ESTRELAS
				    	  
				    	  
				    	  if(e.getSlot() == 4 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a5"))){
					    	  if(player.hasPermission("voted." + click.getName())){
					    		  
					    		  player.sendMessage("§cVocê já avaliou esse jogador!");
					    		  player.closeInventory();
					    		  
					    		  e.setCancelled(true);
					    		  
					    		  
					    	  }else{

					      	  @SuppressWarnings("unused")
							String click4 = click.getName();
					      	  
					      	  click.sendMessage("§cVocê recebeu §e5x Estrela §cde " + player.getName());
							 
					      	  player.sendMessage("§aVocê avaliou " + click.getName());
					      	  
					      	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " add voted." + click.getName());
							 
						          
						          
						          cfg.set("Jogador." + click.getName() + ".Pontuacao", Integer.valueOf(cfg.getInt("Jogador." + click.getName() + ".Pontuacao") + 5));
						          try
						          {
						            cfg.save(f);
						          }
						          catch (IOException e1)
						          {
						            Bukkit.getConsoleSender().sendMessage("Erro ao atualizar pontuacao de jogador! " + e1);
						          }
						          
						          
						          
						          e.setCancelled(true);  
				    	 
					    	  return;
				          }
					    	  
					    	  
					    	  
					    	  
					    	  
					    	  
					    	  
					    	  
					    	  
					    	  
				    	  }
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
				    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
				    	    if (cfg.getInt("Jogador." + click.getName() + ".Pontuacao") % Main.getPlugin().getConfig().getInt("Dar-Recompensa") == 0)
					          {
					            player.playSound(player.getLocation(), Sound.LEVEL_UP, 5.0F, 5.0F);
					           
					            click.sendMessage("Você fez um total de 2 de pontuação é ganhou: 3 coins :v ");
					          }	  
			    	  
			    	  
			    	  
			    	  
		          }
		                  
		          
		          
		          
		          
		          
		          
		          
	
	
	
	
	
	
	
	
	
	

}
	 

}


