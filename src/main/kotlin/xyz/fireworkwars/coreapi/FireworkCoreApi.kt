package xyz.fireworkwars.coreapi

import org.bukkit.entity.Player
import xyz.fireworkwars.data.PlayerProfiles
import xyz.fireworkwars.data.Rank
import java.util.UUID

interface FireworkCoreApi {

    fun getPlayerProfiles(): PlayerProfiles

    fun getRank(uuid: UUID): Rank

    fun refreshNameTag(player: Player)

    fun setNameTagSuppressed(player: Player, suppressed: Boolean)

    fun setChatPrefixSuppressed(player: Player, suppressed: Boolean)

    fun publish(channel: String, message: String)

    fun subscribe(channel: String, handler: (String) -> Unit)
}
