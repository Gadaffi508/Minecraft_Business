package org.example.entities.entities;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.entities.entities.Listenener.MoveEvent;

public final class Entities extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new MoveEvent(), this);

    }
}
