package org.example.armorstands.armorstands.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class ArmorStandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            ArmorStand armorStand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            armorStand.setHelmet(new ItemStack(Material.JUNGLE_PLANKS));
            armorStand.setInvulnerable(true);
            armorStand.setGlowing(true);
            armorStand.setItemInHand(new ItemStack(Material.DIAMOND_AXE));
            armorStand.setArms(true);
            armorStand.setBodyPose(new EulerAngle(Math.toRadians(0),Math.toRadians(0),Math.toRadians(0)));
        }

        return true;
    }
}
