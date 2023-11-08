import elements.CalendarElement;
import elements.LeftMenuElement;
import org.testng.annotations.Test;
import pages.EventPage;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;

public class LeftMenuTest extends SignIn {

    @Test
    public void turnOffCalendar(){
        LeftMenuElement leftMenuElement = new LeftMenuElement();
        leftMenuElement.clickUserCalendarBtn();
        leftMenuElement.popupCalendar.shouldBe(visible);
    }
    @Test
    public void createEvent(){
        LeftMenuElement menuElement = new LeftMenuElement();
        EventPage eventPage = new EventPage();
        CalendarElement calendarElement = new CalendarElement();

        menuElement.clickEventBtn();
        eventPage.inputName("abcdef1");
        eventPage.clickSaveBtn();
        calendarElement.randomEvent.shouldBe(visible);
    }

}
