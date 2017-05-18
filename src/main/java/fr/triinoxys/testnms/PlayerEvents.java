package fr.triinoxys.testnms;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;


@SuppressWarnings("unused")
public class PlayerEvents implements Listener{
    
    boolean spawn = false;
    int sneakCount = 0;
    
    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        if(sneakCount == 2){
            spawn = (spawn==true)?false:true;
            sneakCount = 1;
        }
        else sneakCount = 2;
    }
    
    @EventHandler
    public void onMove(PlayerMoveEvent e){
        if(spawn){
            CustomZombie cz = new CustomZombie("Braaaaah", e.getPlayer().getLocation());
        }
    }
    
}
