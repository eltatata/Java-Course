import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Hello world
        System.out.println("Hello, World!");

        // ---

        // Variables
        int number = 10;
        double decimal = 3.14;
        boolean flag = true;
        char character = 'A';

        System.out.println("Number: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Flag: " + flag);
        System.out.println("Character: " + character);

        // ---

        // String (text)
        String text = "Hello, World!";
        System.out.println("Text: " + text);

        int length = text.length();
        System.out.println("Length: " + length);

        char firstCharacter = text.charAt(0);
        System.out.println("First character: " + firstCharacter);

        String subString = text.substring(0, 5);
        System.out.println("SubString: " + subString);

        String lowerString = text.toLowerCase();
        System.out.println("Lower String: " + lowerString);

        String upperString = text.toUpperCase();
        System.out.println("Upper String: " + upperString);

        int index = text.indexOf("World");
        System.out.println("Index: " + index);

        String replace = text.replace("World", "Java");
        System.out.println("Replace: " + replace);

        boolean contains = text.contains("World");
        System.out.println("Contains: " + contains);

        String trim = "   Hello, World!   ";
        System.out.println("Trim: " + trim.trim());

        // ---

        // Operators
        // Arithmetic
        int a = 10, b = 5, c = 0;

        c = a + b;
        System.out.println("Sum: " + c);

        c = a - b;
        System.out.println("Subtraction: " + c);

        c = a * b;
        System.out.println("Multiplication: " + c);

        c = a / b;
        System.out.println("Division: " + c);

        c = a % b;
        System.out.println("Module: " + c);

        // Assignment
        c = a;
        System.out.println("Assignment: " + c);

        c += a;
        System.out.println("Sum and Assignment: " + c);

        c -= a;
        System.out.println("Rest and Assignment: " + c);

        c *= a;
        System.out.println("Multiplication and Assignment: " + c);

        c /= a;
        System.out.println("Division and Assignment: " + c);

        c %= a;
        System.out.println("Module and Assignment: " + c);

        // Increase and Decrement
        a++;
        System.out.println("Increase: " + a);

        b--;
        System.out.println("Decrement: " + b);

        // Comparison
        boolean result = a == b;
        System.out.println("Equality: " + result);

        result = a != b;
        System.out.println("Difference: " + result);

        result = a > b;
        System.out.println("Greater than: " + result);

        result = a < b;
        System.out.println("Less than: " + result);

        result = a >= b;
        System.out.println("Greater or equal than: " + result);

        result = a <= b;
        System.out.println("Less or equal than: " + result);

        // Logical
        boolean condition1 = true, condition2 = false;

        result = condition1 && condition2;
        System.out.println("AND: " + result);

        result = condition1 || condition2;
        System.out.println("OR: " + result);

        result = !condition1;
        System.out.println("NOT: " + result);

        // ---

        // Control structures
        // If Else
        int age = 59;

        if (age >= 18 && age <= 59) {
            System.out.println("You are an adult.");
        } else if (age >= 60) {
            System.out.println("You are a senior.");
        } else {
            System.out.println("You are a minor.");
        }

        // ---

        // Switch
        String animal = "Dog";

        switch (animal) {
            case "Dog":
                System.out.println("Bark!");
                break;
            case "Cat":
                System.out.println("Meow!");
                break;
            case "Cow":
                System.out.println("Moo!");
                break;
            case "Chicken":
                System.out.println("Cluck!");
                break;
            default:
                System.out.println("Unknown animal.");
                break;
        }

        // ---
        // PRATICE 1: Drink machine (console game)

        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the drink machine!");
        System.out.println("Select a drink:");
        System.out.println("1. Coke - $1.00");
        System.out.println("2. Pepsi - $1.50");
        System.out.println("3. Sprite - $0.75");
        System.out.println("4. Water - $0.50");
        System.out.println("5. Exit");

        System.out.print("Enter an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("You selected Coke. Please insert $1.00.");
                break;
            case 2:
                System.out.println("You selected Pepsi. Please insert $1.50.");
                break;
            case 3:
                System.out.println("You selected Sprite. Please insert $0.75.");
                break;
            case 4:
                System.out.println("You selected Water. Please insert $0.50.");
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();

        // ---

        // Loops
        // For
        System.out.println("For loop:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        String message = "This is a message.";
        for (int i = 0; i < message.length(); i++) {
            System.out.println("For loop message: " + message.charAt(i));
        }

        // While
        System.out.println("While loop:");
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        // Do While
        System.out.println("\nDo While loop:");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 10);
    }
}
