package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginFunctionality() {
        LoginPage login = new LoginPage(driver);
        login.openLoginPage();
        login.login("your_email@example.com", "your_password");
    }
}
