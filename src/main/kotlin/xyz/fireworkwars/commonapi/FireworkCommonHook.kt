package xyz.fireworkwars.commonapi

import org.bukkit.entity.Player
import java.util.UUID

/**
 * Public API for FWWCommon. Other plugins resolve this at runtime via
 * `Bukkit.getPluginManager().getPlugin("FWWCommon") as FireworkCommonHook`.
 *
 * Suppress methods are intended for game plugins that want full control over
 * a player's chat formatting / nametag during a match. Always pair a `true`
 * call with a `false` call when the override window ends.
 */
interface FireworkCommonHook {

    /** Look up a player's persisted rank from the network database. */
    fun getRank(uuid: UUID): Rank

    /**
     * Re-apply rank-based scoreboard team membership for this player. Useful after
     * a manual rank change if you need an immediate refresh on the local server.
     */
    fun refreshNameTag(player: Player)

    /**
     * While suppressed, FWWCommon removes the player from its rank-based scoreboard
     * team so consumers (e.g. a game plugin's red/blue team) can take ownership of
     * nametag color. Call again with `false` to restore.
     */
    fun setNameTagSuppressed(player: Player, suppressed: Boolean)

    /**
     * While suppressed, FWWCommon's chat renderer skips this player and lets other
     * listeners (or the vanilla default) handle rendering. Call again with `false`
     * to restore.
     */
    fun setChatPrefixSuppressed(player: Player, suppressed: Boolean)
}
