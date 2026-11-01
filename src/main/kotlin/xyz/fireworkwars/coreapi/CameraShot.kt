package xyz.fireworkwars.coreapi

import org.bukkit.entity.Player

/** A camera shot that players watch from spectator mode; see [FireworkCoreApi.panCamera]. */
interface CameraShot {

    val isRunning: Boolean

    fun addViewer(player: Player)

    /** Ends the shot early. Viewers are let go, but stay in spectator mode. */
    fun stop()
}
