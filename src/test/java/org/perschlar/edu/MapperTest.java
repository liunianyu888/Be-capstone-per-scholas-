package org.perschlar.edu;


import org.junit.Assert;
import org.junit.Test;
import org.perschlar.edu.entity.Party;
import org.perschlar.edu.util.Mapper;

public class MapperTest {

    @Test
    public void testMapper() {
        Party party = new Party();

        party.setPartySize(10);
        party.setPartyName("fdsa");
        party.setPartyCost(500);
        party.setPartyType("HIBACHI");

        org.perschlar.edu.model.Party party1 = Mapper.partyMapperBe2Fe(party);

        Assert.assertEquals(party.getPartyCost(), party1.getPartyCost());
    }
}
