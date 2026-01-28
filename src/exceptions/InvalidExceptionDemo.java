//Day 5 - Q4

package exceptions;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidExceptionDemo {
    public static void main(String[] args){

        int age = 13;

        try{
            if (age<18){
                throw new InvalidAgeException("Underage. Not Allowed.");
            }
            System.out.println("Eligible to vote");
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception - " + e.getMessage());
        }
        System.out.println("Running rest of the code...");
    }

}