package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LeftMenuElement {
    private final SelenideElement appsCollapseBtn = $(".zmCollapseLhs"),
            userCalendarBtn = $(".zmTreeNode"),
            eventBtn = $x("//span[normalize-space(.)='Новое событие']//..");


    public final SelenideElement appsList = $("ul.zmApps"),
            popupCalendar = $(".menubutton");
    public void clickAppsCollapseBtn(){
        appsCollapseBtn.click();
    }
    public void clickUserCalendarBtn(){
        userCalendarBtn.click();
    }
    public void clickEventBtn(){
        eventBtn.click();
    }

}