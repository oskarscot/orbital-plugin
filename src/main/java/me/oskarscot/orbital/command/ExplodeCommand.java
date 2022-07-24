package me.oskarscot.orbital.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ExplodeCommand implements CommandExecutor {

  @Override
  public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
    if(args.length != 1) {
      sender.sendMessage("Usage: /explode <player>");
      return true;
    }
    Player player = Bukkit.getPlayer(args[0]);
    if(player == null) {
      sender.sendMessage("Player not found");
      return true;
    }
    player.getWorld().createExplosion(player.getLocation(), 8f, false);
    sender.sendMessage("Exploded " + player.getName());
    return true;
  }
}
