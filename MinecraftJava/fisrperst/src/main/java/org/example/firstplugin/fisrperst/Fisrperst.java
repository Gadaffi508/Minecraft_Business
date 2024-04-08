package org.example.firstplugin.fisrperst;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.firstplugin.fisrperst.Listener.JoinLeaveListener;
import org.example.firstplugin.fisrperst.Listener.ShearSheepListener;
import org.example.firstplugin.fisrperst.Listener.XPBattleBreakListener;

public final class Fisrperst extends JavaPlugin implements Listener
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        //Server console write
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"Start Plugin"));
        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new XPBattleBreakListener(),this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(),this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(),this);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        //player join game for event
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"A player has joined the server"));
        event.setJoinMessage("Welcome to the server you big dummy!");
    }

    @EventHandler
    public void onleavedBed(PlayerBedLeaveEvent event)
    {
        //player sleep bed for event
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"A player has left the server"));
        //get player data
        Player player = event.getPlayer();
        player.sendMessage("You left a bed!! Dork.!");
    }
}
