package me.oskarscot.orbital;

import java.io.File;
import me.oskarscot.orbital.command.ExplodeCommand;
import me.oskarscot.orbital.command.FireCommand;
import me.oskarscot.orbital.command.LightningCommand;
import me.oskarscot.orbital.completer.PlayerTabCompleter;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.jetbrains.annotations.NotNull;

public final class OrbitalPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    getCommand("fire").setExecutor(new FireCommand());
    getCommand("fire").setTabCompleter(new PlayerTabCompleter());

    getCommand("explode").setExecutor(new ExplodeCommand());
    getCommand("explode").setTabCompleter(new PlayerTabCompleter());

    getCommand("lightning").setExecutor(new LightningCommand());
    getCommand("lightning").setTabCompleter(new PlayerTabCompleter());
  }

  @Override
  public void onDisable() {} // empty, no use for it

  /*
   * Created constructors for mock bukkit
   */

  public OrbitalPlugin() {
    super();
  }

  public OrbitalPlugin(@NotNull JavaPluginLoader loader, @NotNull PluginDescriptionFile description, @NotNull File dataFolder, @NotNull File file) {
    super(loader, description, dataFolder, file);
  }
}
