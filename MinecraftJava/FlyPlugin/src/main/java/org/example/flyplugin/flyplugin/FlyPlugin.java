package org.example.flyplugin.flyplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.flyplugin.flyplugin.Commands.FlyCommand;

public final class FlyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand(this));
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }
}
