public class App {
    public static void main(String[] args) throws Exception {
        Persona person1 = new Persona();
        person1.name = "John";
        person1.lastName = "Doe";
        person1.age = 25;
        person1.email = "john@gmail.com";

        Career career1 = new Career();
        career1.name = "Software Developer";
        career1.description = "Develops software";
        career1.skills[0] = "Java";
        career1.skills[1] = "Python";
        career1.skills[2] = "JavaScript";
        career1.skills[3] = "C++";
        career1.skills[4] = "C#";
        career1.isPopular = true;
        career1.isStudent = false;

        person1.career = career1;

        Persona person2 = new Persona();
        person2.name = "Alice";
        person2.lastName = "Smith";
        person2.age = 17;
        person2.email = "alice@gmail.com";

        Career career2 = new Career();
        career2.name = "Data Analyst";
        career2.description = "Analyzes data";
        career2.skills[0] = "Python";
        career2.skills[1] = "R";
        career2.skills[2] = "SQL";
        career2.skills[3] = "Excel";
        career2.skills[4] = "Tableau";
        career2.isPopular = true;
        career2.isStudent = true;

        person2.career = career2;

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
    }
}
