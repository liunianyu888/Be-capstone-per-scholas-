package org.perschlar.edu.service.serviceImpl;

import org.perschlar.edu.entity.Party;
import org.perschlar.edu.model.Customer;
import org.perschlar.edu.model.Order;
import org.perschlar.edu.model.OrderReq;
import org.perschlar.edu.repository.CustomerRepository;
import org.perschlar.edu.repository.OrderRepository;
import org.perschlar.edu.repository.PartyRepository;
import org.perschlar.edu.service.CustomerService;
import org.perschlar.edu.util.Mapper;
import org.perschlar.edu.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    PartyRepository partyRepository;

    @Override
    public org.perschlar.edu.model.Customer getCustomerByEmail(String email) {
        org.perschlar.edu.entity.Customer customer = customerRepository.readCustomerByEmail(email);

        return Mapper.customerMapperBe2Fe(customer);
    }

    @Override
    public Customer getCustomerById(String customerId) {
        org.perschlar.edu.entity.Customer customer = customerRepository.readCustomerByEmail(customerId);

        return Mapper.customerMapperBe2Fe(customer);
    }

    @Override
    public List<Order> getAllOrdersForCustomer(String customerId) {
        List<org.perschlar.edu.entity.Order> orders = orderRepository.findOrdersByCustomerId(customerId);

        List<Order> orderList = new ArrayList<>();

        orders.forEach(order -> {
            orderList.add(Mapper.orderMapperBe2Fe(order));
        });

        return orderList;
    }

    @Override
    public void saveCustomer(org.perschlar.edu.model.Customer customer) {
        org.perschlar.edu.entity.Customer customer1 = Mapper.customerMapperFe2Be(customer);

        customerRepository.save(customer1);
    }

    @Override
    public void saveOrderForCustomer(OrderReq orderReq, String customerId) {
        org.perschlar.edu.entity.Order order1 = new org.perschlar.edu.entity.Order();

        order1.setPartyType(orderReq.getPartyType().name());

        order1.setPartySize(orderReq.getPartySize());

        order1.setPartyDate(Mapper.dateRevert(orderReq.getPartyDate()));

        order1.setContactName(orderReq.getContactName());

        order1.setCustomerId(customerId);
        Date curdate = new Date();

        order1.setOrderDate(Mapper.dateRevert(curdate));

        order1.setStatus(Status.PLACED.name());

        Party party = partyRepository.findPartyByPartyType(orderReq.getPartyType().name());

        order1.setTotalCost(party.getPartyCost() + orderReq.getPartySize() * 20);

        //gen orderId
        order1.setOrderId(Mapper.genOrderId(curdate));

        orderRepository.save(order1);
    }
}
