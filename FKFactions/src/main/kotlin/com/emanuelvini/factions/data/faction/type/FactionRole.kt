package com.emanuelvini.factions.data.faction.type

enum class FactionRole (
    val accesses : List<FactionAccess>
) {

    RECRUIT (
        emptyList()
    ),
    MEMBER (
        listOf(
            FactionAccess.REMOVE_BLOCKS,
            FactionAccess.ADD_BLOCKS,
        )
    ),
    CAPTAIN (
        MEMBER.accesses + listOf(
            FactionAccess.KICK_MEMBERS,
            FactionAccess.INVITE_MEMBERS
        )
    ),
    OWNER (
        FactionAccess.entries
    )

}