package org.example.firstplugin.fisrperst;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fisrperst extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //Server console write
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"Start Plugin"));
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"A player has joined the server"));
    }
}
