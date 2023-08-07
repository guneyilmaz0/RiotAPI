package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ValMatchInfo {
    @Getter private final String matchInfo;
    @Getter private final String mapId;
    @Getter private final int gameLengthMillis;
    @Getter private final long gameStartMillis;
    @Getter private final String provisioningFlowId;
    @Getter private final boolean completed;
    @Getter private final String customGameName;
    @Getter private final String queueId;
    @Getter private final String gameMode;
    @Getter private final boolean ranked;
    @Getter private final String seasonId;
}

