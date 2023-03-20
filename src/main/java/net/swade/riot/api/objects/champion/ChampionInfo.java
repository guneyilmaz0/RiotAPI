package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ChampionInfo {
    @Getter private int attack;
    @Getter private int defense;
    @Getter private int magic;
    @Getter private int difficulty;
}
