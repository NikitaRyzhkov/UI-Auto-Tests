package pages.settings;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TimeZonePage {
    private final SelenideElement closeDialogBtn = $(".zmdialog__close");
    public final SelenideElement header = $(byText("Часовой пояс")),
    changeZoneBtn = $(".zclsettings__timezone-action button");
    @Step
    public void closeDialog(){closeDialogBtn.click();}
}
