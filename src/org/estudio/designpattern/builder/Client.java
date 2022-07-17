package org.estudio.designpattern.builder;

import org.estudio.designpattern.builder.entity.Address;
import org.estudio.designpattern.builder.entity.User;
import org.estudio.designpattern.builder.product.IUserDTO;
import org.estudio.designpattern.builder.product.IUserDTOBuilder;
import org.estudio.designpattern.builder.product.UserWebDTOBuilder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        IUserDTOBuilder builder = new UserWebDTOBuilder();

        IUserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    //Method director return product
    public static IUserDTO directBuild(IUserDTOBuilder builder, User user) {
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

        //entity address
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
