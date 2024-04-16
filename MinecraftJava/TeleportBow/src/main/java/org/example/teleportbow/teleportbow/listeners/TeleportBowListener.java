package org.example.teleportbow.teleportbow.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.example.teleportbow.teleportbow.utility.BowUtils;

public class TeleportBowListener implements Listener {
    @EventHandler
    public void onArrowLand(ProjectileHitEvent event) {
        if (event.getEntity().getShooter() instanceof Player p) {
            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();

            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Teleport Bow")) {
                Location location = event.getEntity().getLocation();
                p.teleport(location);
                event.getEntity().remove();
                p.sendMessage("you have teleported to: " + location);
                p.playSound(p, Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1, 1);
            }
        }

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        if(true)
        {
            Player p = event.getPlayer();
            p.getInventory().addItem(BowUtils.createTeleportBow());
            p.getInventory().addItem(new ItemStack(Material.ARROW,1));

            p.sendMessage(ChatColor.AQUA+"Welcome to teleportbow, " + p.getDisplayName() + "!");
        }
    }
}
