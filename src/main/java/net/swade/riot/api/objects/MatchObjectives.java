package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MatchObjectives {
    @Getter private final MatchObjective baron;
    @Getter private final MatchObjective champion;
    @Getter private final MatchObjective dragon;
    @Getter private final MatchObjective inhibitor;
    @Getter private final MatchObjective riftHerald;
    @Getter private final MatchObjective tower;
}
