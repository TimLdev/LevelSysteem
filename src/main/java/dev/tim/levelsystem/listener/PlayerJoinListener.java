package dev.tim.levelsystem.listener;

import dev.tim.levelsystem.LevelSystem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        if(!(main.getConfig().contains("Levels." + player.getUniqueId()))){
            main.getConfig().set("Levels." + player.getUniqueId() + ".Level", 0);
            main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", 0);
            main.getConfig().set("Levels." + player.getUniqueId() + ".RequiredExp", 5);
        }

        main.ScoreboardCreate(player);

    }

}
