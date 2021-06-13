package com.mehmet_27.simplejoinquitmessages.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.mehmet_27.simplejoinquitmessages.Main;

public class quitEvent implements Listener{
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("messages.quit").replace("%player%", player.getName())));

    }

}
