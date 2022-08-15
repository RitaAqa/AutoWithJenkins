package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IUALoginPage extends BasePage {


    private final By loginInput = By.xpath("//*[@name='login']");
    private final By passInput = By.xpath("//*[@name='pass']");
    private final By submitBtn = By.xpath("//*[@type='submit']");
    private final By accountBtn = By.xpath("//a[@href='https://passport.i.ua/sections/']");
    private final By wrongLoginOrPasswordText = By.xpath("//*[@class='content clear']");

    public IUALoginPage(WebDriver driver) {
        super(driver);
    }


    private void setLogin(String login) {
        sendKeys(loginInput, login);
    }

    private void setPassword(String password) {
        sendKeys(passInput, password);
    }

    private void clickSubmit() {
        click(submitBtn);
    }

    public void login(String login, String password) {
        setLogin(login);
        setPassword(password);
        clickSubmit();
    }

    public void isAccountBtnPresent() {
        isElementPresentWithWait(accountBtn, 5);
    }
    public void isWrongLoginOrPasswordTextPresent() {
        isElementPresentWithWait(wrongLoginOrPasswordText, 5);
    }

}

