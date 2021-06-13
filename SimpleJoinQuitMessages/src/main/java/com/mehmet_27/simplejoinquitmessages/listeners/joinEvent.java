package com.mehmet_27.simplejoinquitmessages.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.mehmet_27.simplejoinquitmessages.Main;

public class joinEvent implements Listener{
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("messages.join").replace("%player%", player.getName())));
    }

}
