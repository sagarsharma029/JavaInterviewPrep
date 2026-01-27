//Day 4 - Q4

package oops.abstraction;

abstract class Browser{
    abstract void launch();
    void exit(){
        System.out.println("Browser closed.");
    }
}

class ChromeBrowser extends Browser{

    @Override
    void launch() {
        System.out.println("Launching Chrome browser.");
    }
}

class FirefoxBrowser extends Browser{

    @Override
    void launch() {
        System.out.println("Launching Firefox browser.");
    }
}


public class AbstractBrowser {
    public static void main(String[] args){

        Browser browser1 = new ChromeBrowser();
        browser1.launch();
        browser1.exit();

        Browser browser2 = new FirefoxBrowser();
        browser2.launch();
        browser2.exit();
    }
}