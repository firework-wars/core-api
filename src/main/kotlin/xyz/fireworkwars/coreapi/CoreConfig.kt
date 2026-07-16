package xyz.fireworkwars.coreapi

import kotlinx.serialization.Serializable
import xyz.fireworkwars.data.ConnectionSettings

@Serializable
data class CoreConfig(
    val serverId: String,
    val connection: ConnectionSettings,

    val serverType: String = "",
    val mapName: String = "",

    val disableVanillaRecipes: Boolean = true,
    val suppressJoinQuitMessages: Boolean = true,
    val applyChatPrefix: Boolean = true,
    val applyNameTags: Boolean = true,
    val applyTablist: Boolean = true,

    val tablistHeader: String = "<bold><color:#ff365e>Firework</color> <color:#00e0e0>Wars</color></bold>",
    val tablistFooter: String = "<newline><gray>play.fireworkwars.net<newline><aqua>discord.fireworkwars.net"
)
