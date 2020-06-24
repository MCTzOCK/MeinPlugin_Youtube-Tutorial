package de.mctzock.meinplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMeinBefehl implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,  String[] args) {
		sender.sendMessage("Cooler Befehl!");
		return true;
	}

}
