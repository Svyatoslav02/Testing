package uiTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;

public class Test extends BaseTest{

    @org.testng.annotations.Test
    public void myTest(){
        mainPage.inputStringForSearch("Asus");
        Selenide.sleep(2000);
    }

    @org.testng.annotations.Test
    public void myTest2(){
        Assert.assertEquals(mainPage.getSubmitButtonText(), "Знайти");
    }


}
