import java.util.TreeSet;

class UserRegistration {
    private TreeSet<String> users;

    public UserRegistration() {
        users = new TreeSet<>();
    }

    public boolean registerUser(String userName) {
        return users.add(userName);
    }

    public boolean removeUser(String userName) {
        return users.remove(userName);
    }

    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No registered users.");
        } else {
            System.out.println("Registered Users:");
            for (String user : users) {
                System.out.println("- " + user);
            }
        }
    }
}


public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        // Register users
        registration.registerUser("Alice");
        registration.registerUser("Bob");
        registration.registerUser("Charlie");

        // Display users
        registration.displayUsers();

        // Remove a user
        registration.removeUser("Bob");

        // Display users again
        registration.displayUsers();
    }
}
