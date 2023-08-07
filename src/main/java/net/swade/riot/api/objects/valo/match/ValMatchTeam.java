package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchTeam {
    @Getter private final String teamId;
    @Getter private final boolean won;
    @Getter private final int roundsPlayed;
    @Getter private final int roundsWon;
    @Getter private final int numPoints;
}
