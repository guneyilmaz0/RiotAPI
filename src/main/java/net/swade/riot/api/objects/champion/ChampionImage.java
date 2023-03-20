package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ChampionImage {
    @Getter private String full;
    @Getter private String sprite;
    @Getter private String group;
    @Getter private int x;
    @Getter private int y;
    @Getter private int w;
    @Getter private int h;
}
