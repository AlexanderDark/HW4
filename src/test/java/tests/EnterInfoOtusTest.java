package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.PersonalInfoPage;

public class EnterInfoOtusTest extends BaseTest {


    @Test
    public void mainOtusInfo () {
        MainPage mainPage = new MainPage(driver);
        PersonalInfoPage persInfoPage = new PersonalInfoPage(driver);
        mainPage.openOtus();
        mainPage.clickAuthButton();
        mainPage.fillAuthForm();
        mainPage.clickEnterOtus();
        persInfoPage.openPersInfoPage();
        persInfoPage.enterFirstName();
        persInfoPage.enterFirstNameLatin();
        persInfoPage.enterLastName();
        persInfoPage.enterLastNameLatin();
        persInfoPage.enterBlogName();
        persInfoPage.enterDateOfBirth();
        persInfoPage.enterCountry();
        persInfoPage.enterCity();
        persInfoPage.enterEngLevel();
        persInfoPage.enterContactFB();
        persInfoPage.enterContactVK();
        persInfoPage.enterSex();
        persInfoPage.enterCompany();
        persInfoPage.enterWork();
        persInfoPage.clickSaveButton();

        mainPage.deleteAllCookies();

        mainPage.openOtus();
        mainPage.clickAuthButton();
        mainPage.fillAuthForm();
        mainPage.clickEnterOtus();
        persInfoPage.openPersInfoPage();

        Assertions.assertEquals(persInfoPage.getFirstNameValue(),"Пётр");
        Assertions.assertEquals(persInfoPage.getFirstNameLatinValue(),"Peter");
        Assertions.assertEquals(persInfoPage.getLastNameValue(), "Петров");
        Assertions.assertEquals(persInfoPage.getLastNameLatinValue(),"Petrov");
        Assertions.assertEquals(persInfoPage.getBlogNameValue(),"ПётрП");
        Assertions.assertEquals(persInfoPage.getDateOfBirthValue(),"03.01.1989");
        Assertions.assertEquals(persInfoPage.getCountryValue(),"Россия");

        Assertions.assertEquals(persInfoPage.getCityValue(),"Санкт-Петербург");

        Assertions.assertEquals(persInfoPage.getEngLevelValue(),"Начальный уровень (Beginner)");
        Assertions.assertEquals(persInfoPage.getContactFbValue(),"FacebookName");
        Assertions.assertEquals(persInfoPage.getContactVkValue(),"VKName");



    }

}
//nesito7589@nobitcoin.net
//1234abcd