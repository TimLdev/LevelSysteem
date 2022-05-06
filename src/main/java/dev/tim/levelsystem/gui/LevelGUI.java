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

public class LevelGUI {

    LevelSystem main = LevelSystem.getPlugin(LevelSystem.class);

    public LevelGUI(Player player){

        Inventory gui = Bukkit.createInventory(null, 27, ChatColor.LIGHT_PURPLE + "Levels");

        ItemStack myLevel = new ItemStack(Material.DIAMOND);
        ItemMeta levelMeta = myLevel.getItemMeta();
        levelMeta.setDisplayName(ChatColor.AQUA.toString() + ChatColor.BOLD + player.getDisplayName());
        levelMeta.setLore(Arrays.asList(ChatColor.WHITE + "Level: " + ChatColor.GREEN + main.getConfig().getInt("Levels." + player.getUniqueId() + ".Level"), ChatColor.WHITE + "Exp: " + ChatColor.GREEN + main.getConfig().getInt("Levels." + player.getUniqueId() + ".Exp") + ChatColor.WHITE + " / " + ChatColor.GREEN + main.getConfig().getInt("Levels." + player.getUniqueId() + ".RequiredExp")));
        myLevel.setItemMeta(levelMeta);
        gui.setItem(11, myLevel);

        ItemStack levelRewards = new ItemStack(Material.CHEST);
        ItemMeta rewardsMeta = levelRewards.getItemMeta();
        rewardsMeta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD + "Level Beloningen");
        levelRewards.setItemMeta(rewardsMeta);
        gui.setItem(15, levelRewards);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(ChatColor.DARK_RED + "Sluiten");
        close.setItemMeta(closeMeta);
        gui.setItem(22, close);

        // FRAME
        ItemStack frame = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        for(int i : new int[]{0,1,2,3,4,5,6,7,8,9,17,18,19,20,21,23,24,25,26,10,12,13,14,16}){
            gui.setItem(i, frame);
        }

        player.openInventory(gui);

    }

}
