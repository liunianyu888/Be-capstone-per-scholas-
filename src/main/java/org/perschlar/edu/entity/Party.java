package org.perschlar.edu.entity;

import org.perschlar.edu.util.PartyType;

import javax.persistence.*;

@Entity
@Table(name = "party")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "partyname")
    private String partyName;

    @Column(name = "partysize")
    private int partySize;

    @Column(name = "partycost")
    private int partyCost;

    @Column(name = "partytype")
    private String partyType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }
}
