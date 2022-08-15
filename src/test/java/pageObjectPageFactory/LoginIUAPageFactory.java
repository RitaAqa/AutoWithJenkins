package pageObjectPageFactory;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.IUALoginPageFactory;

public class LoginIUAPageFactory extends BaseTest {

    @Test
    void pageFactory() {
        getDriver().get("http://passport.i.ua/login");
        IUALoginPageFactory iuaLoginPageFactory = new IUALoginPageFactory(getDriver());
        iuaLoginPageFactory.login("testfort.summer2021@i.ua", "testfort2021");
    }


    //add test
    @Test
    void testFour() {
        System.out.println("tesFour");
    }
}
