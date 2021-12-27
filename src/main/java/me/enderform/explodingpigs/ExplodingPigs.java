package me.enderform.explodingpigs;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExplodingPigs extends JavaPlugin {

    @Override
    public void onEnable() {
        this
            .getServer()
            .getPluginManager()
            .registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
