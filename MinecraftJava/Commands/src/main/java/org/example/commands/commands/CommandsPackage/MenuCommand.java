package org.example.commands.commands.CommandsPackage;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings)
    {
        if (commandSender instanceof Player player)
        {
            ItemStack flower = new ItemStack(Material.FLOWERING_AZALEA,2);
            player.getInventory().setItem(1,flower);

            ItemStack food = new ItemStack(Material.BEEF,7);
            ItemMeta foodMeta = food.getItemMeta();

            foodMeta.setDisplayName("Yummy Food");
            foodMeta.addEnchant(Enchantment.KNOCKBACK,1000,true);
            food.setItemMeta(foodMeta);

            player.getInventory().addItem(food);
        }

        return true;
    }
}
