public class Animal {
    private String name;
    private String species;
    private int age;
    static int count = 0;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        count++;
    }

    public void printAnimal() {
        System.out.println("Name: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Age: " + this.age);
    }

    public void makeSound() {
        System.out.println("Animal sound!");
    }

    public static int getCount() {
        return count;
    }
}
