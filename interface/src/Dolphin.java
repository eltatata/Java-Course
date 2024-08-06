import interfaces.Alimentable;
import interfaces.Communicable;

public class Dolphin extends MarineCreatures implements Communicable, Alimentable {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Dolphin swims in the ocean.");
    }

    @Override
    public void communicate() {
        System.out.println("Dolphin communicates with whistles and clicks.");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eats fish and squids.");
    }
}
