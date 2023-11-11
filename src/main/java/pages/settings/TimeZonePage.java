package pages.settings;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TimeZonePage {
    private final SelenideElement closeDialogBtn = $(".zmdialog__close");
    public final SelenideElement header = $(byText("Часовой пояс")),
    changeZoneBtn = $(".zclsettings__timezone-action button");
    public void closeDialog(){closeDialogBtn.click();}
}
