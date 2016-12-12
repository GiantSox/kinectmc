package me.steelbeam.kinectmc;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

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

}
