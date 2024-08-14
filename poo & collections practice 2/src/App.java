import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, User> users = new TreeMap<>();

        System.out.println("Welcome to the system");

        while (true) {
            System.out.println("\nWhat you want to do?");
            System.out.println("1 - Login");
            System.out.println("2 - Register");
            System.out.println("3 - Exit");

            System.out.print("Choose an option: ");
            String option = System.console().readLine();
            if (option.equals("3")) {
                break;
            }
            System.out.println();

            if (option.equals("1")) {
                System.out.println("Enter your email:");
                String email = System.console().readLine();
                System.out.println("Enter your password:");
                String password = System.console().readLine();

                if (users.containsKey(email)) {
                    User user = users.get(email);
                    if (PasswordUtils.verifyPassword(password, user.getPassword())) {
                        System.out.println("Login successful");
                        System.out.println("Welcome " + user.getName());
                        System.out.println("Your email is " + user.getEmail());
                        System.out.println("Your password is " + user.getPassword());
                    } else {
                        System.out.println("Invalid password");
                    }
                } else {
                    System.out.println("User not found, please register");
                }

            } else if (option.equals("2")) {
                System.out.println("Enter your name:");
                String name = System.console().readLine();
                System.out.println("Enter your email:");
                String email = System.console().readLine();
                System.out.println("Enter your password:");
                String password = System.console().readLine();

                if (users.containsKey(email)) {
                    System.out.println("User already exists");
                    continue;
                }

                User user = new User(name, email, PasswordUtils.hashPassword(password));
                users.put(email, user);

                System.out.println("User registered successfully");
            } else {
                System.out.println("Invalid option");
            }
        }

        System.out.println("\nGoodbye\n");

        System.out.println("Users:");
        for (User user : users.values()) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}
