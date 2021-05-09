import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckInfo {
    public static void checkPrivateInfo (WebDriver driver) {
        WebElement field;
        //Проверка контакта
        field = driver.findElement(By.cssSelector("[name=\"contact-0-value\"]:last-of-type"));
        CheckField.checkTextField(field, "myFacebook", driver);
        //Проверка пола
        field = driver.findElement(By.cssSelector("#id_gender"));
        CheckField.checkTextField(field, "m", driver);
        // Проверка имени
        field = driver.findElement(By.cssSelector("#id_fname"));
        CheckField.checkTextField(field, "Иван", driver);
        // Проверка латинского имени
        field = driver.findElement(By.cssSelector("#id_fname_latin"));
        CheckField.checkTextField(field, "Ivan", driver);
        // Проверка лфамилии
        field = driver.findElement(By.cssSelector("#id_lname"));
        CheckField.checkTextField(field, "Иванов", driver);
        // Проверка латинской фамилии
        field = driver.findElement(By.cssSelector("#id_lname_latin"));
        CheckField.checkTextField(field, "Ivanov", driver);
        // Проверка Имя для блога
        field = driver.findElement(By.cssSelector("#id_blog_name"));
        CheckField.checkTextField(field, "Иван", driver);
        // Проверка Дата рождения
        field = driver.findElement(By.name("date_of_birth"));
        CheckField.checkTextField(field, "03.01.1989", driver);
        // Проверка ДСтрана
        field = driver.findElement(By.cssSelector(".input.input_full.lk-cv-block__input.lk-cv-block__input_fake.lk-cv-block__input_select-fake.js-custom-select-presentation"));
        CheckField.checkTextField(field, "Россия", driver);
        // Проверка Город
        field = driver.findElement(By.xpath("//input[@data-title=\"Город\"]/../*[@class=\"input input_full lk-cv-block__input lk-cv-block__input_fake lk-cv-block__input_select-fake js-custom-select-presentation\"]"));
        CheckField.checkTextField(field, "Санкт-Петербург", driver);
        // Проверка уровень англ
        field = driver.findElement(By.xpath("//input[@data-title=\"Уровень знания английского языка\"]/../*[@class=\"input input_full lk-cv-block__input lk-cv-block__input_fake lk-cv-block__input_select-fake js-custom-select-presentation\"]"));
        CheckField.checkTextField(field, "Начальный уровень (Beginner)", driver);
        // Проверка компания
        field = driver.findElement(By.cssSelector("#id_company"));
        CheckField.checkTextField(field, "ГК Омега", driver);
        // Проверка должность
        field = driver.findElement(By.cssSelector("#id_work"));
        CheckField.checkTextField(field, "методист-аналитик", driver);
        //field = driver.findElement(By.xpath("//input[@title=\"Полный день\"]/../*[@class=\"checkbox__label lk-cv-block__text lk-cv-block__text_work-schedule\"]"));
        //CheckField.checkboxField(field, true, driver);

    }
}
