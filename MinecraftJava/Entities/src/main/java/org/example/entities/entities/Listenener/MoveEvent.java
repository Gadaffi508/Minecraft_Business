package org.example.entities.entities.Listenener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEvent implements Listener
{
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event)
    {
        Entity entitiy = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"),218,80,154), EntityType.SKELETON);

        entitiy.setGravity(false);
        entitiy.setGlowing(true);
        entitiy.setCustomName("Daddy Skleton");
        entitiy.setCustomNameVisible(true);
        entitiy.setInvulnerable(true);
    }
}
