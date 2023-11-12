package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class EventPage {
    private final SelenideElement nameField = $("input[placeholder=\"Название события\"]"),
                                  saveBtn = $x("//span[normalize-space(.)='Сохранить']/..");
    @Step
    public void inputName(String name){
        nameField.setValue(name);
    }
    @Step
    public void clickSaveBtn(){
        saveBtn.click();
    }

}
