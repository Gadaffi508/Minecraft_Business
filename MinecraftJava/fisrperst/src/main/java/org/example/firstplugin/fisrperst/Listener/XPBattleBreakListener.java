package org.example.firstplugin.fisrperst.Listener;

import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ExpBottleEvent;

public class XPBattleBreakListener implements Listener
{
    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent event)
    {

        //item effect control
        event.setShowEffect(false);

    }
}
