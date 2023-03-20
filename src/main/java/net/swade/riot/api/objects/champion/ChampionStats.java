package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ChampionStats {
    @Getter private int hp;
    @Getter private int hpperlevel;
    @Getter private int mp;
    @Getter private int mpperlevel;
    @Getter private int armor;
    @Getter private double armorperlevel;
    @Getter private int spellblock;
    @Getter private double spellblockperlevel;
    @Getter private int attackrange;
    @Getter private int hpregen;
    @Getter private int hpregenperlevel;
    @Getter private int mpregen;
    @Getter private int mpregenperlevel;
    @Getter private int crit;
    @Getter private int critperlevel;
    @Getter private int attackdamage;
    @Getter private int attackdamageperlevel;
    @Getter private double attackspeedperlevel;
    @Getter private double attackspeed;
}
