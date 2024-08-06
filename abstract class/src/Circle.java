public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("Circle with radius " + radius);
    }
}
