//Day 1 - Q5

package qa_scenarios.utilities;

public class LoginTestData {

    private String username;
    private String password;
    private String environment;

    public LoginTestData(String uname, String pass, String env){
        this.username = uname;
        this.password = pass;
        this.environment = env;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getEnvironment(){
        return environment;
    }

    public void printLoginData(){
        System.out.println("Login Test Data");
        System.out.println("Username: " + username);
        System.out.println("Environment: " + environment);
    }

    public static void main(String[] args){
        LoginTestData data = new LoginTestData("adminUser", "admin@123", "QA");

        data.printLoginData();
    }
}
