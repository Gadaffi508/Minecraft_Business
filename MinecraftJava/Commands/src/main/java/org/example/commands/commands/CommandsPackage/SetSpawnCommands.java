package org.example.commands.commands.CommandsPackage;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example.commands.commands.SpawnPlugin;

public class SetSpawnCommands implements CommandExecutor
{
    private final SpawnPlugin plugin;
    public SetSpawnCommands(SpawnPlugin plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s,String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            Location location = player.getLocation();

            //Save
            plugin.getConfig().set("spawn",location);

            plugin.saveConfig();

            player.sendMessage("Spawn location has been set!");
        }
        else
        {
            System.out.println("get yo ass on the server");
        }

        return true;
    }
}
