package com.emanuelvini.factions.data.faction

import com.emanuelvini.factions.data.faction.type.FactionRole

data class FactionMember (
    val name : String,
    var faction : Faction?,
    var role : FactionRole
)