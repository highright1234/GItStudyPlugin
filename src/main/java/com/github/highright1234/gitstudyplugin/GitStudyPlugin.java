package com.github.highright1234.gitstudyplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class GitStudyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("gitstudyplugin")).setExecutor(new GSPCommand());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
