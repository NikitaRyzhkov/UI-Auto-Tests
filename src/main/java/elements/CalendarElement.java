package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CalendarElement {
    public final SelenideElement randomEvent = $x("//b[normalize-space(.)='Test event']");
    public final ElementsCollection weekDays = $$("span[rel=\"wkday\"] b");
}
