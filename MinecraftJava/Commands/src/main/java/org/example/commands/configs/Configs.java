package org.example.commands.configs;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.commands.commands.CommandsPackage.SetMessageCommand;
import org.example.commands.commands.ListenerPackgae.JoinListener;

public final class Configs extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new JoinListener(this), this);

        getCommand("setmessage").setExecutor(new SetMessageCommand(this));
    }
}
