package com.emanuelvini.factions.data.faction

import com.emanuelvini.factions.data.faction.type.FactionRole
import org.bukkit.Bukkit

class Faction (
    val name : String,
    val tag : String,
    var memberLimit: Int,
    val members : List<FactionMember>
) {
    fun owner() : FactionMember = members.first { it.role == FactionRole.OWNER }

    fun online() : List<FactionMember> = members.filter { Bukkit.getServer().getPlayer(it.name) != null }
}