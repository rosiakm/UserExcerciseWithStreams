package utils;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Getter
public class UserService {
    private List<User> userList = new ArrayList<>();

    public void addUserToList(User user){
        userList.add(user);
        log.info("User: {} is added to list", user.getName());
    }

    public List<User> filterUsersByAgeOver30(){
        return userList.stream()
                .filter(user -> user.getAge() > 30)
                .toList();
    }

    public Optional<User> findUserById(int id){
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

}
