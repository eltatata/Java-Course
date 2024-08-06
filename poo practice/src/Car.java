public class Car {
    int id;
    String assembler;
    String model;
    double price;
    private String owner;
    static int count;

    public Car(String assembler, String model, double price) {
        this.id = count + 1;
        this.assembler = assembler;
        this.model = model;
        this.price = price;
        count++;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Assembler: " + assembler);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Owner: " + getOwner());
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
