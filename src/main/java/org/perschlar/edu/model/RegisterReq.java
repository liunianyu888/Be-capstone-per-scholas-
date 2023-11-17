package org.perschlar.edu.model;

public class RegisterReq {

    private String password;

    Customer customer;

    public String getPassword() {
        return password;
    }

    public RegisterReq setPassword(String password) {
        this.password = password;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public RegisterReq setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
}
