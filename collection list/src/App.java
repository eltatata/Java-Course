import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the superheros party!");

        LinkedList<String> superheros = new LinkedList<>();

        superheros.add("Batman");
        superheros.add("Wonder Woman");
        superheros.add("Iron Man");
        superheros.add("Hulk");
        superheros.add("Flash");
        superheros.add("Batman");
        superheros.add("Aquaman");
        superheros.add("Superman");
        superheros.add("Spiderman");

        System.out.println("\nSuperheros: " + superheros);

        if (superheros.contains("\nBatman")) {
            System.out.println("Batman is at the party!");
        }

        superheros.remove(1);
        if (!superheros.contains("Wonder Woman")) {
            System.out.println("\nWonder Woman left the party!\n");
        }

        superheros.remove(5);
        if (!superheros.contains("Iron Man")) {
            System.out.println("Iron Man left the party!\n");
        } else {
            System.out.println("Iron Man is still at the party! in " + superheros.indexOf("Iron Man") + " position\n");
        }

        System.out.println("Who is at 3rd position? " + superheros.get(3) + "\n");

        if (superheros.isEmpty()) {
            System.out.println("The party is over!");
        } else {
            System.out.println("Superheros: " + superheros + ", number of superheros: " + superheros.size());
        }

        superheros.remove("Batman");
        superheros.set(0, "Tony Stark");

        System.out.println("\nWho is still at the party?");
        for (String superhero : superheros) {
            System.out.println(superhero);
        }
    }
}
