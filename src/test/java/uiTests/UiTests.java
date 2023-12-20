package uiTests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiTests extends BaseTest{

    @Test
    public void myTest(){
        mainPage.inputStringForSearch("Asus");
        Selenide.sleep(2000);
    }

    @Test
    public void myTest2(){
        Assert.assertEquals(mainPage.getSubmitButtonText(), "Знайти");
    }


}
