package org.example.armorstandsgui.armorstandgui.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.example.armorstandsgui.armorstandgui.ArmorStandGUI;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ArmorStandCommand implements CommandExecutor {
    ArmorStandGUI ınstance;
    public ArmorStandCommand(ArmorStandGUI ınstance) {
        this.ınstance = ınstance;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            ınstance.openMainMenu(player);
        }

        return true;
    }
}
