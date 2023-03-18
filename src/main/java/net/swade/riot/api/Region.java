package net.swade.riot.api;

import lombok.Getter;

import java.util.Objects;

public enum Region {
    AMERICAS("americas"),
    ASIA("asia"),
    EUROPE("europe"),
    SEA("sea"),
    NULL("null");

    @Getter private final String regionCode;

    Region(String regionCode) {
        this.regionCode = regionCode;
    }

    public static Region getByServerCode(String regionCode) {
        for (Region region : values()) {
            if (Objects.equals(region.getRegionCode(), regionCode)) {
                return region;
            }
        }
        return NULL;
    }
}
