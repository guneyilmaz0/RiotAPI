package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ChampionLevelTip {
    private List<String> label;
    private List<String> effect;
}
