package jiekie;

import jiekie.event.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoTradeWithVillagerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerEvent(this), this);

        getLogger().info("거래 금지 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
