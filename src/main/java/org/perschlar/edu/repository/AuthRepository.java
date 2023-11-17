package org.perschlar.edu.repository;

import org.perschlar.edu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<User, Long> {
    User getUserByEmail(String email);
}
