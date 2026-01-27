//Day 4 - Q3

package oops.polymorphism;

public class Login {

    public void loginpage(){
        System.out.println("Please enter Username and Password.");
    }
    public void loginpage(String userName){
        System.out.println("Forgot Username or Password?");
    }
    public void loginpage(String userName, String password) {
        System.out.println("Login Successful.");
    }

    public static void main(String[] args){
        Login newUser = new Login();
        newUser.loginpage();
        newUser.loginpage("Tester");
        newUser.loginpage("Tester", "Password123");
    }
}