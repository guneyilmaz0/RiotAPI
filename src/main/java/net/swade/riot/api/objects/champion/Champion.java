package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class Champion {
    private String id;
    private String key;
    private String name;
    private String title;
    private ChampionImage image;
    private List<SkinData> skins;
    private String lore;
    private String blurb;
    private List<String> allyTips;
    private List<String> enemyTips;
    private List<String> tags;
    private String partype;
    private ChampionInfo info;
    private ChampionStats stats;
    private List<ChampionSpell> spells;
    private ChampionPassive passive;
    private List<Object> recommended;
}
