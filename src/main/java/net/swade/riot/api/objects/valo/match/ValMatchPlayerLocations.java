package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchPlayerLocations {
    @Getter private final String puuid;
    @Getter private final float viewRadians;
    @Getter private final ValMatchLocation location;
}
