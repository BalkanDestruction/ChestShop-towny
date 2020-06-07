package com.acrobot.chestshop.towny;

import org.bukkit.entity.Player;

/**
 * @author Acrobot
 */
public enum Permission {
    PROTECTION_BYPASS();

    private final String permission;

    Permission() {
        this.permission = "ChestShop.towny.bypass";
    }

    public static boolean has(Player player, Permission permission) {
        return has(player, permission.permission);
    }

    public static boolean has(Player player, String node) {
        return player.hasPermission(node) || player.hasPermission(node.toLowerCase());
    }

    private static boolean hasPermissionSet(Player p, String perm) {
        return p.isPermissionSet(perm) && p.hasPermission(perm);
    }

    public String toString() {
        return permission;
    }
}
