package org.example.firstplugin.fisrperst.Listener;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener
{
    @EventHandler
    public void onJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();

        if(player.hasPlayedBefore()) // player check control server
        {
            event.setJoinMessage(ChatColor.GREEN +"You welcome to back server : "+ player.getDisplayName());
        }
        else
        {
            event.setJoinMessage(ChatColor.BLUE + player.getDisplayName() + " has joined the server!");

        }
    }

    @EventHandler
    public void onleave(PlayerQuitEvent event)
    {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + " has left, let's hope they come back!");
    }
}
