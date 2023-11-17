package org.perschlar.edu.service;


import org.perschlar.edu.model.Chef;

import java.util.List;


public interface ChefService {

    List<org.perschlar.edu.model.Chef> getAllChef();

    void saveChef(Chef chef);

}
