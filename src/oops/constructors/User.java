//day 2 - Q4

package oops.constructors;

public class User {

     private String name;
     private int age;

     public User(){
         System.out.println("Default Constructor called.");
     }

     public User(String name, int age){
         System.out.println("Parameterized Constructor called.");
         this.name = name;
         this.age = age;
     }

     public void printUserDetails(){
         System.out.println("User Details:");
         System.out.println("Name -> " + name);
         System.out.println("Age -> " + age);
     }

    public static void main(String[] args) {

        User user1 = new User();
        user1.printUserDetails();

        User user2 = new User("Sagar", 26);
        user2.printUserDetails();
    }
}
