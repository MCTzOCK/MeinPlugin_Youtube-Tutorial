package de.mctzock.meinplugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventPlayerJoin implements Listener{

	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
		event.setJoinMessage("§eDer Spieler §b" + event.getPlayer().getName() + " §ehat den Server betreten!");
	}
}
