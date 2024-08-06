import exceptions.ByCeroException;

public class App {
    public static void main(String[] args) throws Exception {
        double a = 10.5;
        int b = 0;
        int c;

        Calculator calculator = new Calculator();

        try {
            int result = calculator.divide((int) a, b);
            System.out.println(result);
        } catch (ByCeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Division is done with or without errors");
        }

        c = (int) a + b;
        System.out.println(c);

        c = (int) a - b;
        System.out.println(c);

        c = (int) a * b;
        System.out.println(c);
    }
}
