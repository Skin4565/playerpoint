package playerpoint;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import ChatEvent.ChatHandler;
import StarPointClass.AvaliarHandler;
import StarPointClass.GuiMatrix;
import StarPointClass.JoinEvent;
import StarPointClass.OpenValiar;
import comandos.Conquistas;
import comandos.PontosComando;
import comandos.listerner.Util;
import database.MySql;
import denuncia.DenunciaGui;
import denuncia.DenunciaHandler;
import net.milkbowl.vault.economy.Economy;


public class Main extends JavaPlugin implements Listener {


	private FileConfiguration special;

	
	
	public void onEnable(){
		
	
		
		
		
		Bukkit.getServer().getPluginManager().registerEvents(new AvaliarHandler(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new GuiMatrix(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new OpenValiar(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Util(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new DenunciaGui(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new DenunciaHandler(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ChatHandler(), this);
		saveDefaultConfig();
		getCommand("pontos").setExecutor(new PontosComando());
		getCommand("conquistas").setExecutor(new Conquistas());
		setupEconomy();
		
		
		if (getConfig().getBoolean("MySQL.ennable"))
	    {
		
		
		 MySql.abrirConexao();
	      MySql.execute("CREATE TABLE IF NOT EXISTS `denuncias` (Jogador varchar(17), Denuncia varchar(250), Data varchar(255))");
		
	    }else{
	    	
	    	Bukkit.getConsoleSender().sendMessage("§cMySQL nao habilitado. Salvando aquivos em Yaml");
	    	
	    }
		
		
	}
	
	
	 public static Main getPlugin()
	  {
	    return (Main)getPlugin(Main.class);
	  }
	 

	  public static Economy economy = null;
	 
	  private boolean setupEconomy()
	  {
	    if (getServer().getPluginManager().getPlugin("Vault") == null) {
	      return false;
	    }
	    RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
	    if (rsp == null) {
	      return false;
	    }
	    economy = (Economy)rsp.getProvider();
	    return economy != null;
	  }
	  
	  
	  
	  
	  
	  
	
	  
	  
	  
	  
	
	

}