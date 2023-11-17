package org.perschlar.edu.service.serviceImpl;

import org.perschlar.edu.entity.User;
import org.perschlar.edu.model.UserFe;
import org.perschlar.edu.repository.AuthRepository;
import org.perschlar.edu.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthRepository authRepository;

    @Override
    public void save(UserFe user) {
        String pw =  passwordEncoder.encode(user.getPw());

        User user1 = new User();

        user1.setEmail(user.getEmail()).setPw(pw);

        authRepository.save(user1);
    }

    @Override
    public UserFe retrieve(String email) {
        UserFe userFe = new UserFe();
        User user = authRepository.getUserByEmail(email);
        userFe.setEmail(email).setPw(user.getPw());

        return userFe;
    }
}
