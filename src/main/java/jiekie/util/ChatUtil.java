package jiekie.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "\uA003 ";
    }

    public static void canNotInteract(Player player) {
        player.sendMessage(getWarnPrefix() + "주민과 상호작용 할 수 없습니다.");
    }
}
