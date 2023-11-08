package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CalendarElement {
    public final SelenideElement randomEvent = $x("//b[normalize-space(.)='abcdef1']");
}
