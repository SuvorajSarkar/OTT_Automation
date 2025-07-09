package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import Pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testResetPassword() {
        ForgotPasswordPage forgot = new ForgotPasswordPage(driver);
        forgot.resetPassword("your_email@example.com");
    }
}
