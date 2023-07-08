package com.wizardlybump17.plugintemplate.api;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class PluginTemplate extends JavaPlugin {

    public static PluginTemplate getInstance() {
        return getPlugin(PluginTemplate.class);
    }
}
