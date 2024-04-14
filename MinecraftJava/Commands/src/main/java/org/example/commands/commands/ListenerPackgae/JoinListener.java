package org.example.commands.commands.ListenerPackgae;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.example.commands.configs.Configs;

import java.util.List;

public class JoinListener implements Listener
{
    private final Configs plugin;

    public JoinListener(Configs _plugin)
    {
        this.plugin = _plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        String message = this.plugin.getConfig().getString("join-message");
        message = message.replace("%player%", event.getPlayer().getName());
        if(message != null) event.getPlayer().sendMessage(message);

        boolean feedPlayers = this.plugin.getConfig().getBoolean("feed-players");
        if (feedPlayers)
        {
            event.getPlayer().setFoodLevel(20);
        }

        List<String> foods = this.plugin.getConfig().getStringList("foods");
        event.getPlayer().sendMessage("Your favorite foods are: ");
        for(String food : foods)
        {
            event.getPlayer().sendMessage(food);
        }
    }
}
