package net.swade.riot.api;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import lombok.SneakyThrows;
import net.swade.riot.api.enums.Language;
import net.swade.riot.api.enums.ResponseCode;
import net.swade.riot.api.objects.champion.Champion;
import net.swade.riot.api.objects.match.MatchParticipant;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RiotAPIUtils {

    /**
     * @param championName Champion's name (Must be entered correctly. e.g. Aatrox ✅, aatrox ❎)
     * @return Returns a URL in string format
     */
    public static String getChampionSquareAsset(String championName) {
        return "http://ddragon.leagueoflegends.com/cdn/" + getLatestLOLVersion() + "/img/champion/" + championName + ".png";
    }

    public static String getChampionSquareAssetFromParticipant(MatchParticipant participant) {
        return getChampionSquareAsset(participant.getChampionName());
    }

    /**
     * @param championName Champion's name (Must be entered correctly. e.g. Aatrox ✅, aatrox ❎)
     * @return Returns a URL in string format
     */
    public static String getChampionLoadingScreenAsset(String championName) {
        return "http://ddragon.leagueoflegends.com/cdn/img/champion/loading/" + championName + "_0.jpg";
    }

    public static String getChampionLoadingScreenAssetFromParticipant(MatchParticipant participant) {
        return getChampionLoadingScreenAsset(participant.getChampionName());
    }

    @SneakyThrows
    public static String getLatestLOLVersion() {
        URL url = new URL("https://ddragon.leagueoflegends.com/api/versions.json");
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
        return JsonParser.parseString(responseBody.toString()).getAsJsonArray().get(0).getAsString();
    }

    @SneakyThrows
    public static Champion getChampionByName(String championName, Language language) {
        URL url = new URL("https://ddragon.leagueoflegends.com/cdn/" + getLatestLOLVersion() + "/data/" + language.getLanguageCode() + "/champion.json");
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

        return new Gson().fromJson(JsonParser.parseString(responseBody.toString()).getAsJsonObject().get("data").getAsJsonObject().get(championName), Champion.class);
    }
}
