package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    protected static WebDriver driver;

    public static WebDriver createDriver (WebDriverType webDriverType) {
        switch (webDriverType) {
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case CHROME:

            case DEFAULT:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
}
