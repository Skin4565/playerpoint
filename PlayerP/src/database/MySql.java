package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import playerpoint.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class MySql
{
  public static Connection conexao;
  
  public static synchronized void abrirConexao()
  {
    try
    {
      String host = Main.getPlugin().getConfig().getString("MySQL.Host");
      int porta = Main.getPlugin().getConfig().getInt("MySQL.Porta");
      String usuario = Main.getPlugin().getConfig().getString("MySQL.Usuario");
      String senha = Main.getPlugin().getConfig().getString("MySQL.Senha");
      String tabela = "mc_669";
      conexao = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + tabela, usuario, senha);
    }
    catch (SQLException ex)
    {
      Bukkit.getConsoleSender().sendMessage("§cErro ao abrir a conexao MySQL! " + ex);
    }
  }
  
  public static void executarUpdate(String update)
  {
    try
    {
      conexao.createStatement().executeUpdate(update);
    }
    catch (SQLException ex)
    {
      Bukkit.getConsoleSender().sendMessage("§cErro ao dar execute update! " + ex);
    }
  }
  
  public static void execute(String update)
  {
    try
    {
      conexao.createStatement().execute(update);
    }
    catch (SQLException ex)
    {
      Bukkit.getConsoleSender().sendMessage("§cErro ao dar execute! " + ex);
    }
  }
  
  public static boolean containsPlayer(Player p)
  {
    try
    {
      return conexao.createStatement().executeQuery("SELECT * FROM `denuncias` WHERE Jogador = '" + p.getName() + "'").next();
    }
    catch (SQLException ex)
    {
      Bukkit.getConsoleSender().sendMessage("§cErro ao conter jogador MySQL! " + ex);
    }
    return false;
  }
  
  public static PreparedStatement prepareStatement(String statement)
  {
    try
    {
      return conexao.prepareStatement(statement);
    }
    catch (SQLException ex)
    {
      Bukkit.getConsoleSender().sendMessage("§cErro ao criar um statement! " + ex);
    }
    return null;
  }
}
