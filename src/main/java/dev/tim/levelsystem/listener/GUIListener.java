package dev.tim.levelsystem.listener;

import dev.tim.levelsystem.LevelSystem;
import dev.tim.levelsystem.gui.LevelGUI;
import dev.tim.levelsystem.gui.LevelRewardsGUI;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIListener implements Listener {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){

        if(e.getView().getTitle().equals(ChatColor.LIGHT_PURPLE + "Levels") && e.getCurrentItem() != null){
            e.setCancelled(true);

            Player player = (Player) e.getWhoClicked();

            switch(e.getRawSlot()){
                case 15:
                    new LevelRewardsGUI(player);
                    break;
                case 22:
                    player.closeInventory();
                    break;
                default:
                    return;
            }

        } else if(e.getView().getTitle().equals(ChatColor.YELLOW + "Level Beloningen") && e.getCurrentItem() != null){
            e.setCancelled(true);

            Player player = (Player) e.getWhoClicked();
            int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
            boolean claimedLevel5 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel5");
            boolean claimedLevel10 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel10");
            boolean claimedLevel15 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel15");
            boolean claimedLevel20 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel20");
            boolean claimedLevel25 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel25");
            boolean claimedLevel30 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel30");
            boolean claimedLevel35 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel35");

            if(e.getRawSlot() == 22){
                new LevelGUI(player);
            }

            if(e.getRawSlot() == 10){
                if(level >= 5 && claimedLevel5 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 5 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 16));
                    main.spawnFireworks(player.getLocation(), 1);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel5", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 5 && claimedLevel5 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 5!");
                    // speler is deze level nog niet
                }
            }

            if(e.getRawSlot() == 11){
                if(level >= 10 && claimedLevel10 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 10 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND, 32));
                    main.spawnFireworks(player.getLocation(), 2);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel10", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 10 && claimedLevel10 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 10!");
                    // speler is deze level nog niet
                }
            }

            if(e.getRawSlot() == 12){
                if(level >= 15 && claimedLevel15 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 15 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.EMERALD, 64));
                    main.spawnFireworks(player.getLocation(), 3);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel15", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 15 && claimedLevel15 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 15!");
                    // speler is deze level nog niet
                }
            }

            if(e.getRawSlot() == 13){
                if(level >= 20 && claimedLevel20 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 20 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.NETHERITE_INGOT, 5));
                    main.spawnFireworks(player.getLocation(), 4);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel20", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 20 && claimedLevel20 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 20!");
                    // speler is deze level nog niet
                }
            }

            if(e.getRawSlot() == 14){
                if(level >= 25 && claimedLevel25 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 25 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.TOTEM_OF_UNDYING, 1));
                    main.spawnFireworks(player.getLocation(), 5);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel25", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 25 && claimedLevel25 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 25!");
                    // speler is deze level nog niet
                }
            }

            if(e.getRawSlot() == 15){
                if(level >= 30 && claimedLevel30 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 30 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.TRIDENT, 1));
                    main.spawnFireworks(player.getLocation(), 6);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel30", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 30 && claimedLevel30 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 30!");
                    // speler is deze level nog niet
                }
            }

            if(e.getRawSlot() == 16){
                if(level >= 35 && claimedLevel35 == false){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.GREEN + "Level 35 beloning ontvangen!");
                    player.getInventory().addItem(new ItemStack(Material.ELYTRA, 1));
                    main.spawnFireworks(player.getLocation(), 7);
                    main.getConfig().set("Levels." + player.getUniqueId() + ".ClaimedLevel35", true);
                    main.saveConfig();
                    // ontvang beloning
                } else if(level >= 35 && claimedLevel35 == true){
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je hebt deze beloning al ontvangen!");
                    // beloning al ontvangen
                } else {
                    player.closeInventory();
                    player.sendMessage(main.prefix + ChatColor.RED + "Je bent nog geen level 35!");
                    // speler is deze level nog niet
                }
            }

        }

    }

}

