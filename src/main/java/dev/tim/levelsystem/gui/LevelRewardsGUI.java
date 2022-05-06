package dev.tim.levelsystem.gui;

import dev.tim.levelsystem.LevelSystem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class LevelRewardsGUI {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    public LevelRewardsGUI(Player player){

        int level = main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level");
        boolean claimedLevel5 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel5");
        boolean claimedLevel10 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel10");
        boolean claimedLevel15 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel15");
        boolean claimedLevel20 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel20");
        boolean claimedLevel25 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel25");
        boolean claimedLevel30 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel30");
        boolean claimedLevel35 = main.getConfig().getBoolean("Levels." + player.getUniqueId() + ".ClaimedLevel35");

        Inventory gui = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Level Beloningen");

        // FRAME
        ItemStack frame = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        for(int i : new int[]{0,1,2,3,4,5,6,7,8,9,17,18,19,20,21,23,24,25,26}){
            gui.setItem(i, frame);
        }

        ItemStack close = new ItemStack(Material.ARROW);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(ChatColor.WHITE + "Terug");
        close.setItemMeta(closeMeta);
        gui.setItem(22, close);

        if(level >= 5 && claimedLevel5 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 5 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(10, level5);
            // claim reward
        } else if(level >= 5 && claimedLevel5 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 5 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(10, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 5 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 5!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(10, level5);
            // speler is deze level nog niet
        }

        if(level >= 10 && claimedLevel10 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 10 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(11, level5);
            // claim reward
        } else if(level >= 10 && claimedLevel10 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 10 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(11, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 10 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 10!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(11, level5);
            // speler is deze level nog niet
        }

        if(level >= 15 && claimedLevel15 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 15 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(12, level5);
            // claim reward
        } else if(level >= 15 && claimedLevel15 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 15 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(12, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 15 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 15!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(12, level5);
            // speler is deze level nog niet
        }

        if(level >= 20 && claimedLevel20 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 20 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(13, level5);
            // claim reward
        } else if(level >= 20 && claimedLevel20 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 20 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(13, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 20 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 20!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(13, level5);
            // speler is deze level nog niet
        }

        if(level >= 25 && claimedLevel25 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 25 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(14, level5);
            // claim reward
        } else if(level >= 25 && claimedLevel25 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 25 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(14, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 25 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 25!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(14, level5);
            // speler is deze level nog niet
        }

        if(level >= 30 && claimedLevel30 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 30 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(15, level5);
            // claim reward
        } else if(level >= 30 && claimedLevel30 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 30 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(15, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 30 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 30!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(15, level5);
            // speler is deze level nog niet
        }

        if(level >= 35 && claimedLevel35 == false){
            ItemStack level5 = new ItemStack(Material.DIAMOND);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level 35 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Klik om beloning te ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(16, level5);
            // claim reward
        } else if(level >= 35 && claimedLevel35 == true){
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 35 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je hebt deze beloning al ontvangen!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(16, level5);
            // reward al geclaimed
        } else {
            ItemStack level5 = new ItemStack(Material.COAL);
            ItemMeta level5Meta = level5.getItemMeta();
            level5Meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD + "Level 35 Beloning");
            level5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Je bent nog geen level 35!"));
            level5.setItemMeta(level5Meta);
            gui.setItem(16, level5);
            // speler is deze level nog niet
        }


        player.openInventory(gui);

    }

}
