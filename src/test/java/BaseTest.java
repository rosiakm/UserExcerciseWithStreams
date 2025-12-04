import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utils.UserService;

import static builder.UserBuilder.createUser;

@Slf4j
public class BaseTest {

    protected static UserService userService;

    @BeforeAll
    public static void setupUserService(){
        userService = new UserService();
        log.info("New UserService instance has been created");
        userService.addUserToList(createUser(1, 30));
        log.info("User: {} is added to the list", userService.getUserList().get(0).getName());
        userService.addUserToList(createUser(2, 31));
        log.info("User: {} is added to the list", userService.getUserList().get(1).getName());
    }

    @AfterAll
    public static void tearDown(){
        userService = null;
        log.info("Test is finished");
    }
}
