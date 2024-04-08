package org.example.commands.commands.CommandsPackage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class TestCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            if(player.hasPermission("permissions.test"))
            {
                player.sendMessage("wow you have so much swag");
            }
            else
            {
                player.sendMessage("You do not have permission to use this command");
            }
        }
        return true;
    }
}
