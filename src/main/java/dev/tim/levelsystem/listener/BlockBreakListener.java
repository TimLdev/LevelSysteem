package dev.tim.levelsystem.listener;

import dev.tim.levelsystem.LevelSystem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    private Material[] ores = {Material.REDSTONE_ORE, Material.NETHER_QUARTZ_ORE, Material.DEEPSLATE_GOLD_ORE, Material.GOLD_ORE, Material.NETHER_GOLD_ORE, Material.DEEPSLATE_DIAMOND_ORE, Material.DIAMOND_ORE, Material.COPPER_ORE, Material.DEEPSLATE_LAPIS_ORE, Material.IRON_ORE, Material.DEEPSLATE_COAL_ORE, Material.DEEPSLATE_EMERALD_ORE, Material.LAPIS_ORE, Material.COAL_ORE, Material.DEEPSLATE_REDSTONE_ORE, Material.DEEPSLATE_IRON_ORE, Material.EMERALD_ORE, Material.DEEPSLATE_COPPER_ORE};

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){

        Player player = e.getPlayer();

        for(Material ore : ores){
            if(ore == e.getBlock().getType()){

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if(exp >= requiredExp){
                    main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp - requiredExp);
                    main.saveConfig();
                    level++;
                    main.getConfig().set("Levels." + player.getUniqueId() + ".Level", level);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".RequiredExp", requiredExp + 5);
                    main.saveConfig();

                    player.sendTitle(ChatColor.AQUA.toString() + ChatColor.BOLD + "Level Up!",
                            ChatColor.GREEN + "Je bent nu level " + main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level") + "!",
                            20,
                            60,
                            20);

                    main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", 0);
                    main.saveConfig();

                }

                main.ScoreboardCreate(player);

            }
        }

    }

}
