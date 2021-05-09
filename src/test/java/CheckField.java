import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckField {
    public static void checkTextField (WebElement webElement, String text, WebDriver driver) {
        String valueOfField;
        valueOfField= webElement.getAttribute("value");
        if (valueOfField == null) {
            valueOfField = webElement.getText();
        }
        Assert.assertEquals(valueOfField, text);
    }
    //НЕ ЯСНО, КАК ПРОВЕРЯТЬ ЧЕКБОКСЫ: ЗНАЧЕНИЯ НЕ МЕНЯЮТСЯ,
 /*   public static void checkboxField (WebElement webElement, Boolean bool, WebDriver driver) {
        Assert.assertTrue(webElement.isSelected());
    }*/
}
