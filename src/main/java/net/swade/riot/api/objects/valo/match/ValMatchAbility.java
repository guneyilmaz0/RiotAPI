package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchAbility {
    @Getter private final int grenadeEffects;
    @Getter private final int ability1Effects;
    @Getter private final int ability2Effects;
    @Getter private final int ultimateEffects;
}