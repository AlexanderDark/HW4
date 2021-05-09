import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterPrivateInfo {
    public static void enterContact (String contactType, String text, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            driver.findElement(By.cssSelector(".input.input_full.lk-cv-block__input.input_straight-bottom-right.input_straight-top-right.input_no-border-right.lk-cv-block__input_fake.lk-cv-block__input_select-fake.js-custom-select-presentation :last-of-type")).click();
            driver.findElement(By.cssSelector("[title=\""+contactType+"\"]")).click();
            driver.findElement(By.cssSelector("[name=\"contact-0-value\"]:last-of-type")).sendKeys(text);
            driver.findElement(By.cssSelector(".lk-cv-block__action.lk-cv-block__action_md-no-spacing.js-formset-add.js-lk-cv-custom-select-add")).click();
        } catch (Exception e) {
            driver.findElement(By.xpath("(//button[contains(., \"Удалить\")])[2]")).click();
            driver.findElement(By.xpath("//button[contains(., \"Добавить\")]")).click();
            driver.findElement(By.cssSelector(".input.input_full.lk-cv-block__input.input_straight-bottom-right.input_straight-top-right.input_no-border-right.lk-cv-block__input_fake.lk-cv-block__input_select-fake.js-custom-select-presentation :last-of-type")).click();
            driver.findElement(By.xpath("//div[@class='lk-cv-block__select-options lk-cv-block__select-options_left js-custom-select-options-container']//button[@title='Facebook'][normalize-space()='Facebook']")).click();
            driver.findElement(By.xpath("//input[@id='id_contact-1-value']")).sendKeys(text);
            driver.findElement(By.cssSelector(".lk-cv-block__action.lk-cv-block__action_md-no-spacing.js-formset-add.js-lk-cv-custom-select-add")).click();
        }
    }
    public static void enterSex (WebDriver driver) {
        driver.findElement(By.cssSelector("#id_gender")).click();
        driver.findElement(By.cssSelector("option[value=\"m\"]")).click();
    }
    public static void enterMainInfo (WebDriver driver) {
        //Поле Имя
        WebElement field = driver.findElement(By.cssSelector("#id_fname"));
        EnterText.enterText(field, "Иван");
        //Поле Имя латиницей
        field = driver.findElement(By.cssSelector("#id_fname_latin"));
        EnterText.enterText(field, "Ivan");
        //Поле Фамилия
        field = driver.findElement(By.cssSelector("#id_lname"));
        EnterText.enterText(field, "Иванов");
        //Поле Фамилия латиницей
        field = driver.findElement(By.cssSelector("#id_lname_latin"));
        EnterText.enterText(field, "Ivanov");
        //Поле Имя для блога
        field = driver.findElement(By.cssSelector("#id_blog_name"));
        EnterText.enterText(field, "Иван");
        //Поле Дата рождения
        field = driver.findElement(By.name("date_of_birth"));
        EnterText.enterText(field, "03.01.1989");
        field.sendKeys(Keys.ENTER);
        //Поле страна
        driver.findElement(By.cssSelector(".input.input_full.lk-cv-block__input.lk-cv-block__input_fake.lk-cv-block__input_select-fake.js-custom-select-presentation")).click();
        driver.findElement(By.cssSelector("[title=\"Россия\"]")).click();
        //Поле Город
        driver.findElement(By.xpath("//input[@data-title=\"Город\"]/../*[@class=\"input input_full lk-cv-block__input lk-cv-block__input_fake lk-cv-block__input_select-fake js-custom-select-presentation\"]")).click();
        driver.findElement(By.cssSelector("[title=\"Санкт-Петербург\"]")).click();
        //Поле знание английского
        driver.findElement(By.xpath("//input[@data-title=\"Уровень знания английского языка\"]/../*[@class=\"input input_full lk-cv-block__input lk-cv-block__input_fake lk-cv-block__input_select-fake js-custom-select-presentation\"]")).click();
        driver.findElement(By.cssSelector("[title=\"Начальный уровень (Beginner)\"]")).click();
        //Чекбокс полный день
        driver.findElement(By.xpath("//input[@title=\"Полный день\"]/../*[@class=\"checkbox__label lk-cv-block__text lk-cv-block__text_work-schedule\"]")).click();

        //Поле Компания
        field = driver.findElement(By.cssSelector("#id_company"));
        EnterText.enterText(field, "ГК Омега");
        //Поле должность
        field = driver.findElement(By.cssSelector("#id_work"));
        EnterText.enterText(field, "методист-аналитик");
    }
    public static void saveInfo (WebDriver driver) {
        driver.findElement(By.cssSelector("[title=\"Сохранить и заполнить позже\"]")).click();
    }
}
