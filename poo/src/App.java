public class App {
    public static void main(String[] args) throws Exception {
        Persona person1 = new Persona("John", "Doe", 25, "ohn@gmail.com");
        person1.career.name = "Software Developer";
        person1.career.description = "Develops software";
        person1.career.skills[0] = "Java";
        person1.career.skills[1] = "Python";
        person1.career.skills[2] = "JavaScript";
        person1.career.skills[3] = "C++";
        person1.career.skills[4] = "C#";
        person1.career.isPopular = true;
        person1.career.isStudent = false;

        Persona person2 = new Persona("Alice", "Smith", 17, "ice@gmail.com");
        person2.career.name = "Data Analyst";
        person2.career.description = "Analyzes data";
        person2.career.skills[0] = "Python";
        person2.career.skills[1] = "R";
        person2.career.skills[2] = "SQL";
        person2.career.skills[3] = "Excel";
        person2.career.skills[4] = "Tableau";
        person2.career.isPopular = true;
        person2.career.isStudent = true;

        // ---

        // Methods
        System.out.println("\nMethods:");

        System.out.println("\nPerson 1:");
        System.out.println(person1.sendGreeting("Alice"));
        System.out.println("Is Adult: " + person1.isAdult());
        System.out.println("Is Student: " + person1.isStudent());
        person1.printPerson();
        person1.career.printSkills();

        System.out.println("\nPerson 2:");
        System.out.println(person2.sendGreeting("John"));
        System.out.println("Is Adult: " + person2.isAdult());
        System.out.println("Is Student: " + person2.isStudent());
        person2.printPerson();
        person2.career.printSkills();

        // ---

        // Getters and Setters
        System.out.println("\nGetters and Setters:");

        System.out.println("\nPerson 1:");
        System.out.println("Age: " + person1.getAge());
        person1.setAge(30);
        System.out.println("New age: " + person1.getAge());
        person1.setName("Jane");
        System.out.println("New name: " + person1.getName());

        System.out.println("\nPerson 2:");
        System.out.println("Age: " + person2.getAge());
        person2.setAge(20);
        System.out.println("New age: " + person2.getAge());
        person2.setName("Bob");
        System.out.println("New name: " + person2.getName());

        // ---

        // Animals and Inheritance
        System.out.println("\nAnimals:");

        Animal animal0 = new Animal("Animal", "Unknown", 0);
        Dog animal1 = new Dog("Dog", "Poodle", 11);
        Cat animal2 = new Cat("Cat", "Siamese", 8);
        
        animal0.printAnimal();
        animal0.makeSound();

        System.out.println();

        animal1.printAnimal();
        animal1.makeSound();

        System.out.println();

        animal2.printAnimal();
        animal2.makeSound();

        // ---

        // Static
        System.out.println("\nStatic:");

        System.out.println("Number of animals created: " + Animal.getCount());
    }
}
