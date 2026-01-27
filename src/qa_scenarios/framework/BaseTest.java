//Day 3 - Q5

package qa_scenarios.framework;

public class BaseTest {

    String userName = "Tester123";
    String password = "TestPassword";

    protected void setup(String uName, String pwd){
        this.userName = uName;
        this.password = pwd;

        System.out.println("Welcome " + uName);
    }
}
