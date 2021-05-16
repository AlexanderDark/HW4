package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class PersonalInfoPage extends BasePage{


    private final By sexList = By.cssSelector("#id_gender");
    private final By sex = By.cssSelector("option[value=\"m\"]");
    private final By firstName = By.cssSelector("#id_fname");
    private final By firstNameLatin = By.cssSelector("#id_fname_latin");
    private final By lastName = By.cssSelector("#id_lname");
    private final By lastNameLatin = By.cssSelector("#id_lname_latin");
    private final By blogName = By.cssSelector("#id_blog_name");
    private final By dateOfBirth = By.cssSelector("input[name='date_of_birth']");
    private final By countryList = By.xpath("//*[@data-ajax-slave='/lk/biography/cv/lookup/cities/by_country/']");
    private final By nameCountry = By.cssSelector("[title=\"Россия\"]");
    private final By cityList = By.cssSelector(".js-lk-cv-dependent-slave-city");
    private final By cityName = By.cssSelector("[title=\"Санкт-Петербург\"]");
    private final By engLevelList = By.xpath("//*[contains(text(),'Уровень')]//..//..//div//div");
    private final By engLevel = By.cssSelector("[title=\"Начальный уровень (Beginner)\"]");
    private final By company = By.cssSelector("#id_company");
    private final By workplace = By.cssSelector("#id_work");
    private final By contactTypeButton = By.cssSelector("div.lk-cv-block div[class*='input_straight-top-right'] span");
    private final By contactFbButton = By.xpath("//button[@title='Facebook']");
    private final By contactFbInput = By.cssSelector("input[name='contact-0-value']");
    private final By addContactButton = By.cssSelector("button[class*='js-lk-cv-custom-select-add']");
    private final By contactVkButton = By.xpath("//p[contains(text(), 'Контактная информация')]/..//div[contains(@class, 'js-formset-items')]/div[2]//button[@title='VK']");
    private final By contactVkInput = By.cssSelector("input[name='contact-1-value']");
    private final By contactDelete = By.xpath("//div[@class='lk-cv-block__input-alignment']/button[contains(text(), 'Удалить')]");
    private final By saveButton = By.cssSelector("[title=\"Сохранить и заполнить позже\"]");


    String URL = "https://otus.ru/lk/biography/personal/";

    public PersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    public void openPersInfoPage () {
        driver.get(URL);
        driver.get(URL);

        logger.info("Открыта страница с персональной информацией");

    }

    public void enterSex () {
        driver.findElement(sexList).click();
        driver.findElement(sex).click();
        logger.info("Введён пол");
    }

    public void enterFirstName () {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys("Пётр");
        logger.info("Введено имя");
    }

    public void enterFirstNameLatin () {
        driver.findElement(firstNameLatin).clear();
        driver.findElement(firstNameLatin).sendKeys("Peter");
        logger.info("Введено имя на латинском");
    }

    public void enterLastName () {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys("Петров");
        logger.info("Введена фамилия");
    }

    public void enterLastNameLatin () {
        driver.findElement(lastNameLatin).clear();
        driver.findElement(lastNameLatin).sendKeys("Petrov");
        logger.info("Введена фамилия на латинском");
    }

    public void enterBlogName () {
        driver.findElement(blogName).clear();
        driver.findElement(blogName).sendKeys("ПётрП");
        logger.info("Введено имя для блога");
    }
    
    public void enterDateOfBirth () {
        driver.findElement(dateOfBirth).clear();
        driver.findElement(dateOfBirth).sendKeys("03.01.1989" + Keys.ENTER);
        logger.info("Введена дата рождения");
    }
    
    public void enterCountry () {
        driver.findElement(countryList).click();
        driver.findElement(nameCountry).click();
        logger.info("Введена страна");
    }

    public void enterCity () {
        driver.findElement(cityList).click();
        driver.findElement(cityName).click();
        logger.info("Введён город");
    }

    public void enterEngLevel () {
        driver.findElement(engLevelList).click();
        driver.findElement(engLevel).click();
        logger.info("Введён уровень английского");
    }

    public void enterCompany () {
        driver.findElement(company).clear();
        driver.findElement(company).sendKeys("ГК Омега");
        logger.info("Введна компания");
    }

    public void enterWork () {
        driver.findElement(workplace).clear();
        driver.findElement(workplace).sendKeys("тестировщик");
        logger.info("Введена должность");
    }

    public void enterContactFB () {
        driver.findElement(contactTypeButton).click();
        driver.findElement(contactFbButton).click();
        driver.findElement(contactFbInput).sendKeys("FacebookName");
        logger.info("Введён контакт Фейсбук");
    }

    public void enterContactVK () {
        driver.findElement(addContactButton).click();
        driver.findElement(contactTypeButton).click();
        driver.findElement(contactVkButton).click();
        driver.findElement(contactVkInput).sendKeys("VKName");
        logger.info("Введён контакт VK");
    }

    public void clickSaveButton () {
        driver.findElement(saveButton).click();
        logger.info("Нажата кнопка Сохранить");
    }

    //Методы для получения значений полей
    public String getFirstNameValue() {
        return driver.findElement(firstName).getAttribute("value");
    }
    public String getFirstNameLatinValue () {
        return driver.findElement(firstNameLatin).getAttribute("value");
    }

    public String getLastNameValue() {
        return driver.findElement(lastName).getAttribute("value");
    }

    public String getLastNameLatinValue() {
        return driver.findElement(lastNameLatin).getAttribute("value");
    }

    public String getBlogNameValue() {
        return driver.findElement(blogName).getAttribute("value");
    }

    public String getDateOfBirthValue() {
        return driver.findElement(dateOfBirth).getAttribute("value");
    }

    public String getCountryValue() {
        return driver.findElement(countryList).getText();
    }

    public String getCityValue() {
        return driver.findElement(cityList).getText();
    }

    public String getEngLevelValue() {
        return driver.findElement(engLevelList).getText();
    }

    public String getContactFbValue() {
        return driver.findElement(contactFbInput).getAttribute("value");
    }

    public String getContactVkValue() {
        return driver.findElement(contactVkInput).getAttribute("value");
    }

    //мутод удаляет контакты со страницы персональных данных
    public void deleteContacts () {
        logger.info("Началось удаление контактов");
        for (int i = 0; i<driver.findElements(contactDelete).size(); i++) {
            if (isClickable(driver.findElements(contactDelete).get(i))) {
                driver.findElements(contactDelete).get(i).click();
                i--;
            }
        }
        logger.info("Удаление контактов окончилось успешно");
    }

    public boolean isClickable(WebElement webElement)
    {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
