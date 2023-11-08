import org.testng.annotations.BeforeClass;
import pages.SignInPage;
import utils.User;

import static com.codeborne.selenide.Selenide.open;

public class SignIn extends BaseTest {

    @BeforeClass
    public void logIn() throws Exception{
        SignInPage signInPage = new SignInPage();
        User user = new User();

        open(SignInPage.SIGN_IN_URL);
        signInPage.inputLogin(user.getLogin());
        signInPage.clickNextBtn();
        signInPage.inputPassword(user.getPassword());
        signInPage.clickNextBtn();

    }





}
