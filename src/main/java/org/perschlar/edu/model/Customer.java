package org.perschlar.edu.model;


public class Customer {
    private String email;

    private String firstName;

    private String lastName;

    private String addressLine;

    private String city;

    private String state;

    private String zipcode;

    private String customerId;

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public Customer setAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Customer setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Customer setState(String state) {
        this.state = state;
        return this;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Customer setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
