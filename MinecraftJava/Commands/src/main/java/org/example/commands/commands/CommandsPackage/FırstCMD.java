package org.example.commands.commands.CommandsPackage;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FırstCMD extends JavaPlugin
{
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
