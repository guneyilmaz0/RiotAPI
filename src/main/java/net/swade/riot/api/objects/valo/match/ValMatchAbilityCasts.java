package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchAbilityCasts {
    @Getter private final int grenadeCasts;
    @Getter private final int ability1Casts;
    @Getter private final int ability2Casts;
    @Getter private final int ultimateCasts;
}
