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
    }
}
