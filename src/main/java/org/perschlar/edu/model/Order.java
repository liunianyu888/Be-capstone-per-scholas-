package org.perschlar.edu.model;


import org.perschlar.edu.util.PartyType;
import org.perschlar.edu.util.Status;

import java.util.Date;

public class Order {

    private Date partyDate;

    private Date orderDate;

    private String contactName;

    private int partySize;

    private int totalCost;

    private PartyType partyType;

    private Status status;

    public Date getOrderDate() {
        return orderDate;
    }

    public Order setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Date getPartyDate() {
        return partyDate;
    }

    public Order setPartyDate(Date partyDate) {
        this.partyDate = partyDate;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public Order setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public int getPartySize() {
        return partySize;
    }

    public Order setPartySize(int partySize) {
        this.partySize = partySize;
        return this;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public Order setTotalCost(int totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    public PartyType getPartyType() {
        return partyType;
    }

    public Order setPartyType(PartyType partyType) {
        this.partyType = partyType;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Order setStatus(Status status) {
        this.status = status;
        return this;
    }
}
