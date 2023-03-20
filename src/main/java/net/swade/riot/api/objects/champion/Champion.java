package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Champion {
    @Getter private String version;
    @Getter private String id;
    @Getter private String key;
    @Getter private String name;
    @Getter private String title;
    @Getter private String blurb;
    @Getter private ChampionInfo info;
    @Getter private ChampionImage image;
    @Getter private List<String> tags;
    @Getter private String partype;
    @Getter private ChampionStats stats;
}
