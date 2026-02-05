//Day 7 - Q1

package exceptions;

public class ThrowsDemo {

    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
