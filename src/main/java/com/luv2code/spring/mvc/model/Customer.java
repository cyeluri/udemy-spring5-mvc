package com.luv2code.spring.mvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;
    @NotNull(message = "Is Required")
    @Size(min = 1, message = "Is Required")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
