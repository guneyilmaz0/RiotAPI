package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class MatchPerks {
    @Getter private final MatchPerkStats statPerks;
    @Getter private final List<MatchPerkStyle> styles;
}
