package org.example.commands.commands.ListenerPackgae;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.example.commands.commands.Commands;

public class DeatListener implements Listener
{
    private final Commands instance;
    public DeatListener(Commands commands)
    {
        instance = commands;
    }
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event)
    {

    }
}
