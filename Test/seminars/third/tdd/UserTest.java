package seminars.third.tdd;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("John", "123", false);
    }

    @Test
    void userCreationTest() {
        setUp();
        assertTrue(user.authenticate("John", "123"));
    }

    @Test
    void userCreationFailedTest() {
        setUp();
        assertFalse(user.authenticate("John", "1234"));
    }

    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        setUp();
        userRepository.addUser(user);
        assertFalse(userRepository.findByName(user.name));
    }

    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        setUp();
        user.authenticate("Peter", "223");
        userRepository.addUser(user);
        assertFalse(userRepository.findByName(user.name));
    }

    @Test
    void LogOutNotAdminTest() {

        UserRepository userRepository = new UserRepository();
        setUp();

        user.authenticate("John", "123");

        userRepository.addUser(user);

        userRepository.logoutSimpleUsers();

        assertFalse(user.isAuthenticate);

    }

    @Test
    void LogOutAdminFailTest() {

        User userAdmin = new User("admin", "123", true);
        UserRepository userRepository = new UserRepository();

        userAdmin.authenticate("admin","123");

        userRepository.addUser(userAdmin);

        userRepository.logoutSimpleUsers();

        assertTrue(userAdmin.isAuthenticate);

    }
}