package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChampionPassive {
    private String name;
    private String description;
    private ChampionImage image;
}
