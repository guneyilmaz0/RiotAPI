package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class ValMatch {
    @Getter private final ValMatchInfo matchInfo;
    @Getter private final List<ValMatchPlayer> players;
    @Getter private final List<ValMatchCoach> coaches;
    @Getter private final List<ValMatchTeam> teams;
    @Getter private final List<ValMatchRoundResults> roundResults;
}
