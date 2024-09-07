package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {

    private static String browser = "Firefox";

    public static WebDriver getDriver () {
        switch (browser) {
            case "Firefox" : {
                return new FirefoxDriver();
            }

            case "Chrome" : {
                return new ChromeDriver();

            }

            case "Edge" : {
                return new EdgeDriver();
            }

            case "Safari": {
                return new SafariDriver();
            }
            default:{
                return new ChromeDriver();
            }
        }
    }

}
