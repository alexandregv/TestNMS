package fr.triinoxys.testnms;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import net.minecraft.server.v1_11_R1.EntityZombie;


public class MySuperZombie extends EntityZombie{
    
    public MySuperZombie(String name, Location loc){
        super(((CraftWorld) loc.getWorld()).getHandle());
        this.setPosition(loc.getX(), loc.getY(), loc.getZ());
    }
    
}
