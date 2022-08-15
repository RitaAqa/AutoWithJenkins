package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUALoginPageFactory {

    private WebDriver driver;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginInput;

    @FindBy(xpath = "//*[@name='pass']")
    public WebElement passInput;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement submitBtn;

    @FindBy(xpath = "//a[@href='https://passport.i.ua/sections/']")
    public WebElement accountBtn;

    @FindBy(xpath = "//*[@class='content clear']")
    public WebElement wrongLoginOrPasswordText;

    public IUALoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void login(String login, String password) {
        loginInput.sendKeys(login);
        loginInput.sendKeys(password);
        submitBtn.click();
    }

    //add methods...


}
