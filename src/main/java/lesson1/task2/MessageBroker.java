package lesson1.task2;

import com.sun.istack.internal.Nullable;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class MessageBroker {

    public static final Set<User> users = new HashSet<>();

    public static void userRegistered(final User user) throws Exception {
        if (user == null || user.getName() == null
                || user.getName().isEmpty() || userExist(user.getName())) {
            throw new Exception("User with this name is exist");
        }
        users.add(user);
    }

    public static void deleteUser(final User user) {
        users.removeIf(curUser -> curUser.getName().equals(user.getName()));
    }

    public static void sendMessage(@Nullable String username, final long mills, final String message) throws Exception {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        if (username == null || username.isEmpty()) {
            System.out.printf("Message for all users: %s", message);
        } else {
            if (userExist(username)) {
                System.out.printf("Message send to %s: %s", username, message);
            } else {
                throw new Exception("User don't exist");
            }
        }
    }

    private static boolean userExist(final String username) {
        return users.stream()
                .map(User::getName)
                .anyMatch(username::equals);
    }
}
