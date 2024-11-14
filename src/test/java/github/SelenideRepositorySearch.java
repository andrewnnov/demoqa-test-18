package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().driverVersion("129.0.6668.101").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
    }

    @Test
    void shouldFindSelenideRepositoryTheTop() {
        open("https://github.com/");
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list] div h3 a").first().click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
