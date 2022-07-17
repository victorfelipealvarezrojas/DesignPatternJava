package org.estudio.designpattern.builder.product;

import org.estudio.designpattern.builder.entity.Address;

import java.time.LocalDate;

//El builder definirá métodos que permitirán al usuario construir partes de nuestro objeto.
public interface IUserDTOBuilder {
    IUserDTOBuilder withFirstName(String fName);

    IUserDTOBuilder withLastName(String lName);

    IUserDTOBuilder withBirthDay(LocalDate date);

    IUserDTOBuilder withAddress(Address address);

    // method to assemble final product
    IUserDTO build();

    IUserDTO getUserDTO();
}
