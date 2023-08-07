package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchPlayer {
    @Getter private final String puuid;
    @Getter private final String gameName;
    @Getter private final String tagLine;
    @Getter private final String teamId;
    @Getter private final String partyId;
    @Getter private final String characterId;
    @Getter private final ValMatchPlayerStats playerStats;
    @Getter private final int competitiveTier;
    @Getter private final String playerCard;
    @Getter private final String playerTitle;
}
