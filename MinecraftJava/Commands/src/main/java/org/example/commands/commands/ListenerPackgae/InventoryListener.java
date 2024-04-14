package org.example.commands.commands.ListenerPackgae;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryListener implements Listener
{
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event)
    {
        if(event.getWhoClicked() instanceof Player player)
        {
            var clickItem = event.getCurrentItem();

            if(clickItem.getType() == Material.FLOWERING_AZALEA)
            {
                player.sendMessage("FLOWERING_AZALEA");

                if(event.isRightClick())
                {
                    clickItem.setType(Material.DIAMOND);
                    ItemMeta diamondMeta = clickItem.getItemMeta();
                    diamondMeta.setDisplayName(ChatColor.AQUA +"DIAMOND");
                    clickItem.setItemMeta(diamondMeta);
                }

            }else if(clickItem.getType() == Material.BEEF)
            {
                player.sendMessage("BEEF");
            }else {
                player.sendMessage("NOT FLOWERING_AZALEA AND NOT BEEF");
                player.sendMessage(clickItem.getType().toString());
            }
        }
    }
}
