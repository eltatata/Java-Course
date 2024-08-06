import interfaces.Alimentable;
import interfaces.Communicable;

public class Octopus extends MarineCreatures implements Communicable, Alimentable {
    int numberOfTentacles;

    public Octopus(String name, int numberOfTentacles) {
        super(name);
        this.numberOfTentacles = numberOfTentacles;
    }

    @Override
    void swim() {
        System.out.println("Octopus swims in the ocean.");
    }

    @Override
    public void communicate() {
        System.out.println("Octopus communicates by changing colors.");
    }

    @Override
    public void eat() {
        System.out.println("Octopus eats fish and crabs.");
    }
}
