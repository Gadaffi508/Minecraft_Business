package org.example.flyplugin.flyplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example.flyplugin.flyplugin.FlyPlugin;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {
    private FlyPlugin Instance;
    public FlyCommand(FlyPlugin Instance)
    {
        this.Instance = Instance;
    }
    private ArrayList<Player> list_of_flying_players = new ArrayList<Player>();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s,String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            if(strings.length == 0)
            {
                FlyMethod(player);
            }
            else if(strings.length == 1)
            {
                if(player.hasPermission("flying.others"))
                {
                    Player target = Bukkit.getPlayer(strings[0]);
                    FlyMethod(target);
                }
                else {
                    player.sendMessage("You don't have permission to fly others");
                }
            }
        }

        return true;
    }

    private void FlyMethod(Player player)
    {
        if(player.hasPermission("flyplugin.fly"))
        {
            if(list_of_flying_players.contains(player))
            {
                player.setAllowFlight(false);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',Instance.getConfig().getString("off-message")));
                list_of_flying_players.remove(player);
            }
            else if(!list_of_flying_players.contains(player))
            {
                list_of_flying_players.add(player);
                player.setAllowFlight(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',Instance.getConfig().getString("on-message")));
            }
        }
    }
}
