import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the superheros party!");

        Set<String> superheros = new HashSet<>();

        superheros.add("Batman");
        superheros.add("Wonder Woman");
        superheros.add("Iron Man");
        superheros.add("Hulk");
        superheros.add("Flash");
        superheros.add("Batman");
        superheros.add("Aquaman");
        superheros.add("Superman");
        superheros.add("Spiderman");

        System.out.println("Superheros: " + superheros);

        if (superheros.contains("Batman")) {
            System.out.println("Batman is at the party!");
        }

        superheros.remove("Flash");
        if (!superheros.contains("Flash")) {
            System.out.println("\nFlash left the party!\n");
        }

        if (superheros.isEmpty()) {
            System.out.println("The party is over!");
        } else {
            System.out.println("Superheros: " + superheros + ", number of superheros: " + superheros.size());
        }

        superheros.remove("Batman");

        System.out.println("\nWho is still at the party?");
        for (String superhero : superheros) {
            System.out.println(superhero);
        }
    }
}
