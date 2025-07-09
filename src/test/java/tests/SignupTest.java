package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import Pages.SignupPage;

public class SignupTest extends BaseTest {

    @Test
    public void testSignupFlow() {
        SignupPage signup = new SignupPage(driver);
        signup.openSignupPage();
        signup.register("Suvaraj", "test123@mail.com", "testpass123", "9123456789");
    }
}
