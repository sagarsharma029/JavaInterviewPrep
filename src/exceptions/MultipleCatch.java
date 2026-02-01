//Day 6 - Q4

package exceptions;

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20};
            System.out.println(arr[5]);
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }
}