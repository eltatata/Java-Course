import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> people = Arrays.asList(
                new Persona("Ana", 23),
                new Persona("Luis", 30),
                new Persona("Carlos", 17),
                new Persona("Marta", 25));
        
        List<Persona> Over20 = people.stream()
            .filter(p -> p.getEdad() > 20)
            .collect(Collectors.toList());

        System.out.println("People over 20 years of age");
        Over20.forEach(System.out::println);

        List<String> NamesOver20 = people.stream()
            .filter(p -> p.getEdad() > 20)
            .map(Persona::getNombre)
            .collect(Collectors.toList());

        System.out.println("\nNames of people over 20 years old:");
        NamesOver20.forEach(System.out::println);

        Long count = people.stream().count();

        System.out.println("\nTotal number of people:");
        System.out.println(count);
    }
}
