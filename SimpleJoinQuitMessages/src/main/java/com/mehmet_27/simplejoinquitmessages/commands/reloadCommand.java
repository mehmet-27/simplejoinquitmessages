package com.mehmet_27.simplejoinquitmessages.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import com.mehmet_27.simplejoinquitmessages.Main;


public class reloadCommand implements CommandExecutor, TabCompleter {

    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {

        if (str.equalsIgnoreCase("joinquitmessages")) {
            if (sender instanceof Player) {
                if (sender.hasPermission("joinquitmessages.admin")) {
                    /*
                     * Reload command
                     */
                    if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
                        Main.plugin.reloadConfig();
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eJoinQuitMessages &7»") + " " + ChatColor.translateAlternateColorCodes('&', "&aConfiguration reloaded."));
                    }
                }
                else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eJoinQuitMessages &7»") + " " + ChatColor.RED + "You do not have permission to use this command.");
                }
            }
            else {
                /*
                 * Reload command
                 */
                if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
                    Main.plugin.reloadConfig();
                    sender.sendMessage(Main.pluginName + " " + ChatColor.translateAlternateColorCodes('&', "&aConfiguration reloaded."));
                }
            }
        }
        return false;
    }
    /*
     *
     */
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 1){
            List<String> cmdargs = new ArrayList<>();
            cmdargs.add("reload");

            return cmdargs;
        }
        return null;
    }
}
