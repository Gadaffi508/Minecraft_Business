package org.example.commands.commands;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.commands.commands.CommandsPackage.SetSpawnCommands;
import org.example.commands.commands.CommandsPackage.SpawnCommand;
import org.example.commands.commands.ListenerPackgae.SpawnListener;

public class SpawnPlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("setspawn").setExecutor(new SetSpawnCommands(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getServer().getPluginManager().registerEvents(new SpawnListener(this),this);
    }
}
