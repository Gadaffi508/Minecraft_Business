package org.example.commands.commands.CommandsPackage;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example.commands.commands.SpawnPlugin;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor
{
    private final SpawnPlugin plugin;
    public SpawnCommand(SpawnPlugin plugin)
    {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;

            Location location = plugin.getConfig().getLocation("spawn");

            if(location != null)
            {
                player.teleport(location);
                player.sendMessage("Teleported to spawn location");
            }
            else
            {
                System.out.println("No spawn location found");
            }
        }

        return true;
    }
}
