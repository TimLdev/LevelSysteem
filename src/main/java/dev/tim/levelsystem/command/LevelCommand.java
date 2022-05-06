package dev.tim.levelsystem.command;

import dev.tim.levelsystem.LevelSystem;
import dev.tim.levelsystem.gui.LevelGUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LevelCommand implements CommandExecutor {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("reload")){
                    if(player.hasPermission("level.reload")){
                        main.reloadConfig();
                        player.sendMessage(main.prefix + ChatColor.GREEN + "Config is succesvol gereload!");
                        for(Player target : Bukkit.getOnlinePlayers()){
                            main.ScoreboardCreate(target);
                        }
                    } else {
                        player.sendMessage(main.prefix + ChatColor.RED + "Je hebt geen permissie om dit command te kunnen gebruiken!");
                    }
                } else{
                    player.sendMessage(main.prefix + ChatColor.RED + "Ongeldig gebruik! Gebruik: /level of /level reload");
                }
            } else{
                new LevelGUI(player);
            }
        }

        return false;
    }
}
