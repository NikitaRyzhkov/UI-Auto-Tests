package elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LeftMenuElement {
    private final SelenideElement appsCollapseBtn = $(".zmCollapseLhs"),
                                  userCalendarBtn = $(".zmTreeNode"),
                                  eventBtn = $x("//span[normalize-space(.)='Новое событие']//.."),
                                  calendarActionsBtn = $(".zmTreeTIcon"),
                                  calendarSettingsBtn = $x("//div/i[@class=\"zcli-menu\"]"),
                                  customCalendarLine = $(".zmTreeNode"),
                                  hideMiniCalendarBtn = $(".zcl_W20"),
                                  nextMonthBtn = $(".zcl_W20 svg"),
                                  timeZoneBtn = $(byText("Europe/Moscow"));
    public final SelenideElement appsList = $("ul.zmApps"),
                                 popupCalendar = $(".menubutton"),
                                 calendarDropDownMenu = $(".zmdd--main"),
                                 miniCalendar = $(".zcl_mc_dy"),
                                 shareOption = $x("//*[normalize-space(.)='Поделиться']"),
                                 monthName = $(".zcl_TXL span"),
                                 firstSlotMiniCalendar = $(".zcl_mCaldt li");
    public void clickAppsCollapseBtn(){
        appsCollapseBtn.click();
    }
    @Step
    public void clickUserCalendarBtn(){
        userCalendarBtn.click();
    }
    @Step
    public void clickEventBtn(){
        eventBtn.click();
    }
    @Step
    public void clickCalendarActionsBtn(){
        calendarActionsBtn.click();
    }

    /**
     * Кнопка скрыта. Перед нажатием на поле наводится курсор
     */
    @Step
    public void clickCalendarSettingsBtn(){
        customCalendarLine.hover();
        calendarSettingsBtn.click();
    }
    @Step
    public void clickHideMiniCalendarBtn(){
        hideMiniCalendarBtn.click();
    }
    @Step
    public void clickNextMonthBtn(){
        nextMonthBtn.click();
    }
    @Step
    public void clickMiniCalendarSlot(String day){
        $(byText(day)).click();
    }
    @Step
    public void clickTimeZoneBtn(){
        timeZoneBtn.click();
    }

}