package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ChampionSpell {
    private String id;
    private String name;
    private String description;
    private String toolTip;
    private ChampionLevelTip levelTip;
    private int maxRank;
    private List<Integer> coolDown;
    private String coolDownBurn;
    private List<Integer> cost;
    private String costBurn;
    private List<Object> dataValues;
    private List<ChampionEffect> effects;
    private List<String> effectBurn;
    private List<Object> vars;
    private String costType;
    private String maxAmmo;
    private List<Integer> range;
    private String rangeBurn;
    private ChampionImage image;
    private String resource;
}
