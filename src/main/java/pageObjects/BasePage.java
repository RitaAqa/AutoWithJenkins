package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void isElementPresentWithWait(By locator, int timeWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeWait));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
