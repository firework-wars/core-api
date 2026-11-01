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

    /** Saves a finished game's stats for [uuid], and gives them its XP and any achievements it earned (with a summary, if they're online). */
    fun finishGame(uuid: UUID, gameType: String, kills: Int, died: Boolean, damage: Double, result: GameResult)

    /** Gives [player] [achievement] and its XP; nothing happens if they already have it. */
    fun unlockAchievement(player: Player, achievement: Achievement)

    /** Plays [player]'s chosen death effect at [location]. */
    fun playDeathEffect(player: Player, location: Location)

    /** Circles [viewers]' camera around [center] at [radius] blocks out and [height] blocks up, for [ticks]. */
    fun panCamera(viewers: Collection<Player>, center: Location, radius: Double, height: Double, ticks: Int): CameraShot

    /** Keeps the last few seconds of every player in [world] (moves, swings, hits, projectiles, explosions) for a final kill replay. */
    fun startRecording(world: World)

    /**
     * Replays the last seconds before [victim] died to [viewers], from a camera following the fight, then runs [then].
     * False (and [then] isn't run) if there's nothing recorded to replay.
     */
    fun replayFinalKill(victim: UUID, killer: UUID?, viewers: Collection<Player>, then: Runnable): Boolean
}
