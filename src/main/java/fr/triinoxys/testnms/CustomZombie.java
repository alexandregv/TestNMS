/*******************************************************************************
 * Copyright (C) 2017 TriiNoxYs
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
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
        zombie.setSilent(true);
        
        Bukkit.getPluginManager().registerEvents(this, TestNMSPlugin.getInstance());
    }
    
    
    public String getName(){
        return name;
    }

    
    public void setName(String name){
        this.name = name;
    }
    
}
