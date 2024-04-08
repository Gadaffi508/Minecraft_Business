package org.example.commands.commands.CommandsPackage;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class FırstCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(command.getName().equalsIgnoreCase("die"))
        {
            if (sender instanceof Player)
            {
                Player p = (Player) sender;
                p.setHealth(0);
                p.sendMessage(ChatColor.RED + "You have died!");
            }
            else if(sender instanceof ConsoleCommandSender)
            {
                System.out.println("The command was run by the console!");
            }
            else if(sender instanceof BlockCommandSender)
            {
                System.out.println("The command was run by a command block!");
            }
        }
        return true;
    }
}
