public class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getNombre() {
        return this.name;
    }

    public int getEdad() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.name + '\'' +
                ", edad=" + this.age +
                '}';
    }
}