package net.swade.riot.api.objects.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MatchPerkStyleSelection {
    @Getter private final int perk;
    @Getter private final int var1;
    @Getter private final int var2;
    @Getter private final int var3;
}
