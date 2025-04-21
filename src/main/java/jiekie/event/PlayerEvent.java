package jiekie.event;

import jiekie.NoTradeWithVillagerPlugin;
import jiekie.util.ChatUtil;
import jiekie.util.SoundUtil;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PlayerEvent implements Listener {
    private final NoTradeWithVillagerPlugin plugin;

    public PlayerEvent(NoTradeWithVillagerPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent e) {
        Entity entity = e.getRightClicked();
        Player player = e.getPlayer();

        if(entity.getType() == EntityType.VILLAGER || entity.getType() == EntityType.WANDERING_TRADER) {
            if(player.isOp()) return;
            e.setCancelled(true);
            ChatUtil.canNotInteract(player);
            SoundUtil.playNoteBlockBell(player);
        }
    }
}
