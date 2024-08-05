import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String word = "programming";

        int maxAttempts = 20;
        int attempts = 0;
        boolean wordIsGuessed = false;

        char[] guessedChars = new char[word.length()];
        
        for (int i = 0; i < guessedChars.length; i++) {
            guessedChars[i] = '_';
        }

        while (!wordIsGuessed && attempts < maxAttempts) {
            System.out.println("Current guessed word: " + String.valueOf(guessedChars));
            System.out.printf("Attempts remaining: %d\n", maxAttempts - attempts);
            System.out.println("Enter a single character: ");
            char input = Character.toLowerCase(scanner.next().charAt(0));
            System.out.println("");

            if (input == '-') {
                break;
            }

            boolean found = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == input) {
                    guessedChars[i] = input;
                    found = true;
                }
            }

            if (!found) {
                attempts++;
                System.out.println("The character is not in the word.");
            }

            if (String.valueOf(guessedChars).equals(word)) {
                wordIsGuessed = true;
                System.out.println("Congratulations! You have guessed the word: " + word);
            }
        }

        if (!wordIsGuessed) {
            System.out.println("You have run out of attempts. The word was: " + word);
        }

        scanner.close();
    }
}
