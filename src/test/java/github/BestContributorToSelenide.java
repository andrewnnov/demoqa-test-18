package github;

import com.codeborne.selenide.Selectors;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().driverVersion("129.0.6668.101").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
    }

    @Test
    void andreySolntsevShouldBeTheFirstContributor() {
        open("https://github.com/selenide/selenide");
        $("div .Layout-sidebar")
                .$(byText("Contributors"))
                .closest(".BorderGrid-cell")
                .$("ul li").hover();
        $(".Popover").shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
