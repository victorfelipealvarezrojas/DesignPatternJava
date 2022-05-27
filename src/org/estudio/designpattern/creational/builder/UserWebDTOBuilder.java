package org.estudio.designpattern.creational.builder;

import org.estudio.designpattern.creational.builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDTO dto; //Product

    @Override
    public UserDTOBuilder withFirstName(String fName) {
        this.firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        this.lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate date) {
        Period ageInYears = Period.between(date,LocalDate.now());
        age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                       + " /n " + address.getCity() + " /n " + address.getState() + " " + address.getZipcode();
        return this;
    }

    //metodo que crea el producto final
    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;// Product
    }
}
