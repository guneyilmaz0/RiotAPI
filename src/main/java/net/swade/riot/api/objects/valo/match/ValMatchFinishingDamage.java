package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchFinishingDamage {
    @Getter private final String damageType;
    @Getter private final String damageItem;
    @Getter private final boolean secondaryFireMode;
}
