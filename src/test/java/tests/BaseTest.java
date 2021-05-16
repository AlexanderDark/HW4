package tests;

import driver.WebDriverFactory;
import driver.WebDriverType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.PersonalInfoPage;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    private final Logger logger = LogManager.getLogger();
    protected static WebDriver driver;

    public static WebDriverWait wait;


    @BeforeEach
    public void mainSetUp () {
        String name = Optional.ofNullable(System.getProperty("browser")).orElse("chrome");

        WebDriverType browserName = WebDriverType.findByName(name);
        driver = WebDriverFactory.createDriver(browserName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);


        MainPage mainPage = new MainPage(driver);
        PersonalInfoPage persInfoPage = new PersonalInfoPage(driver);
        mainPage.openOtus();
        mainPage.clickAuthButton();
        mainPage.fillAuthForm();
        mainPage.clickEnterOtus();
        persInfoPage.openPersInfoPage();
        persInfoPage.deleteContacts();
        persInfoPage.clickSaveButton();
        driver.manage().deleteAllCookies();
    }
    @AfterEach
    public void closeWebDriver () {
        /*if (driver != null) {
            driver.quit();
        }*/
        logger.info("Браузер закрыт");
    }
}
