package org.perschlar.edu.service;


import org.perschlar.edu.model.Customer;
import org.perschlar.edu.model.Order;
import org.perschlar.edu.model.OrderReq;


import java.util.List;


public interface CustomerService {

    Customer getCustomerByEmail(String email);

    org.perschlar.edu.model.Customer getCustomerById(String customerId);

    List<Order> getAllOrdersForCustomer(String customerId);

    void saveCustomer(org.perschlar.edu.model.Customer customer);

    void saveOrderForCustomer(OrderReq order, String customerId);

}
