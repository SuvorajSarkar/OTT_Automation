package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;

    By fullName = By.id("name");
    By email = By.id("email");
    By password = By.id("password");
    By mobile = By.id("mobile");
    By submitBtn = By.xpath("//button[@type='submit']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSignupPage() {
        driver.get("https://www.naukri.com/registration/createAccount");
    }

    public void register(String name, String emailId, String pwd, String mobileNo) {
        driver.findElement(fullName).sendKeys(name);
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(mobile).sendKeys(mobileNo);
        driver.findElement(submitBtn).click();
    }
}
