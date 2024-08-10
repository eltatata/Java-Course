public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("John Doe", "john@gmail.com", PasswordUtils.hashPassword("hp_$ord_0054&pa_s"));

        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        if (PasswordUtils.verifyPassword("password123", user.getPassword())) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }

        if (PasswordUtils.verifyPassword("hp_$ord_0054&pa_s", user.getPassword())) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }
    }
}
