package fr.triinoxys.testnms;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class TestNMSPlugin extends JavaPlugin{
    
    private static TestNMSPlugin plugin;
    
    public void onEnable(){
        plugin = this;
        
        Bukkit.getPluginManager().registerEvents(new PlayerEvents(), this);
    }

    public static TestNMSPlugin getInstance(){
        return plugin;
    }

}
