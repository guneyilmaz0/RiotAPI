package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchCoach {
    @Getter private final String puuid;
    @Getter private final String teamId;
}
