package org.perschlar.edu.repository;

import org.perschlar.edu.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer readCustomerByEmail(String email);

    Customer readCustomerByCustomerId(String customerId);

}
