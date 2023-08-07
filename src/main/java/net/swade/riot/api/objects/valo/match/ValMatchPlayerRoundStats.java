package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class ValMatchPlayerRoundStats {
    @Getter private final String puuid;
    @Getter private final List<ValMatchKill> kills;
    @Getter private final List<ValMatchDamage> damage;
    @Getter private final int score;
    @Getter private final ValMatchEconomy economy;
    @Getter private final ValMatchAbility ability;
}