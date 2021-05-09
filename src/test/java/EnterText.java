import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterText {
    public static void enterText (WebElement webElement, String text) {
        String valueOfField;
        valueOfField= webElement.getAttribute("value");
        if (valueOfField == "") {
            webElement.sendKeys(text);
        }
    }
}

