package org.example.commands.commands.CommandsPackage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.example.commands.configs.Configs;

public class SetMessageCommand implements CommandExecutor
{
    private final Configs plugin;
    public SetMessageCommand(Configs _plugin)
    {
        this.plugin = _plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args)
    {
        if(args.length > 0) {

            StringBuilder message = new StringBuilder();
            for(int i = 0; i<args.length;i++)
            {
                message.append(args[i] + " ");
            }

            this.plugin.getConfig().set("join-message", message.toString());
            this.plugin.saveConfig();
        }
        else
            sender.sendMessage("Please specify a message");

        return true;
    }
}
