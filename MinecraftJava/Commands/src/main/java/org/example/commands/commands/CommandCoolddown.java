package org.example.commands.commands;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.commands.commands.CommandsPackage.CommandFart;

public class CommandCoolddown extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getCommand("fart").setExecutor(new CommandFart());
    }
}
