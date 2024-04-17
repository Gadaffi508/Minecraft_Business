package org.example.armorstands.armorstands;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.armorstands.armorstands.commands.ArmorStandCommand;

public final class ArmorStands extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("armorstand").setExecutor(new ArmorStandCommand());
    }
}
