public class App {
    public static void main(String[] args) throws Exception {
        Car[] cars = new Car[12];
        
        cars[0] = new Electric("Tesla", "Model S", 100000, 100, 400, 1);
        cars[1] = new Electric("Tesla", "Model 3", 50000, 50, 300, 2);
        cars[2] = new Electric("Tesla", "Model X", 120000, 120, 500, 3);
        cars[3] = new Electric("Tesla", "Model Y", 60000, 60, 350, 4);
        cars[4] = new Electric("NIO", "ES8", 80000, 80, 450, 5);
        cars[5] = new Electric("NIO", "ES6", 70000, 70, 400, 6);
        cars[6] = new Gasoline("Toyota", "Corolla", 20000, 50, 10, 1);
        cars[7] = new Gasoline("Toyota", "Camry", 25000, 60, 12, 2);
        cars[8] = new Gasoline("Toyota", "RAV4", 30000, 70, 14, 3);
        cars[9] = new Gasoline("Toyota", "Highlander", 35000, 80, 16, 4);
        cars[10] = new Gasoline("Honda", "Civic", 18000, 45, 9, 5);
        cars[11] = new Gasoline("Honda", "Accord", 23000, 55, 11, 6);

        for (Car car : cars) {
            car.display();
            System.out.println();
        }

        System.out.println("Total count of cars: " + Car.count);

        System.out.println("\nEnter the Car ID to set the owner: ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.println("Enter the owner name: ");
        String owner = System.console().readLine();

        for (Car car : cars) {
            if (car.id == id) {
                car.setOwner(owner);
                System.out.println("Owner of the car with ID " + id + " is set to " + owner);
                System.out.println();
                car.display();
                break;
            }
        }
    }
}
