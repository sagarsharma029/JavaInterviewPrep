//Day 2 - Q5

package qa_scenarios.utilities;

public final class ImmutableConfig {

    private final String browser;
    private final String baseURL;

    public String getBrowser(){
        return browser;
    }

    public String getBaseURL(){
        return baseURL;
    }

    public ImmutableConfig(String browser, String baseURL){
        this.baseURL = baseURL;
        this.browser = browser;
    }

    public void printConfig(){
        System.out.println("Browser   -> " + browser);
        System.out.println("Base URL - > " + baseURL);
    }

    public static void main(String[] args){
        ImmutableConfig config = new ImmutableConfig("Chrome", "https://baseURL.com");
        config.printConfig();
    }
}
