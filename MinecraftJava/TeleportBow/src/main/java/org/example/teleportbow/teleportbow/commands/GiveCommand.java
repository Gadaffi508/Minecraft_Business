package org.example.teleportbow.teleportbow.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.example.teleportbow.teleportbow.utility.BowUtils;
import org.jetbrains.annotations.NotNull;

public class GiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender instanceof Player p) {
            if (p.hasPermission("tpbow.givebow")) {
                if (args.length == 0) {
                    ItemMethod(p, "your self");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target == null) {
                        p.sendMessage(ChatColor.RED + "This player is not online!");

                        return true;
                    }

                    ItemMethod(target, "been ");
                }
            } else {
                p.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
            }
        }

        return true;
    }

    private void ItemMethod(Player player, String message) {
        ItemStack bow = BowUtils.createTeleportBow();
        player.getInventory().addItem(bow);
        player.getInventory().addItem(new ItemStack(Material.ARROW, 1));

        player.sendMessage(ChatColor.GREEN + "you have given " + message + " a teleport bow");
    }
}
