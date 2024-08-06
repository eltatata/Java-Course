package interfaces;

public interface Communicable {
    final String GREETING = "Hello!";
    
    static String getGreeting() {
        return GREETING;
    }

    void communicate();
}
