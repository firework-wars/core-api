package xyz.fireworkwars.coreapi

import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.Player
import xyz.fireworkwars.data.Achievement
import xyz.fireworkwars.data.Customisation
import xyz.fireworkwars.data.GameResult
import xyz.fireworkwars.data.MessageBus
import xyz.fireworkwars.data.PlayerProfiles
import xyz.fireworkwars.data.Progression
import xyz.fireworkwars.data.Rank
import java.util.UUID

interface FireworkCoreApi {

    fun getPlayerProfiles(): PlayerProfiles

    fun getProgression(): Progression

    fun getCustomisation(): Customisation

    fun getMessageBus(): MessageBus

    fun getRank(uuid: UUID): Rank

    fun refreshNameTag(player: Player)

    fun setNameTagSuppressed(player: Player, suppressed: Boolean)

    fun setChatPrefixSuppressed(player: Player, suppressed: Boolean)

    fun finishGame(uuid: UUID, gameType: String, kills: Int, died: Boolean, damage: Double, result: GameResult)

    fun unlockAchievement(player: Player, achievement: Achievement)

    fun playDeathEffect(player: Player, location: Location)

    fun startRecording(world: World)

    fun replayFinalKill(victim: UUID, killer: UUID?, viewers: Collection<Player>, then: Runnable): Boolean
}
