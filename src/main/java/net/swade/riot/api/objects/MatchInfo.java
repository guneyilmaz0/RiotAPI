package net.swade.riot.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class MatchInfo {
    @Getter private final long gameCreation;
    @Getter private final long gameDuration;
    @Getter private final long gameEndTimestamp;
    @Getter private final long gameId;
    @Getter private final String gameMode;
    @Getter private final String gameName;
    @Getter private final long gameStartTimestamp;
    @Getter private final String gameType;
    @Getter private final String gameVersion;
    @Getter private final int mapId;
    @Getter private final List<MatchParticipant> participants;
    @Getter private final String platformId;
    @Getter private final int queueId;
    @Getter private final List<MatchTeam> teams;
    @Getter private final String tournamentCode;
}
