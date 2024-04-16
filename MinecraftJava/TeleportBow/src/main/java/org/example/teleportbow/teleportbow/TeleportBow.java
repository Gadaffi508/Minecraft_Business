package org.example.teleportbow.teleportbow;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.teleportbow.teleportbow.commands.GiveCommand;

public final class TeleportBow extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("teleport_bow").setExecutor(new GiveCommand());

    }
}
