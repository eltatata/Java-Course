public class App {
    public static void main(String[] args) throws Exception {
        Octopus octopus = new Octopus("Octopus", 8);
        Dolphin dolphin = new Dolphin("Dolphin");

        octopus.swim();
        octopus.communicate();
        octopus.eat();

        dolphin.swim();
        dolphin.communicate();
        dolphin.eat();
    }
}
