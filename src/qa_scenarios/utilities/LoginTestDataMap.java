//Day 5 - Q5

package qa_scenarios.utilities;

import java.util.*;

public class LoginTestDataMap {
    public static void main(String[] args) {

        Map<String, String> data = new HashMap<>();

        data.put("username", "Admin123");
        data.put("password", "Test123");

        String userName = data.get("username");

        System.out.println("Executing login test with " + userName);

        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}