package org.example.commands.commands.CommandsPackage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FreedCommand implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if(commandSender instanceof Player )
        {
            Player p = (Player) commandSender;

            p.setFoodLevel(20);
            p.sendMessage(ChatColor.YELLOW + "Food set to max. Bon appetit");
        }

        return true;
    }
}
