public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(8, 6);

        Figure[] figures = { circle, rectangle };

        for (Figure figure : figures) {
            figure.printInfo();
            System.out.println("Area: " + figure.area());
        }
    }
}
