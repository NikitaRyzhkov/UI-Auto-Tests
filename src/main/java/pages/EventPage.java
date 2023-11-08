package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class EventPage {
    private final SelenideElement nameField = $("input[placeholder=\"Название события\"]"),
    saveBtn = $x("//span[normalize-space(.)='Сохранить']/..");
    public void inputName(String name){
        nameField.setValue(name);
    }
    public void clickSaveBtn(){
        saveBtn.click();
    }

}
