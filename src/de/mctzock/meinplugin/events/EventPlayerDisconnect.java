package de.mctzock.meinplugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventPlayerDisconnect implements Listener{

	@EventHandler
	public void onDisconnect(PlayerQuitEvent event)
	{
		event.setQuitMessage("§eDer Spieler §b" + event.getPlayer().getName() + " §ehat den Server verlassen!");
	}
}
