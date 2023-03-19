package net.swade.riot.api.objects.match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.swade.riot.api.objects.match.MatchBan;
import net.swade.riot.api.objects.match.MatchObjectives;

import java.util.List;

@AllArgsConstructor
public class MatchTeam {
    @Getter private final List<MatchBan> bans;
    @Getter private final MatchObjectives objectives;
    @Getter private final int teamId;
    @Getter private final boolean win;
}
