package org.perschlar.edu.service;

import org.perschlar.edu.entity.User;
import org.perschlar.edu.model.UserFe;


public interface AuthService {
    void save(UserFe user);

    UserFe retrieve(String email);
}
