package StarPointClass;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import playerpoint.Main;

public class GuiMatrix implements Listener{
	
	 public static ArrayList<Player> clicke = new ArrayList<Player>();  
		
	 File f = new File(Main.getPlugin().getDataFolder(), "db.yml");
    FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
    
    File d = new File(Main.getPlugin().getDataFolder(), "denuncia.yml");
    FileConfiguration den = YamlConfiguration.loadConfiguration(d);
	
	
	
	 @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=true)
    public void aoClicarSobreUmJogadot(PlayerInteractEntityEvent event) {
		 
		
      Player player = event.getPlayer();
      
       Player clicked = (Player)event.getRightClicked();
      
      if(clicked instanceof Player){

        	  
        
       	Inventory in = Bukkit.getServer().createInventory(player, 36,  "Menu de Jogador");
      	    
       	//AVALIAÇÃO DE JOGADOR =)
       	
       		ItemStack boo1 = new ItemStack(Material.NETHER_STAR);
      	    ItemMeta metabook1 = boo1.getItemMeta();
      	    ArrayList<String> lore = new ArrayList<String>();
      	  if(player.hasPermission("avaliacao.set")) {   
      	    lore.add("");
      	    lore.add("§aClique para avaliar");
      	    metabook1.setLore(lore);
      	    metabook1.setDisplayName("§aAVALIAR JOGADOR");
      	  }else{
      		lore.add("");
      	    lore.add("§aClique para avaliar ");
      	    metabook1.setLore(lore);
      	    metabook1.setDisplayName("§aAVALIAR JOGADOR"); 
      	  }
      	    boo1.setItemMeta(metabook1);
      	    in.setItem(19, boo1);
      	    
      	    
      	    
      	//DENUNCIAR    
      	    
      	    
      	    
      	    
      	    
      	    
      	    
      	    
      	    ItemStack denunciar = new ItemStack(Material.BARRIER);
     	    ItemMeta metadenunciar = denunciar.getItemMeta();
     	    ArrayList<String> lore1 = new ArrayList<String>();
     	    
     	    
     	    lore1.add("");
     	    lore1.add("§aClique para denunciar esse jogador ");
     	    metadenunciar.setLore(lore);
     	    metadenunciar.setDisplayName("§cDENUNCIAR JOGADOR");
     	    
     	    
     	    
     	    
     	    denunciar.setItemMeta(metadenunciar);
     	    in.setItem(20, denunciar);
     	    
     	    
      //OLHAR INVENTARIO
     	    
     	    
     	    
     	    ItemStack bisbi = new ItemStack(Material.BOOK_AND_QUILL);
   	    	ItemMeta metabisbi = bisbi.getItemMeta();
   	    	ArrayList<String> lore3 = new ArrayList<String>();
   	    	lore3.add("");
   	    
   	    	lore3.add("§c*Somente jogadores §6VIPs§c,");
   	    	lore3.add("§cpodem olhar inventario de outros");
   	    	lore3.add("§cjogadores!");
   	    
   	    
   	    	metabisbi.setLore(lore3);
   	    	metabisbi.setDisplayName("§aOlhar Inventario");
   	    	bisbi.setItemMeta(metabisbi);
   	    	in.setItem(21, bisbi);
     	    
   	    
   	    	ArrayList<String> skul = new ArrayList<String>();
     	    
     	  	ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
	        SkullMeta metaskull = (SkullMeta)skull.getItemMeta();
	        
	        
	        
	        
	        if(den.getInt("Jogador." + clicked.getName()  + ".Total-De-Denuncia") < 5){
	        	skul.add("");
		        skul.add("§eEstrelas: §b" + cfg.getInt("Jogador." + clicked.getName()  + ".Pontuacao") + "x");

		        skul.add("§eDenuncias: §c" + den.getInt("Jogador." + clicked.getName()  + ".Total-De-Denuncia"));
		        skul.add("");
		        
		        skul.add("§eReputação: §a[CONFIAVEL]");
		        metaskull.setLore(skul);
		        
	        }else if(den.getInt("Jogador." + clicked.getName()  + ".Total-De-Denuncia") < 10){
	        	skul.add("");
		        skul.add("§eEstrelas: §b" + cfg.getInt("Jogador." + clicked.getName()  + ".Pontuacao") + "x");

		        skul.add("§eDenuncias: §c" + den.getInt("Jogador." + clicked.getName()  + ".Total-De-Denuncia"));
		        skul.add("");
		        
		        skul.add("§eReputação: §6[CONFIAVEL]");
		        metaskull.setLore(skul);
		        
	        }else if(den.getInt("Jogador." + clicked.getName()  + ".Total-De-Denuncia") < 100){
	        	skul.add("");
		        skul.add("§eEstrelas: §b" + cfg.getInt("Jogador." + clicked.getName()  + ".Pontuacao") + "x");

		        skul.add("§eDenuncias: §c" + den.getInt("Jogador." + clicked.getName()  + ".Total-De-Denuncia"));
		        skul.add("");
		        
		        skul.add("§eReputação: §c[NÃO-CONFIAVEL]");
		        metaskull.setLore(skul);
		        
	        }
	        
	        
	        
	        
	        
	        
	        
	        metaskull.setDisplayName("§c" + clicked.getName());
	        skull.setItemMeta(metaskull);
	        metaskull.setOwner(clicked.getName());
   	 
	       
	        
	        
	        in.setItem(4, skull);
     	 
	        
	        
	        
	        
	        
	        
	        
      	    
      	    player.openInventory(in);
      	    
      	    clicke.add(clicked);
      	    
      	    

          }
          
	 }
}
