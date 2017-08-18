package denuncia;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import StarPointClass.GuiMatrix;



public class DenunciaGui implements Listener {
	
	  @EventHandler
	  private void inventoryClick(InventoryClickEvent e)
	  {
		  Player p = (Player) e.getWhoClicked();
		  
		
			  
	      if(e.getSlot() == 20 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cDENUNCIAR JOGADOR"))){
	    	  
	    	  
	    	  e.setCancelled(true);
	    	  
	    	  if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
			        return;
			      }
			      
	    	  Player click = GuiMatrix.clicke.get(GuiMatrix.clicke.size() - 1);
	    	  
	    	  
	    	  	Inventory denuncia = Bukkit.getServer().createInventory(p, 9, "Denunciar");
	    	  
	    	  	ItemStack fly = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
	        	 ItemMeta metafly = fly.getItemMeta();
	        	 ArrayList<String> pontosr = new ArrayList<String>();
	        	
	        	 pontosr.add(" ");
		         pontosr.add("§fDenuncia " + click.getName() + " por");
		         pontosr.add("§fuso de Fly");  	 
	        	 
		         metafly.setLore(pontosr);
			     metafly.setDisplayName("§aFly");
			     fly.setItemMeta(metafly);
			     denuncia.setItem(0, fly);
			     
			     
			     
			     
			     ItemStack killaura = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
	        	 ItemMeta metakill = fly.getItemMeta();
	        	 ArrayList<String> pontok = new ArrayList<String>();
	        	
	        	 pontok.add(" ");
		         pontok.add("§fDenuncia " + click.getName() + " por");
		         pontok.add("§fuso de KillAura");  	 
	        	 
		         metakill.setLore(pontok);
			     metakill.setDisplayName("§aKillAura");
			     killaura.setItemMeta(metakill);
			     denuncia.setItem(1, killaura);
			     
			     
			     ItemStack speed = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5);
	        	 ItemMeta metaspeed = fly.getItemMeta();
	        	 ArrayList<String> sp = new ArrayList<String>();
	        	
	        	 sp.add(" ");
		         sp.add("§fDenuncia " + click.getName() + " por");
		         sp.add("§fuso de Speed");  	 
	        	 
		         metaspeed.setLore(sp);
			     metaspeed.setDisplayName("§aSpeed");
			    speed.setItemMeta(metaspeed);
			     denuncia.setItem(2, speed);
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  p.openInventory(denuncia);
	    	  
	    	  
	    	  
	    	  
	      }  
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		    }
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


