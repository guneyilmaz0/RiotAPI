package net.guneyilmaz0.riotapi

fun main() {
    val api = RiotAPI("RGAPI-f0116ac8-36e8-4224-ad27-8e7edecfe8f0")
    val account = api.getAccountByRiotId("fiero", "carry")
    println("Account PUUID: ${account.puuid}")
    val matchList = api.getMatchListByPuuid(account.puuid)
    val latestMatch = matchList.firstOrNull()?.let { api.getMatchById(it) }
    if (latestMatch == null) {
        println("No matches found for the account.")
        return
    }
    val participants = latestMatch.info.participants
    val participant = participants.firstOrNull { it.puuid == account.puuid }
    println(participant!!.championName)

}