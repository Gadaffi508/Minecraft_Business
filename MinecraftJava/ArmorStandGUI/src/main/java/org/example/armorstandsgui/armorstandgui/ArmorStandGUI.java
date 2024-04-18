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

    public void openCreateMenu(Player player) {
        Inventory create_menu = Bukkit.createInventory(player, 9, ChatColor.BLUE + "Create Armor Stand");

        ItemStack arms = new ItemStack(Material.ARMOR_STAND);
        ItemStack glow = new ItemStack(Material.BEACON);
        ItemStack armor = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack base = new ItemStack(Material.STONE_SLAB);
        ItemStack complete = new ItemStack(Material.GREEN_WOOL);
        ItemStack cancel = new ItemStack(Material.RED_WOOL);

        create_menu.setItem(0,arms);
        create_menu.setItem(1,glow);
        create_menu.setItem(2,armor);
        create_menu.setItem(3,base);
        create_menu.setItem(7,complete);
        create_menu.setItem(8,cancel);

        player.openInventory(create_menu);
    }

    public void openConfirmMenu(Player player,Material options) {
        Inventory confirm_menu = Bukkit.createInventory(player, 36, ChatColor.BLUE + "Confirm Options");

        ItemStack option_item = new ItemStack(options);
        ItemMeta option_meta = option_item.getItemMeta();

        if(options == Material.ARMOR_STAND)
        {
            option_meta.setDisplayName(ChatColor.YELLOW + "Give Arms ?");
            option_item.setItemMeta(option_meta);
        }
        else if(options == Material.BEACON)
        {
            option_meta.setDisplayName(ChatColor.YELLOW + "Add Glow ?");
            option_item.setItemMeta(option_meta);
        }
        else if(options == Material.STONE_SLAB)
        {
            option_meta.setDisplayName(ChatColor.YELLOW + "Add Base ?");
            option_item.setItemMeta(option_meta);
        }

        ItemStack yes = ItemCreated(Material.GREEN_WOOL,ChatColor.GREEN,"Yes");
        ItemStack no = ItemCreated(Material.RED_WOOL,ChatColor.RED,"No");

        confirm_menu.setItem(13,option_item);
        confirm_menu.setItem(21,yes);
        confirm_menu.setItem(23,no);

        player.openInventory(confirm_menu);
    }
    ItemStack ItemCreated(Material _material,ChatColor color,String messagge)
    {
        ItemStack item = new ItemStack(_material);
        ItemMeta item_meta = item.getItemMeta();
        item_meta.setDisplayName(color + messagge);
        item.setItemMeta(item_meta);
        return item;
    }
}
