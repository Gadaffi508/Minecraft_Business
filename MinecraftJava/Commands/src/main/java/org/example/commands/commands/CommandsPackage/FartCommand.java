package org.example.commands.commands.CommandsPackage;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FartCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender,Command command, String s, String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            if(strings.length == 0)
            {
                player.sendMessage("You are so nasty.");
                player.setHealth(0);
            }
            else
            {
                String playerName = strings[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null)
                {
                    player.sendMessage("This player is not online.");
                }
                else
                {
                    target.sendMessage("You are so nasty." + target.getDisplayName());
                    target.setHealth(0);
                }
            }
        }

        return true;
    }
}
