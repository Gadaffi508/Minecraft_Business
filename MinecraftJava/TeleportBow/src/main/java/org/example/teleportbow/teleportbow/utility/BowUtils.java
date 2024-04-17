package org.example.teleportbow.teleportbow.utility;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.example.teleportbow.teleportbow.TeleportBow;

import java.util.ArrayList;
import java.util.List;

public class BowUtils {
    private final TeleportBow ınstance;

    public BowUtils(TeleportBow ınstance) {
        this.ınstance = ınstance;
    }

    public ItemStack createTeleportBow() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ınstance.getConfig().getString("bow-name"));
        List<String> lore = new ArrayList<>();
        lore.add(ınstance.getConfig().getString("bow-description"));
        bowMeta.setLore(lore);
        bowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        bow.setItemMeta(bowMeta);
        return bow;
    }
}
