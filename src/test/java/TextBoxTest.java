import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxTest {

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().driverVersion("129.0.6668.101").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        Configuration.browserSize = "3140x2100";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        Selenide.open("/text-box");
        $("[id=userName]").setValue("Alex Timosh");
        $("[id=userEmail]").setValue("AlexTim@google.com");
        $("[id=currentAddress]").setValue("Paris");
        $("#permanentAddress").setValue("London");
        $("#submit").click();

        $("#output").shouldHave(
                text("Alex Timosh"),
                text("AlexTim@google.com"),
                text("Paris"),
                text("London"));
    }
}
