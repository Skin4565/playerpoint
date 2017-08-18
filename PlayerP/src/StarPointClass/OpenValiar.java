package StarPointClass;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OpenValiar implements Listener {
	
	
	 @EventHandler 
	 
	 
	 
	 private void aoClicarNoGUI(InventoryClickEvent e){
		 
		 
		 
		   Player player = (Player) e.getWhoClicked();

		   
		   
		   
		   
		   
		 if (e.getInventory().getTitle().equalsIgnoreCase("Menu de Jogador"))
		    {
		
			
			   e.setCancelled(true);
			      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
			        return;
			      }
			      
	    
		 if(e.getSlot() == 19 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aAVALIAR JOGADOR"))){
			 
			 Inventory ie = Bukkit.getServer().createInventory(player, 9,  "Avaliação");
	       	    ItemStack boo = new ItemStack(Material.NETHER_STAR);
	       	    ItemMeta metaboo = boo.getItemMeta();
	       	    metaboo.setDisplayName("§c1");
	       	    boo.setItemMeta(metaboo);
	       	    ie.setItem(0, boo);
	       	    
	       	 ItemStack boo2 = new ItemStack(Material.NETHER_STAR);
	       	    ItemMeta metaboo2 = boo2.getItemMeta();
	       	    metaboo2.setDisplayName("§c2");
	       	    boo2.setItemMeta(metaboo2);
	       	    ie.setItem(1, boo2);
	       	    
	       	 ItemStack boo3 = new ItemStack(Material.NETHER_STAR);
	       	    ItemMeta metaboo3 = boo3.getItemMeta();
	       	    metaboo3.setDisplayName("§63");
	       	    boo3.setItemMeta(metaboo3);
	       	    ie.setItem(2, boo3);
	       	    
	       	 ItemStack boo4 = new ItemStack(Material.NETHER_STAR);
	       	    ItemMeta metaboo4 = boo4.getItemMeta();
	       	    metaboo4.setDisplayName("§64");
	       	    boo4.setItemMeta(metaboo4);
	       	    ie.setItem(3, boo4);
	       	    
	     
	       	 ItemStack boo7 = new ItemStack(Material.NETHER_STAR);
	       	    ItemMeta metaboo7 = boo7.getItemMeta();
	       	    metaboo7.setDisplayName("§a5");
	       	    boo7.setItemMeta(metaboo7);
	       	    ie.setItem(4, boo7);
	       	    
	       	    
	       	    
	       	    
	       	    player.openInventory(ie);
	       	    
	       	    
	       	    
		 
			 
		 }
		    
		    }

		
	    	  	}
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	

}
