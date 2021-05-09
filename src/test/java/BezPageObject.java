import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BezPageObject {
    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(BezPageObject.class);


    public void otusInfo() {
        driver.get("https://otus.ru");
    }

    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
