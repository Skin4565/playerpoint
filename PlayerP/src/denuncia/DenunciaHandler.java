package denuncia;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.apache.commons.lang.time.DateFormatUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scheduler.BukkitRunnable;

import StarPointClass.GuiMatrix;
import database.MySql;
import playerpoint.Main;


public class DenunciaHandler implements Listener{

     
	@EventHandler 
	
	public void Tory(InventoryClickEvent e){
		
		   if (e.getInventory().getTitle().equalsIgnoreCase("Denunciar"))
		    {
		
			   e.setCancelled(true);
			      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
			        return;
			      }
			      
	      
	      
			
	      Player p = (Player) e.getWhoClicked();
			
		Player click = GuiMatrix.clicke.get(GuiMatrix.clicke.size() - 1);
			 
			 
			 
			
				
			
			if(e.getSlot() == 0 && (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aFly"))){

				
				 File d = new File(Main.getPlugin().getDataFolder(), "denuncia.yml");
			     FileConfiguration den = YamlConfiguration.loadConfiguration(d);
				
				
				
					
				for(Player op : Bukkit.getOnlinePlayers()){
					
					if(op.isOp() && (op.hasPermission("denuncia.view"))){
						op.sendMessage("O jogador " + p.getName() + " denunciou " + click.getName() + " por uso de Fly");
					}
				}
				
				p.closeInventory();	
				p.sendMessage("§cO jogador foi denunciado!");
				
				String timeStamp = new SimpleDateFormat("dd:MM:yyyy | HH:mm:ss").format(Calendar.getInstance().getTime());
		
				
				if (Main.getPlugin().getConfig().getBoolean("MySQL.ennable"))
			    {
				
				
				  MySql.executarUpdate("INSERT INTO `denuncias`(`Jogador`, `Denuncia`, `Data`) VALUES ('" + click.getName() + "', 'Fly', '" + timeStamp + "')");
			    

			    
			    
			    
			    
			    
			    
			    }else{
				
				den.set("Jogador." + click.getName() + ".Denuncias",  "Fly");
				den.set("Jogador." + click.getName() + ".Data", timeStamp);
				
				den.set("Jogador." + click.getName() + ".Total-De-Denuncia", Integer.valueOf(den.getInt("Jogador." + click.getName() + ".Total-De-Denuncia") + 1));
				
			    
				try
		          {
		            den.save(d);
		          }
		          catch (IOException e1)
		          {
		            Bukkit.getConsoleSender().sendMessage("Erro ao atualizar pontuacao de jogador! " + e1);
		          }
		          
				
				
				
			    }
				
			
				
			}
				
				
				
				
			}
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


