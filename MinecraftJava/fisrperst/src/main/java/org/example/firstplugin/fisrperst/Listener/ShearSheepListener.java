package org.example.firstplugin.fisrperst.Listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener
{

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event)
    {
        Player player = event.getPlayer();
        Entity entity = event.getEntity();

        if(entity.getType() == EntityType.SHEEP)
        {
            event.setCancelled(true);
            player.sendMessage("This is a sheep");
        }
        else {
            player.sendMessage("This is not a sheep");
        }
    }

}
