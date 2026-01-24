//Day 3 - Q3

package oops.inheritance;

public class LoginPage {

    public void login(){
        System.out.println("PARENT CLASS");
    }
}

 class SignUp extends LoginPage{

    @Override
    public void login(){
        System.out.println("CHILD CLASS");
    }
}

class LoginTest{
    public static void main(String[] args){

        LoginPage a = new LoginPage();
        a.login();

        LoginPage b = new SignUp();
        b.login();
    }
}