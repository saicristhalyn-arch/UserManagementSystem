/**
 * Main class to demonstrate the UserManager functionality
 */
public class Main {
    public static void main(String[] args) {
        // Create a UserManager instance
        UserManager manager = new UserManager();

        // Add some users
        User user1 = new User(1, "John Doe", "john@example.com");
        User user2 = new User(2, "Jane Smith", "jane@example.com");
        User user3 = new User(3, "Bob Johnson", "bob@example.com");

        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(user3);

        System.out.println("=== All Users ===");
        for (User user : manager.getAllUsers()) {
            System.out.println(user);
        }

        System.out.println("\n=== Search by ID ===");
        User foundUser = manager.searchUserById(2);
        if (foundUser != null) {
            System.out.println("Found: " + foundUser);
        } else {
            System.out.println("User not found");
        }

        System.out.println("\n=== Search by Name ===");
        User foundByName = manager.searchUserByName("John Doe");
        if (foundByName != null) {
            System.out.println("Found: " + foundByName);
        } else {
            System.out.println("User not found");
        }

        System.out.println("\n=== Search by Email ===");
        User foundByEmail = manager.searchUserByEmail("bob@example.com");
        if (foundByEmail != null) {
            System.out.println("Found: " + foundByEmail);
        } else {
            System.out.println("User not found");
        }

        System.out.println("\n=== Remove User ===");
        boolean removed = manager.removeUserById(2);
        System.out.println("User removed: " + removed);
        System.out.println("Total users: " + manager.getUserCount());

        System.out.println("\n=== All Users After Removal ===");
        for (User user : manager.getAllUsers()) {
            System.out.println(user);
        }
    }
}
