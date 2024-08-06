public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void printAnimal() {
        System.out.println("Name: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Age: " + this.age);
    }

    public void makeSound() {
        System.out.println("Animal sound!");
    }
}
