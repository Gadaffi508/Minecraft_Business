package org.example.armorstandsgui.armorstandgui.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
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

        final String MAIN_MENU_TITLE = ChatColor.BLUE + " Armor Stand GUI";
        final String CREATE_MENU_TITLE = ChatColor.BLUE + "Create Armor Stand";

        if (event.getView().getTitle().equals(MAIN_MENU_TITLE)) {
            if (event.getCurrentItem() != null && event.getCurrentItem().getType() != null) {
                switch (event.getCurrentItem().getType()) {
                    case ARMOR_STAND:
                        player.sendMessage("Opened Armor Stand Creator");
                        ınstance.openCreateMenu(player);
                        break;
                    case BARRIER:
                        player.sendMessage("Closing Main Menu");
                        player.closeInventory();
                        break;
                    default:
                        break;
                }
            }
            event.setCancelled(true);
        }
        else if (event.getView().getTitle().equals(CREATE_MENU_TITLE)) {
            if (event.getCurrentItem() != null && event.getCurrentItem().getType() != null) {
                switch (event.getCurrentItem().getType()) {
                    case ARMOR_STAND:
                        player.sendMessage("Add Arms ?");
                        ınstance.openConfirmMenu(player, Material.ARMOR_STAND);
                        break;
                    case BEACON:
                        player.sendMessage("Add Glow ?");
                        ınstance.openConfirmMenu(player, Material.BEACON);
                        break;
                    case STONE_SLAB:
                        player.sendMessage("Add Base ?");
                        ınstance.openConfirmMenu(player, Material.STONE_SLAB);
                        break;
                    case LEATHER_CHESTPLATE:
                        player.sendMessage("Choose Armor ?");
                        break;
                    default:
                        break;
                }
            }
            event.setCancelled(true);
        }
    }

}
