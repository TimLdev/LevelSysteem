package dev.tim.levelsystem;

import dev.tim.levelsystem.command.LevelCommand;
import dev.tim.levelsystem.listener.BlockBreakListener;
import dev.tim.levelsystem.listener.EntityDeathListener;
import dev.tim.levelsystem.listener.GUIListener;
import dev.tim.levelsystem.listener.PlayerJoinListener;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

public final class LevelSystem extends JavaPlugin {

    public String prefix = "[" + ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + "Level" + ChatColor.BLUE.toString() + ChatColor.BOLD + "Systeem" + ChatColor.WHITE + "] ";

    @Override
    public void onEnable() {
        PluginManager p = getServer().getPluginManager();
        p.registerEvents(new EntityDeathListener(), this);
        p.registerEvents(new BlockBreakListener(), this);
        p.registerEvents(new PlayerJoinListener(), this);
        p.registerEvents(new GUIListener(), this);

        getCommand("level").setExecutor(new LevelCommand());

        loadConfig();
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void ScoreboardCreate(Player player){
        ScoreboardManager m = getServer().getScoreboardManager();
        Scoreboard level = m.getNewScoreboard();

        Objective title = level.registerNewObjective("title", "dummy");
        title.setDisplaySlot(DisplaySlot.SIDEBAR);
        title.setDisplayName(ChatColor.AQUA.toString() + ChatColor.BOLD + "Levels:");
        Score line = title.getScore(ChatColor.YELLOW + "----------------");
        line.setScore(3);
        Score levels = title.getScore("Level: " + ChatColor.GREEN + getConfig().getInt("Levels." + player.getUniqueId() + ".Level"));
        levels.setScore(2);
        Score exp = title.getScore("Exp: " + ChatColor.GREEN + getConfig().getInt("Levels." + player.getUniqueId() + ".Exp") + ChatColor.WHITE + " / " + ChatColor.GREEN + getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp"));
        exp.setScore(1);

        player.setScoreboard(level);

    }

    public void spawnFireworks(Location location, int amount) {
        Location loc = location;
        Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();

        fwm.setPower(2);
        fwm.addEffect(FireworkEffect.builder().withColor(Color.LIME).flicker(true).build());

        fw.setFireworkMeta(fwm);
        fw.detonate();

        for (int i = 0; i < amount; i++) {
            Firework fw2 = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
            fw2.setFireworkMeta(fwm);
        }
    }

}
