import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    final String BASE_URI = "https://calendar.zoho.com/zc/wk";

    @BeforeClass
    public void setup() {
        Configuration.baseUrl = BASE_URI;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.timeout = 20000;
    }
}
