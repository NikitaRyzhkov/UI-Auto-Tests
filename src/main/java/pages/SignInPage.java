package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    public static final String SIGN_IN_URL = "https://accounts.zoho.com/signin?servicename=ZohoCalendar&signupurl=https://www.zoho.com/calendar/signup.html";
    private final SelenideElement loginField = $("input#login_id"),
            passwordField = $("input#password"),
            nextBtn = $("button#nextbtn");

    public void inputLogin(String login) {
        loginField.setValue(login);
    }

    public void inputPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickNextBtn() {
        nextBtn.click();
    }
}
