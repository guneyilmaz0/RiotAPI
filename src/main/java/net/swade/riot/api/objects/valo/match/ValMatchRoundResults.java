package net.swade.riot.api.objects.valo.match;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class ValMatchRoundResults {
    @Getter private final int roundNum;
    @Getter private final String roundResult;
    @Getter private final String roundCeremony;
    @Getter private final String winningTeam;
    @Getter private final String bombPlanter;
    @Getter private final String bombDefuser;
    @Getter private final int plantRoundTime;
    @Getter private final List<ValMatchPlayerLocations> plantPlayerLocations;
    @Getter private final ValMatchLocation plantLocation;
    @Getter private final String plantSite;
    @Getter private final int defuseRoundTime;
    @Getter private final List<ValMatchPlayerLocations> defusePlayerLocations;
    @Getter private final ValMatchLocation defuseLocation;
    @Getter private final List<ValMatchPlayerLocations> playerStats;
    @Getter private final String roundResultCode;
}