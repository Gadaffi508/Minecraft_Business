package org.example.teleportbow.teleportbow;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.teleportbow.teleportbow.commands.GiveCommand;
import org.example.teleportbow.teleportbow.listeners.TeleportBowListener;

public final class TeleportBow extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("teleport_bow").setExecutor(new GiveCommand(this));

        getServer().getPluginManager().registerEvents(new TeleportBowListener(this), this);

    }
}
