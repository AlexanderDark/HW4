import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class TestVvodaOtus {
    String login = System.getProperty("login");
    String pass = System.getProperty("pass");
    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(TestVvodaOtus.class);
    PagesActions pagesAction = new PagesActions();


    @Before
    public void mainSwtUp () {
        WebDriverType wDT;
        wDT = WebDriverType.CHROME;
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.createDriver(wDT);
        driver.manage().window().maximize();
        logger.info("Драйвер поднят!");
    }
    @Test
    public void mainOtusInfo () throws InterruptedException {
        WebDriverFactory factory = new WebDriverFactory();
        WebDriverType wDT;
        wDT = WebDriverType.CHROME;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LogIn.logInOtus(login, pass, driver);
        logger.info("Авторизация прошла успешно");
        LogIn.openInfo(driver);
        logger.info("Переход на страницу с личной информацией прошёл успешно");
        EnterPrivateInfo.enterContact("Facebook", "myFacebook", driver);
        logger.info("Ввод контакта прошёл успешно");
        EnterPrivateInfo.enterSex(driver);
        logger.info ("Ввод пола прошёл успешно");
        EnterPrivateInfo.enterMainInfo(driver);
        logger.info("Ввод остальной информации прошёл успешно");
        EnterPrivateInfo.saveInfo(driver);
        logger.info("Сохранение введённой информации прошёл успешно");
        WebDriverFactory.closeDriver(driver);
        logger.info("Браузер закрыт");
        driver = factory.createDriver(wDT);
        logger.info("Открыт чистый браузер");
        LogIn.logInOtus(login, pass, driver);
        logger.info("Авторизация прошла успешно");
        LogIn.openInfo(driver);
        logger.info("Переход на страницу с личной информацией прошёл успешно");
        CheckInfo.checkPrivateInfo(driver);
        logger.info("Информация на странице соответствует введённой");
    }
    @After
    public void closeWebDriver () {
       WebDriverFactory.closeDriver(driver);
       logger.info("Браузер закрыть");
    }
}
//nesito7589@nobitcoin.net
//1234abcd