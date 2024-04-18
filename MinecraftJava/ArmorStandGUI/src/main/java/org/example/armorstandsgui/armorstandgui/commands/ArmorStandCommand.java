package org.example.armorstandsgui.armorstandgui.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example.armorstandsgui.armorstandgui.ArmorStandGUI;

import java.util.ArrayList;

public class ArmorStandCommand implements CommandExecutor {
    ArmorStandGUI ınstance;
    public ArmorStandCommand(ArmorStandGUI ınstance) {
        this.ınstance = ınstance;
    }
    @Override
    public boolean onCommand(CommandSender commandSender,Command command,String s,String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            ınstance.openMainMenu(player);
        }

        return true;
    }
}
