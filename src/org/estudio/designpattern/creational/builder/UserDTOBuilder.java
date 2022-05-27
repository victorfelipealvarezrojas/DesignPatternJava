package org.estudio.designpattern.creational.builder;

import org.estudio.designpattern.creational.builder.entity.Address;

import java.time.LocalDate;

// Abstract builder:  nos permite hacer encadenamiento de métodos
// permitirán al usuario construir partes de nuestro objeto
// Builder también proporciona un método para ensamblar el objeto final
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fName);

    UserDTOBuilder withLastName(String lName);

    UserDTOBuilder withBirthDay(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    // method to assemble final product
    UserDTO build();

    // (optional) method to fetch already built object
    UserDTO getUserDTO();
}
