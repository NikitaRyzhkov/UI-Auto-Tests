import elements.CalendarElement;
import elements.LeftMenuElement;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.EventPage;
import pages.settings.TimeZonePage;

import java.util.List;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class LeftMenuTest extends SignIn {


    @Description("Выключить отображение персонального календаря. Ожидание: появление поп-ап")
    @Test
    public void turnOffCalendar(){
        LeftMenuElement leftMenuElement = new LeftMenuElement();
        leftMenuElement.clickUserCalendarBtn();
        leftMenuElement.popupCalendar.shouldBe(visible);
        leftMenuElement.clickUserCalendarBtn();
    }
    @Description("Создать событие с помощью кнопки в боковом меню. Ожидание: появление события в календаре")
    @Test
    public void createEvent(){
        LeftMenuElement menuElement = new LeftMenuElement();
        EventPage eventPage = new EventPage();
        CalendarElement calendarElement = new CalendarElement();

        menuElement.clickEventBtn();
        eventPage.inputName("Test event");
        eventPage.clickSaveBtn();
        calendarElement.randomEvent.shouldBe(visible);
    }
    @Description("Нажать кнопку \"+\". Ожидание: отображение выпадающего меню")
    @Test
    public void calendarActionsMenu(){
        LeftMenuElement menuElement = new LeftMenuElement();
        menuElement.clickCalendarActionsBtn();
        menuElement.calendarDropDownMenu.shouldBe(visible);
        menuElement.appsList.click();
    }
    @Description("Нажать кнопку \"три точки\". Ожидание: отображение выпадающего меню, наличие пункта \"Поделиться\"")
    @Test
    public void calendarSettingsMenu(){
        LeftMenuElement menuElement = new LeftMenuElement();
        menuElement.clickCalendarSettingsBtn();
        menuElement.calendarDropDownMenu.shouldBe(visible);
        menuElement.shareOption.shouldBe(visible);
        menuElement.appsList.click();
    }
    @Description("Скрыть и развернуть мини календарь")
    @Test
    public void hideNShowMiniCalendar(){
        LeftMenuElement menuElement = new LeftMenuElement();

        menuElement.clickHideMiniCalendarBtn();
        menuElement.miniCalendar.shouldNotBe(visible);

        menuElement.clickHideMiniCalendarBtn();
        menuElement.miniCalendar.shouldBe(visible);
    }
    @Description("Изменить отображаемый месяц на мини календаре")
    @Test
    public void changeMonth(){
        LeftMenuElement menuElement = new LeftMenuElement();
        String currentMonth = menuElement.monthName.getText();
        String currentSlot = menuElement.firstSlotMiniCalendar.getText();
        menuElement.clickNextMonthBtn();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(menuElement.monthName.getText(),currentMonth);
        softAssert.assertNotEquals(menuElement.firstSlotMiniCalendar.getText(),currentSlot);
        softAssert.assertAll();
    }
    @Description("Выбрать другой день на мини календаре. Ожидание: на основном календаре изменился период")
    @Test
    public void miniCalendarSlot(){
        LeftMenuElement menuElement = new LeftMenuElement();
        CalendarElement calendarElement = new CalendarElement();
        String slot = "15";
        menuElement.clickMiniCalendarSlot(slot);

        List<String> days = calendarElement.weekDays.texts();
        Assert.assertTrue(days.contains(slot));

    }
    @Description("Нажать кнопку изменения часового пояса. Ожидание: открытие окна \"Часовой пояс\"")
    @Test
    public void timeZone(){
        LeftMenuElement menuElement = new LeftMenuElement();
        TimeZonePage timeZonePage = new TimeZonePage();

        menuElement.clickTimeZoneBtn();
        timeZonePage.header.shouldBe(visible);
        timeZonePage.changeZoneBtn.shouldBe(enabled);
        timeZonePage.closeDialog();
    }

}
