package fr.triinoxys.testnms;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;


public class CustomZombie implements Listener{
    
    private String name;
    private Entity entity;
    
    public CustomZombie(String name, Location loc){
        this.name = name;
        this.entity = loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
        
        Zombie zombie = (Zombie) entity;
        zombie.setAI(false);
        zombie.setCanPickupItems(false);
        zombie.setCollidable(false);
        zombie.setBaby(true);
        zombie.setCustomName(name);
        zombie.setCustomNameVisible(true);
        zombie.getEquipment().setHelmet(new ItemStack(Material.GOLD_HELMET));
        zombie.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        zombie.getEquipment().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
        zombie.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
        
        Bukkit.getPluginManager().registerEvents(this, TestNMSPlugin.getInstance());
    }
    
    
    public String getName(){
        return name;
    }

    
    public void setName(String name){
        this.name = name;
    }
    
}
