//Day 3 - Q5

package qa_scenarios.framework;

public class LoginTest extends BaseTest {

    public void runTest() {

        setup("AdminUser", "Admin@123");
        System.out.println("Login successful");
    }

    public static void main(String[] args) {

        LoginTest test = new LoginTest();
        test.runTest();
    }
}