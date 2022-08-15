package loginPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseTest;

import java.time.Duration;


public class LoginIUAWithoutPatterns extends BaseTest {

    @Test(groups = "Positive")
    void loginIUA() {
        getDriver().get("http://passport.i.ua/login");


        WebElement loginField = getDriver().findElement(By.xpath("//*[@name='login']"));
        WebElement passField = getDriver().findElement(By.xpath("//*[@name='pass']"));
        WebElement submitBtn = getDriver().findElement(By.xpath("//*[@type='submit']"));

        loginField.sendKeys("testfort.summer2021@i.ua");
        passField.sendKeys("testfort2021");
        submitBtn.click();

        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://passport.i.ua/sections/']")));
    }

    @Test(groups = "Negative")
    void loginIUANegative() {
        getDriver().get("http://passport.i.ua/login");


        WebElement loginField = getDriver().findElement(By.xpath("//*[@name='login']"));
        WebElement passField = getDriver().findElement(By.xpath("//*[@name='pass']"));
        WebElement submitBtn = getDriver().findElement(By.xpath("//*[@type='submit']"));

        loginField.sendKeys("testfort.summer2021@i.ua");
        passField.sendKeys("testfort202");
        submitBtn.click();

        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='content clear']")));
    }

}

