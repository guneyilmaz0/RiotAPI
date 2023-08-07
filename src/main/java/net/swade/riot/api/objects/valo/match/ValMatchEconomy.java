package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchEconomy {
    @Getter private final int loadoutValue;
    @Getter private final String weapon;
    @Getter private final String armor;
    @Getter private final int remaining;
    @Getter private final int spent;
}
