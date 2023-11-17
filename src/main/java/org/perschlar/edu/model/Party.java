package org.perschlar.edu.model;

import org.perschlar.edu.util.PartyType;

public class Party {

    private String partyName;

    private int partySize;

    private int partyCost;

    private PartyType partyType;

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public int getPartyCost() {
        return partyCost;
    }

    public void setPartyCost(int partyCost) {
        this.partyCost = partyCost;
    }


    public PartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }
}
