package com.onarandombox.MultiverseCore.display;

import org.bukkit.ChatColor;

/**
 * Tools to allow customisation.
 */
@FunctionalInterface
public interface ColorTool {

    /**
     * Gets a chat color.
     *
     * @return The color.
     */
    ChatColor get();

    /**
     * Default implementation of this interface. Returns a default white color.
     */
    ColorTool DEFAULT = () -> ChatColor.WHITE;
}
