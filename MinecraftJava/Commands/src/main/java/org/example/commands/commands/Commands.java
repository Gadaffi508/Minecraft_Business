package org.example.commands.commands;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.commands.commands.CommandsPackage.FartCommand;
import org.example.commands.commands.CommandsPackage.FreedCommand;
import org.example.commands.commands.CommandsPackage.GodCommands;
import org.example.commands.commands.ListenerPackgae.BlockBreakListener;
import org.example.commands.commands.ListenerPackgae.DeatListener;

public final class Commands extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getCommand("god").setExecutor(new GodCommands());
        getCommand("feed").setExecutor(new FreedCommand());

        getServer().getPluginManager().registerEvents(new DeatListener(this), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);

        getServer().getPluginManager().registerEvents((Listener) new FartCommand(), this);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
