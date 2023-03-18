package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MatchBan {
    @Getter private final int championId;
    @Getter private final int pickTurn;
}
