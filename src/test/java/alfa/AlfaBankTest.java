package alfa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTest {

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().driverVersion("129.0.6668.101").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
    }

    @Test
    void testAlfa() {
        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        sleep(5000);
    }
}
