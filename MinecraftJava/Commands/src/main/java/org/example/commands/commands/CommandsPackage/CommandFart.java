package org.example.commands.commands.CommandsPackage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class CommandFart implements CommandExecutor {
    private final HashMap<UUID,Long> cooldowns;

    public CommandFart() {
        this.cooldowns = new HashMap<>();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args)
    {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;

            if(!this.cooldowns.containsKey(player.getUniqueId()) || System.currentTimeMillis() - cooldowns.get(player.getUniqueId()) >= 1000)
            {
                this.cooldowns.put(player.getUniqueId(), System.currentTimeMillis());
                player.sendMessage("You farted Oopsies");
            }
            else {
                player.sendMessage("You can only fart once per second" + (1000 - System.currentTimeMillis() - cooldowns.get(player.getUniqueId())) + "ms");
            }
        }
        return true;
    }
}
