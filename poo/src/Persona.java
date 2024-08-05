public class Persona {
    String name;
    String lastName;
    int age;
    String email;
    Career career;

    public String sendGreeting(String name) {
        return "Hello, " + name + "! My name is " + this.name + " " + this.lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public boolean isStudent() {
        return career.isStudent;
    }

    public void printPerson() {
        System.out.println("Full Name: " + name + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Is Student: " + career.isStudent);
    }
}
