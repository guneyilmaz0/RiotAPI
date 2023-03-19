package net.swade.riot.api.objects.match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.swade.riot.api.objects.match.MatchObjective;

@AllArgsConstructor
public class MatchObjectives {
    @Getter private final MatchObjective baron;
    @Getter private final MatchObjective champion;
    @Getter private final MatchObjective dragon;
    @Getter private final MatchObjective inhibitor;
    @Getter private final MatchObjective riftHerald;
    @Getter private final MatchObjective tower;
}
