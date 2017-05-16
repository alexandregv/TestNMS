package fr.triinoxys.testnms;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;


@SuppressWarnings("unused")
public class PlayerEvents implements Listener{
    
    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        CustomZombie cz = new CustomZombie("Braaaaah", e.getPlayer().getLocation().add(0.5, 1, 0.5));
    }
    
}
