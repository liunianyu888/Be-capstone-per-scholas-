package org.perschlar.edu.service.serviceImpl;

import org.perschlar.edu.entity.Chef;
import org.perschlar.edu.repository.ChefRepository;
import org.perschlar.edu.service.ChefService;
import org.perschlar.edu.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChefServiceImpl implements ChefService {

    @Autowired
    ChefRepository chefRepository;

    @Override
    public List<org.perschlar.edu.model.Chef> getAllChef() {

        List<Chef> chefs = chefRepository.findAll();

        List<org.perschlar.edu.model.Chef> chefList = new ArrayList<>();

        chefs.forEach(chef -> {
            chefList.add(Mapper.chefMapperBe2Fe(chef));
        });

        return chefList;
    }

    @Override
    public void saveChef(org.perschlar.edu.model.Chef chef) {

        chefRepository.save(Mapper.chefMapperFe2Be(chef));
    }
}
