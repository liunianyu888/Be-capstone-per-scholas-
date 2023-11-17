package org.perschlar.edu.util;

public enum PartyType {
    HIBACHI,
    BIRTHDAY,
    WEDDING,
    PROMOTION,
    HOME_WARMER,
    BABY_SHOWER;

    public String getType(PartyType partyType) {
        return partyType.name();
    }
}
