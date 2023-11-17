package org.perschlar.edu.util;

import org.perschlar.edu.model.Chef;
import org.perschlar.edu.model.Customer;
import org.perschlar.edu.model.Order;
import org.perschlar.edu.model.Party;
import org.springframework.util.StringUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Mapper {

    public static Party partyMapperBe2Fe(org.perschlar.edu.entity.Party party) {
        Party party1 = new Party();

        party1.setPartyCost(party.getPartyCost());
        party1.setPartyName(party.getPartyName());
        party1.setPartySize(party.getPartySize());
        party1.setPartyType(PartyType.valueOf(party.getPartyType()));

        return party1;
    }

    public static Customer customerMapperBe2Fe(org.perschlar.edu.entity.Customer customer) {
        Customer customer1 = new Customer();

        customer1.setAddressLine(customer.getAddressLine()).setCity(customer.getCity())
                .setEmail(customer.getEmail()).setFirstName(customer.getFirstName()).setCustomerId(customer.getCustomerId())
                .setLastName(customer.getLastName()).setState(customer.getState()).setZipcode(customer.getZipcode());

        return customer1;
    }

    public static org.perschlar.edu.entity.Customer customerMapperFe2Be(Customer customer) {
        org.perschlar.edu.entity.Customer customer1 = new org.perschlar.edu.entity.Customer();

        if (StringUtils.isEmpty(customer.getCustomerId())) {
            copyValue(customer, customer1);

            StringBuilder sb = new StringBuilder();
            sb.append(customer.getFirstName().charAt(0));
            sb.append(genRandom(10));
            sb.append(customer.getLastName().charAt(0));
            sb.append(genRandom(10));
            sb.append(genRandom(10));
            sb.append(genRandom(26) + 97);
            sb.append(genRandom(10));

            customer1.setCustomerId(sb.toString());
        } else {
            customer1.setCustomerId(customer.getCustomerId());
            copyValue(customer, customer1);
        }

        return customer1;
    }

    private static void copyValue(Customer customer, org.perschlar.edu.entity.Customer customer1) {
        customer1.setAddressLine(customer.getAddressLine());
        customer1.setCity(customer.getCity());
        customer1.setEmail(customer.getEmail());
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setState(customer.getState());
        customer1.setZipcode(customer.getZipcode());
    }

    private static int genRandom(int rand) {
        Random random = new Random();

        int rand_int = random.nextInt(rand);

        return rand_int;
    }

    public static Order orderMapperBe2Fe(org.perschlar.edu.entity.Order order) {
        Order order1 = new Order();

        order1.setOrderDate(dateConvert(order.getOrderDate())).setPartyDate(dateConvert(order.getPartyDate()))
                .setContactName(order.getContactName()).setPartySize(order.getPartySize()).setPartyType(PartyType.valueOf(order.getPartyType()))
                .setTotalCost(order.getTotalCost()).setStatus(Status.valueOf(order.getStatus()));

        return order1;
    }

    public static org.perschlar.edu.entity.Order orderMapperFe2Be(Order order) {
        org.perschlar.edu.entity.Order order1 = new org.perschlar.edu.entity.Order();

        order1.setOrderDate(dateRevert(order.getOrderDate()));
        order1.setPartyDate(dateRevert(order.getPartyDate()));
        order1.setContactName(order.getContactName());
        order1.setPartySize(order.getPartySize());
        order1.setPartyType(order.getPartyType().name());
        order1.setTotalCost(order.getTotalCost());
        order1.setStatus(order.getStatus().name());

        return order1;
    }

    public static Date dateConvert(java.sql.Date date) {
        return new Date(date.getTime());
    }

    public static java.sql.Date dateRevert(Date date) {
        return new java.sql.Date(date.getTime());
    }

    public static Chef chefMapperBe2Fe(org.perschlar.edu.entity.Chef chef) {
        Chef chef1 = new Chef();

        chef1.setChefName(chef.getChefName()).setLanguage(chef.getLanguage()).setSkill(chef.getSkill());

        return chef1;
    }

    public static org.perschlar.edu.entity.Chef chefMapperFe2Be(Chef chef) {
        org.perschlar.edu.entity.Chef chef1 = new org.perschlar.edu.entity.Chef();

        chef1.setChefName(chef.getChefName());
        chef1.setSkill(chef.getSkill());
        chef1.setLanguage(chef.getLanguage());
        return  chef1;
    }

    public static String genOrderId(Date date) {
        StringBuilder sb = new StringBuilder();

        sb.append("100");
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        sb.append(calendar.get(Calendar.YEAR));
        sb.append(calendar.get(Calendar.MONTH));
        sb.append(calendar.get(Calendar.DAY_OF_MONTH));
        sb.append(genRandom(10));
        sb.append(genRandom(10));
        sb.append(genRandom(10));

        return sb.toString();
    }
}
