package net.swade.riot.api;

public class RiotAPIBuilder {
    public static RiotAPI create(String apiKey){
        return new RiotAPI(apiKey);
    }
}