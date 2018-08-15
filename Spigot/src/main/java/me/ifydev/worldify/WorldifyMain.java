package me.ifydev.worldify;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Innectic
 * @since 08/14/2018
 */
public class WorldifyMain extends JavaPlugin {

    @Getter private WorldifyAPI api;

    @Override
    public void onEnable() {
        long start = System.currentTimeMillis();
        api = new WorldifyAPI();

        registerCommands();
        registerListeners();

        long timeTaken = System.currentTimeMillis() - start;
        getLogger().info("Worldify initialized in " + ((double) timeTaken) + " seconds (" + timeTaken + " ms)!");
    }

    @Override
    public void onDisable() {
    }

    private void registerCommands() {

    }

    private void registerListeners() {

    }
}
