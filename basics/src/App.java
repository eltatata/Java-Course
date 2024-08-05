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
    }
}
