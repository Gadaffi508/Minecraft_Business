package org.example.commands.commands;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.commands.commands.CommandsPackage.FreedCommand;
import org.example.commands.commands.CommandsPackage.GodCommands;

public final class Commands extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getCommand("god").setExecutor(new GodCommands());
        getCommand("feed").setExecutor(new FreedCommand());
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
