package fr.triinoxys.testnms;

import org.bukkit.plugin.java.JavaPlugin;


public class TestNMSPlugin extends JavaPlugin{
    
    private TestNMSPlugin plugin;
    
    public void onEnable(){
        plugin = this;
    }

    public TestNMSPlugin getPlugin(){
        return plugin;
    }

}
