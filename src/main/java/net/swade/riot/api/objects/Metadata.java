package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Metadata {
    @Getter private final String dataVersion;
    @Getter private final String matchId;
    @Getter private final List<String> participants;

}
