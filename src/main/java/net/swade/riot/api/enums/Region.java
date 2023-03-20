package net.swade.riot.api.enums;

import lombok.Getter;


public enum Region {
    AMERICAS("americas"),
    ASIA("asia"),
    EUROPE("europe"),
    SEA("sea");

    @Getter private final String regionCode;

    Region(String regionCode) {
        this.regionCode = regionCode;
    }
}
