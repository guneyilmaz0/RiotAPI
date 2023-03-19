package net.swade.riot.api.objects.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MatchObjective {
    @Getter private final boolean first;
    @Getter private final int kills;
}
