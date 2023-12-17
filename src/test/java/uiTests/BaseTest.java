package uiTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.MainPage;

public class BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setupUI(){
        Selenide.open("https://rozetka.com.ua/ua/");
    }

    @AfterMethod
    public void after(){
        Selenide.closeWindow();
    }

}
