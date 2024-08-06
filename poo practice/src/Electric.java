public class Electric extends Car {
    int batteryCapacity;
    int range;
    int chargingTime;

    public Electric(String assembler, String model, double price, int batteryCapacity, int range, int chargingTime) {
        super(assembler, model, price);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
        this.chargingTime = chargingTime;
    }

    public void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Range: " + range);
        System.out.println("Charging Time: " + chargingTime);
    }

}
