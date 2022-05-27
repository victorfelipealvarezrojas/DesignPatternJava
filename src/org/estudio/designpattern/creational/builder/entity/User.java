package org.estudio.designpattern.creational.builder.entity;

import org.estudio.designpattern.creational.builder.Dto.entity.Address;

import java.time.LocalDate;

// entity class
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Address address;

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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthday(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
