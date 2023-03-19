package net.swade.riot.api.objects.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class MatchPerkStyle {
    @Getter private final String description;
    @Getter private final List<MatchPerkStyleSelection> selections;
    @Getter private final int style;
}
