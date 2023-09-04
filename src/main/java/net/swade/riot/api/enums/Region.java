package net.swade.riot.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Region {
    AMERICAS("americas"),
    ASIA("asia"),
    EUROPE("europe"),
    SEA("sea");

    private final String regionCode;
}
