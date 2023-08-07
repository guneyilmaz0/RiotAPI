package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchDamage {
    @Getter private final String receiver;
    @Getter private final int damage;
    @Getter private final int legshots;
    @Getter private final int bodyshots;
    @Getter private final int headshots;
}
