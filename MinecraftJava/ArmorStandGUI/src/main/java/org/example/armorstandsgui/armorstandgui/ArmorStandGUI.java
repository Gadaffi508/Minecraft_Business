package org.example.armorstandsgui.armorstandgui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.armorstandsgui.armorstandgui.Listener.MenuHandler;
import org.example.armorstandsgui.armorstandgui.commands.ArmorStandCommand;

import java.util.ArrayList;

public final class ArmorStandGUI extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("armor-stand").setExecutor(new ArmorStandCommand(this));
        getServer().getPluginManager().registerEvents(new MenuHandler(this), this);
    }

    public void openMainMenu(Player player)
    {
        Inventory main_menu = Bukkit.createInventory(player,9, ChatColor.BLUE +" Armor Stand GUI");

        ItemStack create = new ItemStack(Material.ARMOR_STAND);
        ItemMeta create_meta = create.getItemMeta();
        create_meta.setDisplayName(ChatColor.BLUE +"Create");
        ArrayList<String> create_lore = new ArrayList<>();
        create_lore.add(ChatColor.DARK_PURPLE +"Create an Armor Stand");
        create_meta.setLore(create_lore);
        create.setItemMeta(create_meta);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta close_meta = close.getItemMeta();
        close_meta.setDisplayName(ChatColor.RED + "Close");
        close.setItemMeta(close_meta);

        main_menu.setItem(0,create);
        main_menu.setItem(8,close);

        player.openInventory(main_menu);
    }
}
