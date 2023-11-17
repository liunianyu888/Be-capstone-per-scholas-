package org.perschlar.edu.service;

import org.perschlar.edu.model.Party;

import java.util.List;

public interface PartyService {

    List<Party> getAllParties();

    void saveParty(org.perschlar.edu.model.Party party);

}
