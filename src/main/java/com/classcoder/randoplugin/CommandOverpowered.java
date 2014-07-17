package com.classcoder.randoplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;


public class CommandOverpowered implements CommandExecutor {
	private final JavaPlugin plugin;
	
	public CommandOverpowered(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player) || !sender.hasPermission(new org.bukkit.permissions.Permission("randoplugin.overpowered"))) {
			sender.sendMessage(ChatColor.RED + "[RandoPlugin] Y U NO BE GOOD ENOUGH FOR DIAMONDS?!?!");
			return true;
		} else {
			sender.sendMessage(ChatColor.GREEN + "[RandoPlugin] Much diamond, such wow.");
			Player player = sender.getServer().getPlayer(sender.getName());
			PlayerInventory inv = player.getInventory();
			ItemStack daimundz = new ItemStack(Material.DIAMOND, 128);
			inv.addItem(daimundz);
		}
		return false;
	}
}
