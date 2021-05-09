import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
    public static void logInOtus (String name, String pass, WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        PagesActions pagesActions = new PagesActions();
        pagesActions.openPage("https://otus.ru", driver);
        driver.findElement(By.cssSelector(".header2__auth.js-open-modal")).click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".new-input.new-input_full.js-placeholder.js-input.js-required.js-remove-form-error.new-input_border-no.js-email-input:first-of-type")));
        } catch (Exception e) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".new-input.new-input_full.js-placeholder.js-input.js-required.js-remove-form-error.new-input_border-no.js-email-input:first-of-type")));
        }
        driver.findElement(By.cssSelector(".new-input.new-input_full.js-placeholder.js-input.js-required.js-remove-form-error.new-input_border-no.js-email-input:first-of-type")).sendKeys(name);
        driver.findElement(By.cssSelector(".new-input.new-input_full.js-placeholder.js-input.js-required.js-remove-form-error.new-input_border-no.js-psw-input")).sendKeys(pass);
        driver.findElement(By.cssSelector(".new-button.new-button_full.new-button_blue.new-button_md")).click();

    //pagesActions.enterText(webElement, name,driver);

    }
    public static void openInfo (WebDriver driver) {
        PagesActions pagesActions = new PagesActions();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            pagesActions.openPage("https://otus.ru/lk/biography/personal/", driver);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".select.lk-cv-block__input.lk-cv-block__input_3.lk-cv-block__input_md-4.js-lk-cv-custom-select")));
        } catch (Exception e) {
            pagesActions.openPage("https://otus.ru/lk/biography/personal/", driver);
        }

    }

}
