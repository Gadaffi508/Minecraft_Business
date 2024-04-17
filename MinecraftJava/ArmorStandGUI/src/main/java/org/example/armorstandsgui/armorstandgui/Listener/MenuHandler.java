package org.example.armorstandsgui.armorstandgui.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.example.armorstandsgui.armorstandgui.ArmorStandGUI;

public class MenuHandler implements Listener {
    ArmorStandGUI ınstance;
    public MenuHandler(ArmorStandGUI ınstance) {
        this.ınstance = ınstance;
    }
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        final String MAIN_MENU = ChatColor.BLUE + " Armor Stand GUI";

        if (event.getClickedInventory().getType().equals(MAIN_MENU)) {
            switch (event.getCurrentItem().getType()) {
                case ARMOR_STAND:
                    player.sendMessage("Opened Armor Stand Creator");
                    player.closeInventory();
                    break;
                case BARRIER:
                    player.sendMessage("Closing Main Menu");
                    player.closeInventory();
                    break;
            }
        }

    }
}
