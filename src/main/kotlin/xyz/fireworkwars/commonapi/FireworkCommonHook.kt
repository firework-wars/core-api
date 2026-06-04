package xyz.fireworkwars.commonapi

import org.bukkit.entity.Player
import java.util.UUID

/**
 * Interface for interacting with the Common Plugin API
 */
interface FireworkCommonHook {

    /** Get a player's rank */
    fun getRank(uuid: UUID): Rank

    /**
     * Refresh a player's name tag (e.g. after rank update)
     */
    fun refreshNameTag(player: Player)

    /**
     * Disables the custom name tag for this player managed by the Common plugin
     */
    fun setNameTagSuppressed(player: Player, suppressed: Boolean)

    /**
     * Disables the custom chat rendering for this player managed by the Common plugin
     */
    fun setChatPrefixSuppressed(player: Player, suppressed: Boolean)
}
