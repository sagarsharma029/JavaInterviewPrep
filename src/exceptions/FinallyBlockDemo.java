//Day 7 - Q4

package exceptions;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }
}
