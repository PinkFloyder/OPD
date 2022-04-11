package lesson1.task2;

public class RegistrationUser {

    public static void main(String[] args) throws Exception {
        final User user1 = new User("Leonid");
        final User user2 = new User("Ilya");
        MessageBroker.userRegistered(user1);
        MessageBroker.userRegistered(user2);
        MessageBroker.sendMessage("Leonid", 2000, "Hello man");
    }
}
