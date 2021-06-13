package com.mehmet_27.simplejoinquitmessages;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.mehmet_27.simplejoinquitmessages.commands.reloadCommand;
import com.mehmet_27.simplejoinquitmessages.listeners.joinEvent;
import com.mehmet_27.simplejoinquitmessages.listeners.quitEvent;

public class Main extends JavaPlugin{

    public static Main plugin;
    public static String pluginName = "[JoinQuitMessages] ";

    @Override
    public void onEnable() {

        this.saveDefaultConfig();

        /*
         * Registering events
         */
        this.getServer().getPluginManager().registerEvents(new joinEvent(), this);
        this.getServer().getPluginManager().registerEvents(new quitEvent(), this);

        /*
         * Loading command
         */
        this.getCommand("joinquitmessages").setExecutor(new reloadCommand());

        /*
         * Loading tab completion
         */
        this.getCommand("joinquitmessages").setTabCompleter(new reloadCommand());

        plugin = this;
    }

    @Override
    public void onDisable() {

    }
}
