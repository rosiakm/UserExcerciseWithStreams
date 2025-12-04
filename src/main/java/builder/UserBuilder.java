package builder;

import com.github.javafaker.Faker;
import models.User;

public class UserBuilder {
    public static User createUser(int id, int age){
        Faker faker = new Faker();
        return User.builder()
                .id(id)
                .name(faker.name().username())
                .age(age)
                .email(faker.internet().emailAddress())
                .build();
    }
}
