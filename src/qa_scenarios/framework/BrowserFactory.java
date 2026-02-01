//Day 6 - Q5
package qa_scenarios.framework;

import java.util.HashMap;
import java.util.Map;

interface Browser {
    void open();
}

class ChromeBrowser implements Browser {
    public void open() {
        System.out.println("Opening Chrome Browser");
    }
}

class FirefoxBrowser implements Browser {
    public void open() {
        System.out.println("Opening Firefox Browser");
    }
}

public class BrowserFactory {

    private static Map<String, Browser> browserMap = new HashMap<>();

    static {
        browserMap.put("chrome", new ChromeBrowser());
        browserMap.put("firefox", new FirefoxBrowser());
    }

    public static Browser getBrowser(String browserName) {
        return browserMap.get(browserName.toLowerCase());
    }

    public static void main(String[] args) {

        Browser browser1 = BrowserFactory.getBrowser("chrome");
        browser1.open();

        Browser browser2 = BrowserFactory.getBrowser("firefox");
        browser2.open();
    }
}