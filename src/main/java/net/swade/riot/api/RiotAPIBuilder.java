package net.swade.riot.api;

public class RiotAPIBuilder {
    public static RiotAPI create(String apiKey, Region region, Server server){
        return new RiotAPI(apiKey, region, server);
    }
}