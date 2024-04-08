package org.example.commands.commands.ListenerPackgae;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.example.commands.commands.SpawnPlugin;

public class SpawnListener implements Listener
{
    private final SpawnPlugin plugin;
    public SpawnListener(SpawnPlugin plugin)
    {
        this.plugin = plugin;
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();

        if(!player.hasPlayedBefore())
        {
            Location location = plugin.getConfig().getLocation("spawn");
            if(location != null)
            {
                player.teleport(location);
            }
        }
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent player)
    {
        Location location = plugin.getConfig().getLocation("spawn");
        if(location != null)
        {
            player.setRespawnLocation(location);
        }
    }
}
