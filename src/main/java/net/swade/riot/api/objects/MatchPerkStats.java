package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MatchPerkStats {
    @Getter private final int defense;
    @Getter private final int flex;
    @Getter private final int offense;
}
