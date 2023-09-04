package net.swade.riot.api;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import lombok.Getter;
import lombok.SneakyThrows;
import net.swade.riot.api.enums.Region;
import net.swade.riot.api.enums.ResponseCode;
import net.swade.riot.api.enums.Server;
import net.swade.riot.api.objects.Summoner;
import net.swade.riot.api.objects.match.Match;
import net.swade.riot.api.objects.match.MatchParticipant;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public record RiotAPI(@Getter String API_KEY, @Getter Region REGION, @Getter Server SERVER) {

    @SneakyThrows
    public Summoner getSummonerByName(String name) {
        URL url = new URL(Settings.BASE_URL + SERVER.getServerCode() + Settings.SUMMONER_URL + name + "?api_key=" + API_KEY);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException(ResponseCode.getByCode(responseCode).getMessage());
        }

        StringBuilder responseBody = new StringBuilder();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNextLine()) {
            responseBody.append(scanner.nextLine());
        }

        return new Gson().fromJson(JsonParser.parseString(responseBody.toString()), Summoner.class);
    }

    public JsonArray getMatchIdsBySummonerName(String name) {
        Summoner summoner = getSummonerByName(name);
        return getMatchIdsByPUUID(summoner.getPuuid());
    }

    public JsonArray getMatchIdsBySummoner(Summoner summoner) {
        return getMatchIdsByPUUID(summoner.getPuuid());
    }

    @SneakyThrows
    public JsonArray getMatchIdsByPUUID(String puuid) {
        URL url = new URL(Settings.BASE_URL + REGION.getRegionCode() + Settings.MATCH_IDS_URL + puuid + "/ids?start=0&count=20&api_key=" + API_KEY);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException(ResponseCode.getByCode(responseCode).getMessage());
        }


        StringBuilder responseBody = new StringBuilder();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNextLine()) {
            responseBody.append(scanner.nextLine());
        }
        scanner.close();
        JsonElement jsonElement = JsonParser.parseString(responseBody.toString());
        return jsonElement.getAsJsonArray();
    }

    @SneakyThrows
    public Match getMatchById(String matchId) {
        URL url = new URL(Settings.BASE_URL + REGION.getRegionCode() + Settings.MATCH_URL + matchId + "?api_key=" + API_KEY);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException(ResponseCode.getByCode(responseCode).getMessage());
        }

        StringBuilder responseBody = new StringBuilder();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNextLine()) {
            responseBody.append(scanner.nextLine());
        }
        scanner.close();

        return new Gson().fromJson(JsonParser.parseString(responseBody.toString()), Match.class);
    }

    public Match getLastMatchBySummonerName(String name) {
        String lastMatchId = getMatchIdsBySummonerName(name).get(0).getAsString();
        return getMatchById(lastMatchId);
    }

    public Match getLastMatchBySummoner(Summoner summoner) {
        String lastMatchId = getMatchIdsByPUUID(summoner.getPuuid()).get(0).getAsString();
        return getMatchById(lastMatchId);
    }

    public MatchParticipant getParticipantByMatch(Match match, Summoner summoner){
        for (MatchParticipant participant : match.getInfo().getParticipants()) {
            if (participant.getPuuid().equalsIgnoreCase(summoner.getPuuid())){
                return participant;
            }
        }
        return null;
    }

    public int[] getKDA(Match match, Summoner summoner){
        MatchParticipant participant = getParticipantByMatch(match, summoner);
        if (participant == null){
            throw new RuntimeException("This summoner was not found in this match.");
        }

        return new int[]{participant.getKills(), participant.getDeaths(), participant.getAssists()};
    }
}
