package org.example.firstplugin.fisrperst;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fisrperst extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"Start Plugin"));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
