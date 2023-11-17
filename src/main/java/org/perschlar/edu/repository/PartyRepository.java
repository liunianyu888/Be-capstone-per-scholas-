package org.perschlar.edu.repository;

import org.perschlar.edu.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {
    Party findPartyByPartyType(String partyType);
}
