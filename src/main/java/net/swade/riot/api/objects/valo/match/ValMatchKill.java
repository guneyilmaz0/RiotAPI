package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class ValMatchKill {
    @Getter private final int timeSinceGameStartMillis;
    @Getter private final int timeSinceRoundStartMillis;
    @Getter private final String killer;
    @Getter private final String victim;
    @Getter private final ValMatchLocation victimLocation;
    @Getter private final List<String> assistants;
    @Getter private final List<ValMatchPlayerLocations> playerLocations;
    @Getter private final ValMatchFinishingDamage finishingDamage;
}
