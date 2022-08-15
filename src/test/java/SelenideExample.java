import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideExample {
    @Test
    void selenideTest() {
        Configuration.browser = "firefox";
        open("https://www.google.com/");
        $(By.xpath("//*[@name='q']")).sendKeys("testfort");
        //elem not exist; test case will fail; screenshot will be taken automatically
        $("#submit").should(visible);
    }
}
