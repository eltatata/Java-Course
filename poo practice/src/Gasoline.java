public class Gasoline extends Car {
    int fuelCapacity;
    int fuelConsumption;
    int fuelType;

    public Gasoline(String assembler, String model, double price, int fuelCapacity, int fuelConsumption, int fuelType) {
        super(assembler, model, price);
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
    }

    public void display() {
        super.display();
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("Fuel Type: " + fuelType);
    }

}
