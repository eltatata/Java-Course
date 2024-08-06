public class App {
    public static void main(String[] args) throws Exception {
        double a = 10.5;
        int b = 0;
        int c;

        try {
            c = (int) a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        c = (int) a + b;
        System.out.println(c);

        c = (int) a - b;
        System.out.println(c);

        c = (int) a * b;
        System.out.println(c);
    }   
}
