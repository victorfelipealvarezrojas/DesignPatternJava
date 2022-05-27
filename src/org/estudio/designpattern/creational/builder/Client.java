package org.estudio.designpattern.creational.builder;

import org.estudio.designpattern.creational.builder.UserDTO;
import org.estudio.designpattern.creational.builder.UserDTOBuilder;
import org.estudio.designpattern.creational.builder.UserWebDTOBuilder;
import org.estudio.designpattern.creational.builder.entity.Address;
import org.estudio.designpattern.creational.builder.entity.User;

import java.time.LocalDate;

// Director
public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    //Method director return product
    public static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDay(user.getBirthDay())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        //entity User
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
                address.setHouseNumber("100");
                address.setStreet("State Street");
                address.setCity("Pawnee");
                address.setState("Indiana");
                address.setZipcode("47998");
        user.setAddress(address);

        return user;
    }
}
