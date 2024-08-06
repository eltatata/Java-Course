public class Cat extends Animal {
    public Cat(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}
