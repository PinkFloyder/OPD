package lesson2.task2;

import lesson1.task2.MessageBroker;
import lesson1.task2.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class MessageBrokerTest {

    private final User user1 = new User("Leonid");
    private final User user2 = new User("Ilya");

    @Before
    public void cleanUp() {
        MessageBroker.deleteUser(user1);
        MessageBroker.deleteUser(user2);
    }

    @Test
    public void userRegisteredTest() throws Exception {
        MessageBroker.userRegistered(user1);
        MessageBroker.userRegistered(user2);
        final Set<User> users = MessageBroker.users;
        assertEquals(2, users.size());
    }

    @Test(expected = Exception.class)
    public void userRegisteredErrorTest() throws Exception {
        final User user3 = new User("Leonid");
        MessageBroker.userRegistered(user1);
        MessageBroker.userRegistered(user3);
    }

    @Test(expected = Exception.class)
    public void sendMessageErrorTest() throws Exception {
        MessageBroker.sendMessage("userName",0, "Message");
    }

    @Test
    public void deleteUserTest() throws Exception {
        MessageBroker.userRegistered(user1);
        MessageBroker.userRegistered(user2);
        MessageBroker.deleteUser(user1);
        assertEquals(1, MessageBroker.users.size());
    }
}
