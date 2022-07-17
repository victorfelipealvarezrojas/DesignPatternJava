package org.estudio.designpattern.builder.product;

import org.estudio.designpattern.builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

//Proporcionará todas las implementaciones de métodos que construyen las partes de nuestro objeto
//También proporcionará un método que ensambla el objeto final
public class UserWebDTOBuilder implements IUserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private IUserDTO dto; //Product

    @Override
    public IUserDTOBuilder withFirstName(String fName) {
        this.firstName = fName;
        return this;
    }

    @Override
    public IUserDTOBuilder withLastName(String lName) {
        this.lastName = lName;
        return this;
    }

    @Override
    public IUserDTOBuilder withBirthDay(LocalDate date) {
        Period ageInYears = Period.between(date,LocalDate.now());
        age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public IUserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + " /n " + address.getCity() + " /n " + address.getState() + " " + address.getZipcode();
        return this;
    }

    @Override
    public IUserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public IUserDTO getUserDTO() {
        return dto;
    }
}
