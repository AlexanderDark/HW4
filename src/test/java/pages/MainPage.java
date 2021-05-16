package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Optional;

public class MainPage extends BasePage{
    private static final String URL = "https://otus.ru";
    private final By authButton = By.cssSelector("button.header2__auth");
    private final By loginField = By.cssSelector("input[type=\"text\"]");
    private final By passwordField = By.cssSelector("input[placeholder=\"Введите пароль\"]");
    private final By enterButton = By.xpath("//*[contains(text(),'Войти')]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openOtus () {
        driver.get(URL);
        logger.info("Открыт сайт Otus");

    }

    public void clickAuthButton () {
        driver.findElement(authButton).click();
    }

    public void fillAuthForm () {
        String login = System.getProperty("login");
        String password = System.getProperty("password");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(loginField));
        } catch (TimeoutException exception) {
            logger.info("Поле Логин не кликабельно!!!");
        }
        driver.findElement(loginField).sendKeys(login);
        logger.info("Введён логин "+ login);
        driver.findElement(passwordField).sendKeys(password);
        logger.info("Введён пароль "+ password);
    }

    public void clickEnterOtus () {
        driver.findElement(enterButton).click();
        logger.info("Нажата кнопка 'войти'");
    }

    public void deleteAllCookies () {
        driver.manage().deleteAllCookies();
    }
}
