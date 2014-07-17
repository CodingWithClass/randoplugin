package com.classcoder.randoplugin;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class RandoPlugin extends JavaPlugin {
	private Logger logger;
	@Override
	public void onEnable() {
		logger = this.getLogger();
		
		if (RandomConstants.beta) {
			logger.warning("You are using a beta build of RandoPlugin! I am not responsible for system implosions, earthquakes, or the apocalypse.");
		}
		
		this.getCommand("overpowered").setExecutor(new CommandOverpowered(this));
	}
	@Override
	public void onDisable() {
		
	}
}
