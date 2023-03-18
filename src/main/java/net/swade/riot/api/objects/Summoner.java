package net.swade.riot.api.objects;

import lombok.Getter;

public record Summoner(@Getter String accountId, @Getter int profileIconId, @Getter String revisionDate,
                       @Getter String name, @Getter String id, @Getter String puuid, @Getter String summonerLevel) {
}
