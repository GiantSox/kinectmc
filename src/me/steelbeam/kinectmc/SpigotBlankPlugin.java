package me.steelbeam.kinectmc;
import org.bukkit.Bukkit;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.*;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;


public class SpigotBlankPlugin extends JavaPlugin implements Listener {
	@Override
	public void onEnable()
	{
		Bukkit.getConsoleSender().sendMessage("KinectMC Initialized!");
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(this, this);
		
		
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	@EventHandler
	public void onStep(PlayerMoveEvent moveEvent)
	{
		Player player = moveEvent.getPlayer();
		//Material block = moveEvent.getBlock().getType();
		/*
		Location locUnderPlayer = player.getLocation();
		Block blawk = locUnderPlayer.getBlock();*/
		String playerX = Double.toString(player.getLocation().getX());
		String playerY = Double.toString(player.getLocation().getY());
		String playerZ = Double.toString(player.getLocation().getZ());
		Material blockInHand = player.getInventory().getItemInMainHand().getType();
		Bukkit.getConsoleSender().sendMessage("player at " + playerX + "," + playerY + "," + playerZ + " is holding " + blockInHand);
		if(player.getInventory().getItemInMainHand().getType() != Material.AIR)
		{
			Block blockToChange = player.getLocation().subtract(0, 1, 0).getBlock();
			blockToChange.setType(blockInHand);
		}
		
		//sendRawMessage(player.getLocation().getX());
	}
	

}
