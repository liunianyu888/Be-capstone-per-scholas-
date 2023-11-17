package org.perschlar.edu.controller;

import org.perschlar.edu.model.Customer;
import org.perschlar.edu.model.RegisterReq;
import org.perschlar.edu.model.UserFe;
import org.perschlar.edu.service.AuthService;
import org.perschlar.edu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.thymeleaf.util.StringUtils;

@RestController
@CrossOrigin(origins = {"http://localhost:63342"}, methods = {RequestMethod.GET, RequestMethod.POST})
public class WebController {

    @Autowired
    AuthService authService;

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer saveCustomer(@RequestBody RegisterReq registerReq) {
        customerService.saveCustomer(registerReq.getCustomer());
        //1. save pw
        //2. return customer by email
        UserFe userFe = new UserFe();

        userFe.setPw(registerReq.getPassword()).setEmail(registerReq.getCustomer().getEmail());
        authService.save(userFe);
        return customerService.getCustomerByEmail(registerReq.getCustomer().getEmail());
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer login(@RequestBody UserFe userFe) {
        UserFe userFe1 = authService.retrieve(userFe.getEmail());
        if (StringUtils.equals(userFe.getPw(), userFe1.getPw())) {
            return customerService.getCustomerByEmail(userFe.getEmail());
        } else {
            throw new BadCredentialsException("login failed");
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "html/info";
    }
}
