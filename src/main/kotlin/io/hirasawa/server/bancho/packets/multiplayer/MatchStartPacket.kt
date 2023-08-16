package io.hirasawa.server.bancho.packets.multiplayer

import io.hirasawa.server.bancho.objects.MultiplayerMatch
import io.hirasawa.server.bancho.packets.BanchoPacket
import io.hirasawa.server.bancho.packets.BanchoPacketType
import io.hirasawa.server.bancho.serialisation.BanchoMultiplayerMatchWriter

class MatchStartPacket(multiplayerMatch: MultiplayerMatch): BanchoPacket(BanchoPacketType.BANCHO_MATCH_START) {
    init {
        BanchoMultiplayerMatchWriter(multiplayerMatch).write(writer)
    }
}