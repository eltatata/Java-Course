public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    public void printInfo() {
        System.out.println("Rectangle with width " + width + " and height " + height);
    }
}
