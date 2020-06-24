package de.mctzock.meinplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHeal implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,  String[] args) {
		if(args.length == 1)
		{
			try {
				if(args[0].equals("*"))
				{
					for(Player p : Bukkit.getOnlinePlayers())
					{
						p.setHealth(20);
						p.setFoodLevel(20);
					}
				}else
				{
					Player p = Bukkit.getPlayer(args[0]);
					p.setHealth(20);
					p.setFoodLevel(20);
				}
			}catch (Exception ex)
			{
				sender.sendMessage("Dieser Spieler ist nicht online!");
			}
			
		}else
		{
			if(sender instanceof Player)
			{
				Player p = (Player) sender;
				p.setHealth(20);
				p.setFoodLevel(20);
			}else
			{
				sender.sendMessage("Du musst ein Spieler sein!");
			}
		}
		return true;
	}

}
