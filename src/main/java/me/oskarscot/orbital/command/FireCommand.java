package me.oskarscot.orbital.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FireCommand implements CommandExecutor {

  @Override
  public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
    if(args.length != 1){
      sender.sendMessage("Usage: /fire <player>");
      return true;
    }
    Player player = Bukkit.getPlayer(args[0]);
    if(player == null){
      sender.sendMessage("Player not found");
      return true;
    }
    player.setFireTicks(60);
    sender.sendMessage("Player " + player.getName() + " is on fire");
    return true;
  }


}
