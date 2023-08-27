package net.swade.riot.api.objects.champion;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class SkinData {
    @Getter private String id;
    @Getter private int num;
    @Getter private String name;
    @Getter private boolean chromas;
}
