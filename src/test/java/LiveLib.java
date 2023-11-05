import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class LiveLib {

    final String BASE_URI = "https://www.livelib.ru/";

    @BeforeTest
    public void setup() {
        Configuration.baseUrl = BASE_URI;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;


    }

    @Test
    public void dropDown() {
        open(BASE_URI);
        $("summary")
                .click();
        $(".simplebar-content")
                .shouldBe(visible);
        $x("//li[@class=\"site-nav__item\"]//a[@href=\"/books\"]")
                .shouldHave(text("Что почитать"));
    }

    @Test
    public void whatToRead() {
        open(BASE_URI);
        $x("//li[@class=\"main-menu__item\"]//a[contains(text(),'Что почитать')]")
                .click();
        $("h1")
                .shouldHave(text("Что почитать"));
    }

    @Test
    public void genres() {
        open(BASE_URI);
        $x("//li[@class=\"main-menu__item\"]//a[@href=\"/genres\"]")
                .click();
        $("h1")
                .shouldHave(text("Все жанры"));
    }

    @Test
    public void authors() {
        open(BASE_URI);
        $x("//li[@class=\"main-menu__item\"]//a[@href=\"/authors\"]")
                .click();
        $("h1")
                .shouldHave(text("Авторы"));

    }

    @Test
    public void search() {
        open(BASE_URI);
        $x("//input[@data-result=\"search-res-block\"]")
                .setValue("123")
                .pressEnter();
        ElementsCollection elementsCollection = $$(".object-edition a.title");

        boolean hasText = false;
        for (SelenideElement e : elementsCollection) {
            if (e.getText().contains("123")) {
                hasText = true;
            }
            ;
        }
        Assert.assertTrue(hasText);
    }

    @Test
    public void bucket() {
        open(BASE_URI);
        $("a.book24-widget-basket-mini").click();
        $x("//div[@class=\"basket-desktop\"]//button").shouldHave(text("Корзина"));
    }


}
