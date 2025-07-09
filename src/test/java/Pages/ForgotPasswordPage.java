package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;

    By forgotLink = By.linkText("Forgot Password?");
    By emailInput = By.id("email");
    By continueBtn = By.xpath("//button[@type='submit']");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void resetPassword(String email) {
        driver.get("https://www.naukri.com/forgot-password");
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(continueBtn).click();
    }
}
