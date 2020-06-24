package de.mctzock.meinplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.mctzock.meinplugin.commands.CommandHeal;
import de.mctzock.meinplugin.commands.CommandMeinBefehl;
import de.mctzock.meinplugin.events.EventPlayerJoin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getCommand("mein-befehl").setExecutor(new CommandMeinBefehl());
		getCommand("heal").setExecutor(new CommandHeal());
		Bukkit.getPluginManager().registerEvents(new EventPlayerJoin(), this);
		System.out.println("Das Plugin wurde erfolgreich geladen!");
		super.onEnable();
	}
	
}
