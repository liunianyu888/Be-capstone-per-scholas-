package org.perschlar.edu.model;

import org.perschlar.edu.util.PartyType;

import java.util.Date;

public class OrderReq {
    private Date partyDate;

    private String contactName;

    private int partySize;

    private PartyType partyType;

    public Date getPartyDate() {
        return partyDate;
    }

    public OrderReq setPartyDate(Date partyDate) {
        this.partyDate = partyDate;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public OrderReq setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public int getPartySize() {
        return partySize;
    }

    public OrderReq setPartySize(int partySize) {
        this.partySize = partySize;
        return this;
    }

    public PartyType getPartyType() {
        return partyType;
    }

    public OrderReq setPartyType(PartyType partyType) {
        this.partyType = partyType;
        return this;
    }
}
