package org.perschlar.edu.service.serviceImpl;

import org.perschlar.edu.entity.Party;
import org.perschlar.edu.repository.PartyRepository;
import org.perschlar.edu.service.PartyService;
import org.perschlar.edu.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {

    @Autowired
    PartyRepository partyRepository;

    @Override
    public List<org.perschlar.edu.model.Party> getAllParties() {
        List<Party> parties =  partyRepository.findAll();
        List<org.perschlar.edu.model.Party> partyList = new ArrayList<>();

        parties.forEach(party -> {
            partyList.add(Mapper.partyMapperBe2Fe(party));
        });

        return partyList;

    }

    @Override
    public void saveParty(org.perschlar.edu.model.Party party) {
        Party party1 = new Party();

        party1.setPartyCost(party.getPartyCost());
        party1.setPartyName(party.getPartyName());
        party1.setPartySize(party.getPartySize());
        party1.setPartyType(party.getPartyType().name());

        partyRepository.save(party1);

    }
}
