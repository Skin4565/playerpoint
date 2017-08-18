package comandos.listerner;

import javax.swing.plaf.SeparatorUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import net.milkbowl.vault.economy.Economy;
import playerpoint.Main;

public class Util implements Listener{


	 @EventHandler
	  private void inventoryClick(InventoryClickEvent e)
	  {

		  
		  Player p = (Player) e.getWhoClicked();
		  
		   if (e.getInventory().getTitle().equalsIgnoreCase("Menu de Conquista"))
		    {
			   e.setCancelled(true);
	      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
	        return;
	      }
	      

	     
		      
		      if(e.getSlot() == 0 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAlcançando a Fama"))){
		    	  
		    	  p.closeInventory();
		    	  e.setCancelled(true);
		    	  
		    	  p.sendMessage("§cVocê não tem §c10x Estrelas§c para pegar essa recompensa!");
		    	  	      
		      }
		      
		      
		      if(e.getSlot() == 0 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aAlcançando a Fama"))){
		    	  
		    	 
		    	  e.setCancelled(true);
		    	  if(p.hasPermission("achievements.1")) {
		    	  
		    	  p.sendMessage("§a>> Você já pegou sua recompensa!");
		    	  
		    	  
		    	  
		      }else{
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  Main.economy.depositPlayer(p, 1000);
		    	  
		    	  p.sendMessage("§aRecompensa pega!");
		    	  
		    	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " add achievements.1");
		    	  
		    	  e.setCancelled(true); 
		    	  
		    	  
		    	  p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);
		    	  
		      }
		      
		      
		      
		      }
		      
		      
		      
		      
		      
		      if(e.getSlot() == 1 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cO Popular"))){
		    	  
		    	  p.closeInventory();
		    	  
		    	  p.sendMessage("§cVocê não tem §e20x Estrelas§c para pegar essa recompensa!");
		    	  	      
		      }
		      
		      
		      if(e.getSlot() == 1 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aO Popular"))){
		    	  
		    	  
		    	  if(p.hasPermission("achievements.2")) {
		    	  
		    	  p.sendMessage("§a>> Você já pegou sua recompensa!");
		    	  
		    	  
		    	  
		      }else{
		    	  
		    	  
		    	  
		    	  
		    	  
		    	  Main.economy.depositPlayer(p, 2000);
		    	  
		    	  p.sendMessage("§aRecompensa pega!");
		    	  
		    	  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " add achievements.2");
		    	  
		    	  e.setCancelled(true); 
		    	  
		    	  
		    	  p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);
		    	  
		      }  
		      
		      
		      }
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
			    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
