public class Persona {
    private String name;
    private String lastName;
    private int age;
    private String email;
    Career career;

    public Persona(String name, String lastName, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.career = new Career();
    }

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
        System.out.println("Full Name: " + this.name + " " + this.lastName);
        System.out.println("Email: " + this.email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
}
