package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
    private WebDriver driver;

    @BeforeSuite
    protected void beforeSuite()  {
        System.out.println("before suite");
    }

    @BeforeTest
    protected void beforeTest()  {
        System.out.println("before test");
    }

    @BeforeClass
    protected void beforeClass()  {
        System.out.println("before class");
    }

    @BeforeMethod
    protected void setupDriver()  {
        //download web driver if we don't have it yet

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);
        setDriver(driver);
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


    @AfterMethod
    protected void closeDriver()  {
        driver.quit();
    }

    @AfterClass
    protected void afterClass()  {
        System.out.println("after class");
    }

    @AfterTest
    protected void  afterTest()  {
        System.out.println("after test");
    }

    @AfterSuite
    protected void  afterSuite()  {
        System.out.println("after suite");
    }
}
