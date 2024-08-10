public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("John Doe", "john@gmail.com", "hp_$ord_0054&pa_s");

        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
    }
}
