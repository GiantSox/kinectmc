package me.steelbeam.kinectmc;
import org.bukkit.Bukkit;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.*;


public class SpigotBlankPlugin extends JavaPlugin {
	@Override
	public void onEnable()
	{
		Bukkit.getConsoleSender().sendMessage("KinectMC Initialized!");
		
		
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	@EventHandler
	public void onStep(PlayerMoveEvent pme)
	{
		/*Player player = pme.getPlayer();
		Location locUnderPlayer = player.getLocation();
		Block blawk = locUnderPlayer.getBlock();*/
		Bukkit.getConsoleSender().sendMessage(pme.getPlayer().getLocation().getX());
	}
	

}
