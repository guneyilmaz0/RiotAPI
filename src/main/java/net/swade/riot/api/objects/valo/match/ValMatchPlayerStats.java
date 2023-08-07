package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchPlayerStats {
    @Getter private final int score;
    @Getter private final int roundsPlayed;
    @Getter private final int kills;
    @Getter private final int deaths;
    @Getter private final int assists;
    @Getter private final int playtimeMillis;
    @Getter private final ValMatchAbilityCasts abilityCasts;
}
