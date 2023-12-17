package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement searchInput = $(byXpath("//div[contains(@class,'header-search')]//input"));
    private SelenideElement submitButton = $(byXpath("//button[contains(@class,'search-form__submit')]"));

    public void inputStringForSearch(String input){
        searchInput.shouldBe(visible);
        searchInput.sendKeys(input);
    }

    public String getSubmitButtonText(){
        submitButton.shouldBe(visible);
        return submitButton.getText();
    }


}
