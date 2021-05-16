package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected Logger logger;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {

        this.driver = driver;
        logger = LogManager.getLogger(BasePage.class);
        wait = new WebDriverWait(driver, 5);
    }
    }


