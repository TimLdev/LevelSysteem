package dev.tim.levelsystem.listener;

import dev.tim.levelsystem.LevelSystem;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeathListener implements Listener {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    @EventHandler
    public void onEntityKill(EntityDeathEvent e){
        if(e.getEntity() instanceof Zombie){
            Zombie z = (Zombie) e.getEntity();
            if(z.getKiller() instanceof Player){
                Player player = e.getEntity().getKiller();

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
        } else if(e.getEntity() instanceof Skeleton){
            Skeleton s = (Skeleton) e.getEntity();
            if(s.getKiller() instanceof Player){
                Player player = e.getEntity().getKiller();

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
        } else if(e.getEntity() instanceof Creeper){
            Creeper s = (Creeper) e.getEntity();
            if(s.getKiller() instanceof Player){
                Player player = e.getEntity().getKiller();

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
        } else if(e.getEntity() instanceof Spider){
            Spider s = (Spider) e.getEntity();
            if(s.getKiller() instanceof Player){
                Player player = e.getEntity().getKiller();

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
        } else if(e.getEntity() instanceof Enderman){
            Enderman s = (Enderman) e.getEntity();
            if(s.getKiller() instanceof Player){
                Player player = e.getEntity().getKiller();

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
        } else if(e.getEntity() instanceof EnderDragon) {
            EnderDragon s = (EnderDragon) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Guardian) {
            Guardian s = (Guardian) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Hoglin) {
            Hoglin s = (Hoglin) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof MagmaCube) {
            MagmaCube s = (MagmaCube) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Ghast) {
            Ghast s = (Ghast) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Husk) {
            Husk s = (Husk) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Piglin) {
            Piglin s = (Piglin) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Evoker) {
            Evoker s = (Evoker) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Slime) {
            Slime s = (Slime) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Zoglin) {
            Zoglin s = (Zoglin) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Endermite) {
            Endermite s = (Endermite) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Silverfish) {
            Silverfish s = (Silverfish) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Wither) {
            Wither s = (Wither) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof WitherSkeleton) {
            WitherSkeleton s = (WitherSkeleton) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof ZombieVillager) {
            ZombieVillager s = (ZombieVillager) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Witch) {
            Witch s = (Witch) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Shulker) {
            Shulker s = (Shulker) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof ElderGuardian) {
            ElderGuardian s = (ElderGuardian) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Ravager) {
            Ravager s = (Ravager) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Vindicator) {
            Vindicator s = (Vindicator) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Drowned) {
            Drowned s = (Drowned) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Pillager) {
            Pillager s = (Pillager) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Vex) {
            Vex s = (Vex) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof CaveSpider) {
            CaveSpider s = (CaveSpider) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof PiglinBrute) {
            PiglinBrute s = (PiglinBrute) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Stray) {
            Stray s = (Stray) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Blaze) {
            Blaze s = (Blaze) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof Phantom) {
            Phantom s = (Phantom) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
        } else if(e.getEntity() instanceof PigZombie) {
            PigZombie s = (PigZombie) e.getEntity();
            if (s.getKiller() instanceof Player) {
                Player player = e.getEntity().getKiller();

                int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
                int exp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp");
                int requiredExp = main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp");

                exp++;
                main.getConfig().set("Levels." + player.getUniqueId() + ".Exp", exp);
                main.saveConfig();

                if (exp >= requiredExp) {
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
