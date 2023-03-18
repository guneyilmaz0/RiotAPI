package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Match {
    @Getter private final Metadata metadata;
    @Getter private final MatchInfo info;
}
