package jiekie;

import jiekie.event.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoTradeWithVillagerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerEvent(this), this);
    }

    @Override
    public void onDisable() {}
}
