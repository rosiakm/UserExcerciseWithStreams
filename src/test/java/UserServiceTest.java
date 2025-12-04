import lombok.extern.slf4j.Slf4j;
import models.User;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class UserServiceTest extends BaseTest{

    @Test
    public void addUserToListTest(){
        log.info("Running addUserToListTest");
        assertFalse(userService.getUserList().isEmpty());
    }

    @Test
    public void filterUsersByAgeOver30PositiveTest(){
        log.info("Running filterUsersByAgeOver30PositiveTest");
        List<User> users = userService.filterUsersByAgeOver30();
        assertEquals(1, users.size());
        assertEquals(2, users.get(0).getId());
        assertTrue(users.get(0).getAge() > 30);
    }

    @Test
    public void findUserByIdPositiveTest(){
        log.info("Running findUserByIdPositiveTest");
        Optional<User> user = userService.findUserById(2);
        assertFalse(user.isEmpty());
        assertEquals(2, user.get().getId());
    }

    @Test
    public void findUserByIdNegativeTest(){
        log.info("Running findUserByIdNegativeTest");
        Optional<User> user = userService.findUserById(3);
        assertTrue(user.isEmpty());
    }
}