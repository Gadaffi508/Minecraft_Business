package org.example.commands.commands.CommandsPackage;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;

public class GodCommands implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender,Command command, String s, String[] strings)
    {
        if(sender instanceof Player)
        {
            Player p = (Player) sender;

            if(p.isInvulnerable()) // god mod online
            {
                p.setInvulnerable(false);
                p.sendMessage("§aGod mode offline");
            }
            else
            {
                p.setInvulnerable(true);
                p.sendMessage("§cGod mode online");
            }
        }

        return true;
    }
}
