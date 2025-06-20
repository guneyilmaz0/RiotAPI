package net.guneyilmaz0.riotapi

import com.google.gson.Gson
import com.google.gson.JsonParser
import net.guneyilmaz0.riotapi.enums.Language
import net.guneyilmaz0.riotapi.enums.Region
import net.guneyilmaz0.riotapi.enums.ResponseCode
import net.guneyilmaz0.riotapi.enums.Server
import net.guneyilmaz0.riotapi.objects.Account
import net.guneyilmaz0.riotapi.objects.lol.match.Match
import java.net.HttpURLConnection
import java.net.URI

open class Queries {
    // Region is set to Europe by default
    var region: Region = Region.EUROPE

    // Server is set to TR1 by default
    var server: Server = Server.TR1

    // Language is set to Turkish (TR_TR) by default
    var language: Language = Language.TR_TR

    // API key for Riot Games API
    lateinit var apiKey: String

    private val gson by lazy { Gson() }

    private fun getJsonFromUrl(url: String): String {
        val connection = (URI(url).toURL().openConnection() as HttpURLConnection).apply {
            requestMethod = "GET"
        }
        return connection.inputStream.bufferedReader().use { reader ->
            val responseCode = connection.responseCode
            if (responseCode != HttpURLConnection.HTTP_OK) throw RuntimeException(ResponseCode.fromCode(responseCode).message)
            reader.readText()
        }
    }

    private fun buildUrl(base: String, endpoint: String, query: String = ""): String {
        return if (query.isEmpty()) "https://$base/$endpoint?api_key=$apiKey"
        else "https://$base/$endpoint?$query&api_key=$apiKey"
    }

    fun getAccountByRiotId(gameName: String, tagLine: String): Account {
        val base = "${region.code}.api.riotgames.com"
        val endpoint = "riot/account/v1/accounts/by-riot-id/$gameName/$tagLine"
        val url = buildUrl(base, endpoint)
        val jsonResponse = getJsonFromUrl(url)
        return gson.fromJson(JsonParser.parseString(jsonResponse), Account::class.java)
    }

    fun getMatchListByPuuid(puuid: String, start: Int = 0, count: Int = 20): List<String> {
        val base = "${region.code}.api.riotgames.com"
        val endpoint = "lol/match/v5/matches/by-puuid/$puuid/ids"
        val query = "start=$start&count=$count"
        val url = buildUrl(base, endpoint, query)
        val jsonResponse = getJsonFromUrl(url)
        return gson.fromJson(JsonParser.parseString(jsonResponse), Array<String>::class.java).toList()
    }

    fun getMatchById(matchId: String): Match {
        val base = "${region.code}.api.riotgames.com"
        val endpoint = "lol/match/v5/matches/$matchId"
        val url = buildUrl(base, endpoint)
        val jsonResponse = getJsonFromUrl(url)
        return gson.fromJson(JsonParser.parseString(jsonResponse), Match::class.java)
    }
}