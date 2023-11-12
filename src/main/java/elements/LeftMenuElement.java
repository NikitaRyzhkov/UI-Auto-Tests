package elements;

import com.codeborne.selenide.SelenideElement;

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

    public void clickUserCalendarBtn(){
        userCalendarBtn.click();
    }
    public void clickEventBtn(){
        eventBtn.click();
    }
    public void clickCalendarActionsBtn(){
        calendarActionsBtn.click();
    }

    /**
     * Кнопка скрыта. Перед нажатием на поле наводится курсор
     */
    public void clickCalendarSettingsBtn(){
        customCalendarLine.hover();
        calendarSettingsBtn.click();
    }
    public void clickHideMiniCalendarBtn(){
        hideMiniCalendarBtn.click();
    }
    public void clickNextMonthBtn(){
        nextMonthBtn.click();
    }
    public void clickMiniCalendarSlot(String day){
        $(byText(day)).click();
    }
    public void clickTimeZoneBtn(){
        timeZoneBtn.click();
    }

}