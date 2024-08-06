public class Dog extends Animal {
    public Dog(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

}
