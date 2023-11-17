package org.perschlar.edu.model;

public class UserFe {
    private String email;

    private String pw;

    public String getEmail() {
        return email;
    }

    public UserFe setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPw() {
        return pw;
    }

    public UserFe setPw(String pw) {
        this.pw = pw;
        return this;
    }
}
