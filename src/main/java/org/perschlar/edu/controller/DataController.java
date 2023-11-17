package org.perschlar.edu.controller;

import org.perschlar.edu.model.*;
import org.perschlar.edu.service.AuthService;
import org.perschlar.edu.service.ChefService;
import org.perschlar.edu.service.CustomerService;
import org.perschlar.edu.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:63342"}, methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/data")
public class DataController {

    @Autowired
    ChefService chefService;

    @Autowired
    CustomerService customerService;

    @Autowired
    PartyService partyService;



    @RequestMapping(value = "/chef", method = RequestMethod.GET)
    public List<Chef> getAllChef() {
        return chefService.getAllChef();

    }

    @RequestMapping(value = "/save/chef", method = RequestMethod.POST)
    public void saveChef(@RequestBody Chef chef) {
        chefService.saveChef(chef);
    }

    @RequestMapping(value = "/party", method = RequestMethod.GET)
    public List<Party> getAllParties() {
        return partyService.getAllParties();

    }

    @RequestMapping(value = "/save/party", method = RequestMethod.POST)
    public void saveParty(@RequestBody Party party) {
        partyService.saveParty(party);
    }

    @RequestMapping(value = "/order/{customerId}", method = RequestMethod.GET)
    public List<Order> getAllOrders(@PathVariable @NotNull String customerId) {
        return customerService.getAllOrdersForCustomer(customerId);
    }

    @RequestMapping(value = "/customer/{email}", method = RequestMethod.GET)
    public Customer getCustomerByEmail(@PathVariable @NotNull String email) {
        return customerService.getCustomerByEmail(email);
    }

    @RequestMapping(value = "/save/{customerId}/order", method = RequestMethod.POST)
    public void saveOrder(@RequestBody OrderReq orderReq, @PathVariable @NotNull String customerId) {
        customerService.saveOrderForCustomer(orderReq, customerId);
    }


    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.POST)
    public Customer getCustomerById(@PathVariable @NotNull String customerId) {
        return customerService.getCustomerById(customerId);
    }

}
