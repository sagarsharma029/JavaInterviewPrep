//Day 7 - Q5

package qa_scenarios.framework;

public class RetryMechanismDemo {

    static void login() {
        throw new RuntimeException("Login failed");
    }

    public static void main(String[] args) {

        int maxRetries = 3;
        int attempt = 0;

        while (attempt < maxRetries) {
            try {
                attempt++;
                System.out.println("Attempt " + attempt);
                login();
                System.out.println("Login successful");
                break;
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                if (attempt == maxRetries) {
                    System.out.println("Max retry attempts reached");
                }
            }
        }
    }
}
