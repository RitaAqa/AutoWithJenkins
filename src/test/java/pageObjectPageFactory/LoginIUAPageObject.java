package pageObjectPageFactory;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.IUALoginPage;

public class LoginIUAPageObject extends BaseTest {


    @Test
    void loginIUAPageObject() {
        getDriver().get("http://passport.i.ua/login");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());

        iuaLoginPage.login("testfort.summer2021@i.ua", "testfort2021");
        iuaLoginPage.isAccountBtnPresent();
    }

    @Test
    void loginIUAPageObjectNegative() {
        getDriver().get("http://passport.i.ua/login");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());

        iuaLoginPage.login("testfort.summer2021@i.ua", "testfort202");
        iuaLoginPage.isWrongLoginOrPasswordTextPresent();
    }

}
